public class Palindromo {

    public static boolean esPalindromo(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return esPalindromo(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {
        String palabra = "reconocer";

        if (esPalindromo(palabra, 0, palabra.length() - 1)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}