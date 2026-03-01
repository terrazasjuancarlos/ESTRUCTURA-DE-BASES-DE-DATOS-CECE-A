public class MultiplicacionRecursiva2 {

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        System.out.println("Resultado: " + multiplicar(a, b));
    }
}