public class Stack {

    private String[] elementos;
    private int tope;
    private int capacidad;

    public Stack(int capacidad) {
        this.capacidad = capacidad;
        elementos = new String[capacidad];
        tope = -1;
    }

    public void push(String elemento) {
        if (isFull()) {
            System.out.println("La pila está llena.");
            return;
        }

        tope++;
        elementos[tope] = elemento;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }

        String elemento = elementos[tope];
        elementos[tope] = null;
        tope--;

        return elemento;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }

        return elementos[tope];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public boolean isFull() {
        return tope == capacidad - 1;
    }

    public int size() {
        return tope + 1;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Contenido de la pila:");

        for (int i = tope; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}