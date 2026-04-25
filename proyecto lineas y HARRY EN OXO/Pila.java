package lineas;

public class Pila {
    private char[] datos;
    private int tope;

    public Pila(int tamaño) {
        datos = new char[tamaño];
        tope = -1;
    }

    public void push(char c) {
        if (tope < datos.length - 1) {
            datos[++tope] = c;
        }
    }

    public char pop() {
        if (tope >= 0) {
            return datos[tope--];
        }
        return '\0';
    }

    public boolean estaVacia() {
        return tope == -1;
    }
    public class Parentesis {
        public static void main(String[] args) {
            String exp = "(3+4)*(2+1)";
            Pila pila = new Pila(exp.length());

            boolean balanceado = true;

            for (char c : exp.toCharArray()) {
                if (c == '(') pila.push(c);
                if (c == ')') {
                    if (pila.estaVacia()) {
                        balanceado = false;
                        break;
                    }
                    pila.pop();
                }
            }

            if (!pila.estaVacia()) balanceado = false;

            System.out.println("Expresión: " + exp);
            System.out.println("Balanceado: " + balanceado);
        }
    }
}

