public class HashTable {

    private Entrada[] tabla;
    private int capacidad;

    private class Entrada {

        String clave;
        String valor;
        Entrada siguiente;

        public Entrada(String clave, String valor) {
            this.clave = clave;
            this.valor = valor;
            this.siguiente = null;
        }
    }

    public HashTable(int capacidad) {
        this.capacidad = capacidad;
        tabla = new Entrada[capacidad];
    }

    private int hash(String clave) {

        int hash = 0;

        for (int i = 0; i < clave.length(); i++) {
            hash = hash + clave.charAt(i);
        }

        return hash % capacidad;
    }

    public void put(String clave, String valor) {

        int indice = hash(clave);

        Entrada actual = tabla[indice];

        while (actual != null) {

            if (actual.clave.equals(clave)) {

                actual.valor = valor;
                return;
            }

            actual = actual.siguiente;
        }

        Entrada nuevaEntrada = new Entrada(clave, valor);

        nuevaEntrada.siguiente = tabla[indice];

        tabla[indice] = nuevaEntrada;
    }

    public String get(String clave) {

        int indice = hash(clave);

        Entrada actual = tabla[indice];

        while (actual != null) {

            if (actual.clave.equals(clave)) {
                return actual.valor;
            }

            actual = actual.siguiente;
        }

        return null;
    }

    public boolean containsKey(String clave) {

        int indice = hash(clave);

        Entrada actual = tabla[indice];

        while (actual != null) {

            if (actual.clave.equals(clave)) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    public boolean remove(String clave) {

        int indice = hash(clave);

        Entrada actual = tabla[indice];

        Entrada anterior = null;

        while (actual != null) {

            if (actual.clave.equals(clave)) {

                if (anterior == null) {

                    tabla[indice] = actual.siguiente;

                } else {

                    anterior.siguiente = actual.siguiente;
                }

                return true;
            }

            anterior = actual;

            actual = actual.siguiente;
        }

        return false;
    }

    public void mostrar() {

        System.out.println("Contenido de la tabla hash:");

        for (int i = 0; i < capacidad; i++) {

            System.out.print("Posición " + i + ": ");

            Entrada actual = tabla[i];

            if (actual == null) {

                System.out.println("vacía");

            } else {

                while (actual != null) {

                    System.out.print(
                        "[" + actual.clave + " = " + actual.valor + "]"
                    );

                    if (actual.siguiente != null) {
                        System.out.print(" -> ");
                    }

                    actual = actual.siguiente;
                }

                System.out.println();
            }
        }
    }
}