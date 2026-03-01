import java.util.Scanner;

public class Torre {

    public static void hanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
        } else {
            hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            hanoi(n - 1, auxiliar, origen, destino);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de discos: ");
        int n = sc.nextInt();

        hanoi(n, 'A', 'B', 'C');
    }
}