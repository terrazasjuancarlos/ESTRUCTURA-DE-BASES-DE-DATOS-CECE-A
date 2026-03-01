//1) Multiplicar dos números usando suma recursiva
public class Multi {

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -multiplicar(a, -b);
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        int resultado = multiplicar(5, 3);
        System.out.println("Resultado: " + resultado);
    }