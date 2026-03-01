public class EspiralRecursiva {

    static int valor = 1;

    public static void llenarEspiral(int[][] matriz, int filaInicio, int filaFin, int colInicio, int colFin) {

        // Caso base
        if (filaInicio > filaFin || colInicio > colFin) {
            return;
        }

        // Fila superior
        for (int i = colInicio; i <= colFin; i++) {
            matriz[filaInicio][i] = valor++;
        }

        // Columna derecha
        for (int i = filaInicio + 1; i <= filaFin; i++) {
            matriz[i][colFin] = valor++;
        }

        // Fila inferior
        if (filaInicio < filaFin) {
            for (int i = colFin - 1; i >= colInicio; i--) {
                matriz[filaFin][i] = valor++;
            }
        }

        // Columna izquierda
        if (colInicio < colFin) {
            for (int i = filaFin - 1; i > filaInicio; i--) {
                matriz[i][colInicio] = valor++;
            }
        }

        // Llamada recursiva reduciendo límites
        llenarEspiral(matriz, filaInicio + 1, filaFin - 1, colInicio + 1, colFin - 1);
    }

    public static void imprimir(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5; // tamaño de la matriz
        int[][] matriz = new int[n][n];

        llenarEspiral(matriz, 0, n - 1, 0, n - 1);

        imprimir(matriz);
    }
}