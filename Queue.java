public class Queue {

    private String[] elementos;
    private int frente;
    private int finalCola;
    private int cantidad;
    private int capacidad;

    public Queue(int capacidad) {
        this.capacidad = capacidad;
        elementos = new String[capacidad];

        frente = 0;
        finalCola = -1;
        cantidad = 0;
    }

    public void enqueue(String elemento) {
        if (isFull()) {
            System.out.println("La cola está llena.");
            return;
        }

        finalCola = (finalCola + 1) % capacidad;
        elementos[finalCola] = elemento;
        cantidad++;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }

        String elemento = elementos[frente];

        elementos[frente] = null;
        frente = (frente + 1) % capacidad;

        cantidad--;

        return elemento;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }

        return elementos[frente];
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == capacidad;
    }

    public int size() {
        return cantidad;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }

        System.out.println("Contenido de la cola:");

        int indice = frente;

        for (int i = 0; i < cantidad; i++) {

            System.out.println(elementos[indice]);

            indice = (indice + 1) % capacidad;
        }
    }
}