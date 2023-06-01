import java.util.Scanner;

public class ListaCincoExCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nFunção para imprimir número informado pelo usuário");

        int numero;

        System.out.println("\nDigite um número: ");
        numero = scanner.nextInt();

        imprimirNumeroInformadoUsuário(numero);
        scanner.close();
    }

    public static void imprimirNumeroInformadoUsuário(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}