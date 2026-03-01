public class SumaArreglo {

    public static int suma(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + suma(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};

        System.out.println("Suma del arreglo: " + suma(numeros, 0));
    }
}