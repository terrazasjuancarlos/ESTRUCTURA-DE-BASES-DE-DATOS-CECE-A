package papa2;


public class Arboles{

    public static NodoArbol2 Raiz = null;
    public static int cuenta = 0;
    public static int total = 0;

    // Crear nodo
    public static NodoArbol2 CreaNodo(int clave) {
        NodoArbol2 nvo = new NodoArbol2();
        nvo.claveart = clave;
        nvo.LD = null;
        nvo.LI = null;
        return nvo;
    }

    // Insertar en ABB
    public static boolean InsertaABB(int clave, NodoArbol2 nodo) {
        if (clave < nodo.claveart) {
            if (nodo.LI == null) {
                nodo.LI = CreaNodo(clave);
                System.out.println("Se inserto " + clave);
                return true;
            } else {
                return InsertaABB(clave, nodo.LI);
            }
        } else if (clave > nodo.claveart) {
            if (nodo.LD == null) {
                nodo.LD = CreaNodo(clave);
                System.out.println("Se inserto " + clave);
                return true;
            } else {
                return InsertaABB(clave, nodo.LD);
            }
        }
        return false;
    }

    // Buscar
    public static boolean Busca(int dato, NodoArbol2 nodo) {
        if (nodo != null) {
            if (nodo.claveart == dato) {
                return true;
            } else if (dato > nodo.claveart) {
                return Busca(dato, nodo.LD);
            } else {
                return Busca(dato, nodo.LI);
            }
        }
        return false;
    }

    // Recorrido inorden
    public static void inorden(NodoArbol2 nodo) {
        if (nodo != null) {
            inorden(nodo.LI);
            System.out.println(nodo.claveart);
            cuenta++;
            inorden(nodo.LD);
        }
    }

    // Preorden
    public static void preorden(NodoArbol2 nodo) {
        if (nodo != null) {
            System.out.println(nodo.claveart);
            preorden(nodo.LI);
            preorden(nodo.LD);
        }
    }

    // Postorden
    public static void postorden(NodoArbol2 nodo) {
        if (nodo != null) {
            postorden(nodo.LI);
            postorden(nodo.LD);
            System.out.println(nodo.claveart);
        }
    }

    // Suma de nodos
    public static void suma(NodoArbol2 nodo) {
        if (nodo != null) {
            suma(nodo.LI);
            total += nodo.claveart;
            suma(nodo.LD);
        }
    }

    public static void main(String args[]) {

        // Crear raiz
        Raiz = CreaNodo(80);
        System.out.println("Se inserto " + Raiz.claveart);

        // Insertar datos
        InsertaABB(90, Raiz);
        InsertaABB(50, Raiz);
        InsertaABB(55, Raiz);
        InsertaABB(70, Raiz);
        InsertaABB(35, Raiz);
        InsertaABB(100, Raiz);
        InsertaABB(115, Raiz);
        InsertaABB(65, Raiz);
        InsertaABB(45, Raiz);
        InsertaABB(120, Raiz);
        InsertaABB(95, Raiz);
        InsertaABB(40, Raiz);

        // Recorridos
        System.out.println("\nRecorrido Inorden:");
        inorden(Raiz);

        System.out.println("Cantidad de nodos: " + cuenta);

        System.out.println("\nRecorrido Preorden:");
        preorden(Raiz);

        System.out.println("\nRecorrido Postorden:");
        postorden(Raiz);

        // Suma
        suma(Raiz);
        System.out.println("\nSuma total: " + total);
    }
}