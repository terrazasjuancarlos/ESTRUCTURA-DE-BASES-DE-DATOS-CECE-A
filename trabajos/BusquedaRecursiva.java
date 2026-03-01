public class BusquedaRecursiva {

    public static boolean buscar(int[] arr, int index, int valor) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == valor) {
            return true;
        }
        return buscar(arr, index + 1, valor);
    }

    public static void main(String[] args) {
        int[] datos = {3, 7, 9, 12, 15};
        int valor = 9;

        if (buscar(datos, 0, valor)) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}