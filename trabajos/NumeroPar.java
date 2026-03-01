public class NumeroPar {

    public static boolean esPar(int n) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        return esPar(n - 2);
    }

    public static void main(String[] args) {
        int numero = 7;

        if (esPar(numero)) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
    }
}