public class PilaVacia {

    static int tope = -1;  // -1 indica pila vacía

    public static boolean pila_vacia() {
        return (tope == -1);
    }

    public static void main(String[] args) {

        System.out.println("¿Pila vacía? " + pila_vacia());

        // Simulamos que se agrega un elemento
        tope = 0;

        System.out.println("¿Pila vacía? " + pila_vacia());
    }
}