public class PilaLlena {

    static int capacidad = 3;
    static int tope = 2; 
    public static boolean pila_llena() {
        return (tope == capacidad - 1);
    }

    public static void main(String[] args) {

        System.out.println("¿Pila llena? " + pila_llena());

        // Simulamos que se libera un espacio
        tope = 1;

        System.out.println("¿Pila llena? " + pila_llena());
    }
}