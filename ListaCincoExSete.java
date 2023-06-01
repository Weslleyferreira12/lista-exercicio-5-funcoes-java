import java.util.Scanner;

public class ListaCincoExSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFunção para identificar se o número é positivo ou negativo");

        double numeroUm;

        System.out.println("\nInforme um número: ");
        numeroUm = scanner.nextDouble();

        double numeroIdentificado = identificarPositivoNegativo(numeroUm);
        scanner.close();
    }
    public static double identificarPositivoNegativo(double numeroUm) {
        if (numeroUm > 0) {
            System.out.println("\nP");
        }
        else {
            System.out.println("\nN");
        }
        return numeroUm;
    }
}