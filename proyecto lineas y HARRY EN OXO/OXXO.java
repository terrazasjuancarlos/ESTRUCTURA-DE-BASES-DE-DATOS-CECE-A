	package lineas;
	class Cola {
	    private String[] nombres;
	    private int[] edades;
	    private int frente, fin;
	
	    public Cola(int tamaño) {
	        nombres = new String[tamaño];
	        edades = new int[tamaño];
	        frente = 0;
	        fin = -1;
	    }
	
	    public void enqueue(String nombre, int edad) {
	        nombres[++fin] = nombre;
	        edades[fin] = edad;
	    }
	
	    public void dequeue() {
	        frente++;
	    }
	
	    public String frontNombre() {
	        return nombres[frente];
	    }
	
	    public int frontEdad() {
	        return edades[frente];
	    }
	
	    public boolean isEmpty() {
	        return frente > fin;
	    }
	}
	public class OXXO {
	    public static void main(String[] args) {
	
	        Cola fila1 = new Cola(10);
	        Cola fila2 = new Cola(10);
	
	        fila1.enqueue("Pedro", 20);
	        fila1.enqueue("Juan", 15);
	
	        fila2.enqueue("Luis", 18);
	        fila2.enqueue("Uriel", 29);
	
	        while (!fila1.isEmpty() || !fila2.isEmpty()) {
	
	            if (fila1.isEmpty()) {
	                System.out.println(fila2.frontNombre() + " " + fila2.frontEdad());
	                fila2.dequeue();
	            } else if (fila2.isEmpty()) {
	                System.out.println(fila1.frontNombre() + " " + fila1.frontEdad());
	                fila1.dequeue();
	            } else {
	                if (fila1.frontEdad() <= fila2.frontEdad()) {
	                    System.out.println(fila1.frontNombre() + " " + fila1.frontEdad());
	                    fila1.dequeue();
	                } else {
	                    System.out.println(fila2.frontNombre() + " " + fila2.frontEdad());
	                    fila2.dequeue();
	                }
	            }
	        }
	    }
	}