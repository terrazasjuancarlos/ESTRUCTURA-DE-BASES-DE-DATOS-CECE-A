package lineas;


public class Arbol {
	class Nodo {
	    int dato;
	    Nodo izq, der;

	    public Nodo(int d) {
	        dato = d;
	        izq = der = null;
	    }
	}
    Nodo raiz;

    public Nodo insertar(Nodo r, int d) {
        if (r == null) return new Nodo(d);

        if (d < r.dato)
            r.izq = insertar(r.izq, d);
        else
            r.der = insertar(r.der, d);

        return r;
    }

    public boolean buscar(Nodo r, int d) {
        if (r == null) return false;
        if (r.dato == d) return true;

        if (d < r.dato)
            return buscar(r.izq, d);
        else
            return buscar(r.der, d);
    }

    public void inorden(Nodo r) {
        if (r != null) {
            inorden(r.izq);
            System.out.print(r.dato + " ");
            inorden(r.der);
        }
    }
    public class MainArbol {
        public static void main(String[] args) {
            Arbol a = new Arbol();

            a.raiz = a.insertar(a.raiz, 50);
            a.insertar(a.raiz, 30);
            a.insertar(a.raiz, 70);

            a.inorden(a.raiz);
            System.out.println("\nBuscar 30: " + a.buscar(a.raiz, 30));
        }
    }
}
