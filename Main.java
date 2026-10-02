public class Main {

    public static void main(String[] args) {

        System.out.println("PRUEBA DE STACK");

        Stack pila = new Stack(5);

        pila.push("Token1");
        pila.push("Token2");
        pila.push("Token3");

        pila.mostrar();

        System.out.println();

        System.out.println(
            "Elemento en el tope: " + pila.peek()
        );

        System.out.println(
            "Elemento eliminado: " + pila.pop()
        );

        System.out.println();

        pila.mostrar();

        System.out.println(
            "Tamaño de la pila: " + pila.size()
        );


        System.out.println();
        System.out.println("PRUEBA DE QUEUE");

        Queue cola = new Queue(5);

        cola.enqueue("Token A");
        cola.enqueue("Token B");
        cola.enqueue("Token C");

        cola.mostrar();

        System.out.println();

        System.out.println(
            "Primer elemento: " + cola.peek()
        );

        System.out.println(
            "Elemento eliminado: " + cola.dequeue()
        );

        System.out.println();

        cola.mostrar();

        System.out.println(
            "Tamaño de la cola: " + cola.size()
        );


        System.out.println();
        System.out.println("PRUEBA DE HASH TABLE");

        HashTable tabla = new HashTable(10);

        tabla.put("x", "int");
        tabla.put("nombre", "String");
        tabla.put("contador", "int");
        tabla.put("resultado", "double");

        tabla.mostrar();

        System.out.println();

        System.out.println(
            "Valor asociado a x: "
            + tabla.get("x")
        );

        System.out.println(
            "Valor asociado a nombre: "
            + tabla.get("nombre")
        );

        System.out.println();

        System.out.println(
            "¿Existe contador?: "
            + tabla.containsKey("contador")
        );

        System.out.println(
            "¿Existe edad?: "
            + tabla.containsKey("edad")
        );

        System.out.println();

        System.out.println(
            "Eliminando contador..."
        );

        tabla.remove("contador");

        tabla.mostrar();

        System.out.println();

        System.out.println(
            "¿Existe contador?: "
            + tabla.containsKey("contador")
        );
    }
}
