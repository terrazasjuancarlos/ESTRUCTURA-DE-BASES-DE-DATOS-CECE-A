package lineas;

class Nodo {
    String nombre, telefono;
    Nodo siguiente;

    public Nodo(String n, String t) {
        nombre = n;
        telefono = t;
        siguiente = null;
    }
}
class Lista {
    Nodo cabeza;

    public void agregar(String n, String t) {
        Nodo nuevo = new Nodo(n, t);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void mostrar() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.nombre + " - " + aux.telefono);
            aux = aux.siguiente;
        }
    }

    public void buscar(String nombre) {
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.nombre.equals(nombre)) {
                System.out.println("Encontrado: " + aux.telefono);
                return;
            }
            aux = aux.siguiente;
        }
        System.out.println("No encontrado");
    }
}
public class Agenda {
    public static void main(String[] args) {
        Lista agenda = new Lista();

        agenda.agregar("Juan", "123");
        agenda.agregar("Ana", "456");

        agenda.mostrar();
        agenda.buscar("Juan");
    }
}
