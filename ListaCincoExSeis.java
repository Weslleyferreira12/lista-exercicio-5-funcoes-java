import java.util.Scanner;

public class ListaCincoExSeis {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nFunção para somar números.");

    double numeroUm, numeroDois, numeroTres;

    System.out.println("\nInforme o primeiro número: ");
    numeroUm = scanner.nextDouble();
    System.out.println("\nInforme o segundo número: ");
    numeroDois = scanner.nextDouble();
    System.out.println("\nInforme o terceiro número: ");
    numeroTres = scanner.nextDouble();

    double somaResultado = somarNumeros(numeroUm, numeroDois, numeroTres);
    System.out.println("\nA soma dos três número é: " + somaResultado);
    scanner.close();
   }
   public static double somarNumeros(double numeroUm, double numeroDois, double numeroTres) {
    double soma;
    soma = numeroUm + numeroDois + numeroTres;
    return soma;
   }
}