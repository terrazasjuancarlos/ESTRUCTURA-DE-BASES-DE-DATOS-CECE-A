package monos;

public class Arbol {

    static class Nodo {
        int dato;
        Nodo izquierdo;
        Nodo derecho;

        public Nodo(int dato) {
            this.dato = dato;
            izquierdo = derecho = null;
        }
    }

    // 🔹 Buscar nodo
    public static Nodo buscarNodo(Nodo raiz, int valor) {
        if (raiz == null) return null;

        if (raiz.dato == valor) return raiz;

        Nodo izq = buscarNodo(raiz.izquierdo, valor);
        if (izq != null) return izq;

        return buscarNodo(raiz.derecho, valor);
    }

    // 🔹 Obtener nivel
    public static int obtenerNivel(Nodo raiz, int valor, int nivel) {
        if (raiz == null) return -1;

        if (raiz.dato == valor) return nivel;

        int nivelIzq = obtenerNivel(raiz.izquierdo, valor, nivel + 1);
        if (nivelIzq != -1) return nivelIzq;

        return obtenerNivel(raiz.derecho, valor, nivel + 1);
    }

    // 🔹 Tipo de nodo
    public static String tipoNodo(Nodo raiz, int valor) {
        Nodo nodo = buscarNodo(raiz, valor);

        if (nodo == null) return "No existe";

        if (nodo == raiz) return "Raíz";

        if (nodo.izquierdo == null && nodo.derecho == null) {
            return "Hoja";
        }

        return "Intermedio";
    }

    // 🔹 MAIN DE PRUEBA
    public static void main(String[] args) {

        Nodo raiz = new Nodo(10);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(15);
        raiz.izquierdo.izquierdo = new Nodo(3);
        raiz.izquierdo.derecho = new Nodo(7);

        int valor = 7;

        int nivel = obtenerNivel(raiz, valor, 0);
        String tipo = tipoNodo(raiz, valor);

        System.out.println("Nodo: " + valor);
        System.out.println("Nivel: " + nivel);
        System.out.println("Tipo: " + tipo);
    }
}
