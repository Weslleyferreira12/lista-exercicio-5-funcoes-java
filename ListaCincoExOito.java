import java.util.Scanner;

public class ListaCincoExOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFunção para somar imposto.");
        double taxaImposto, custo;

        System.out.println("\nInforme a taxa do imposto(em porcentagem): ");
        taxaImposto = scanner.nextDouble();
        System.out.println("\nInforme a custo do produto: ");
        custo = scanner.nextDouble();

        double novoValorProduto = somaImposto(taxaImposto, custo);
        System.out.println("\nO novo valor do produto é de: " + novoValorProduto);
        scanner.close();
    }
    public static double somaImposto(double imposto, double custo) {
        imposto = (imposto/100);
        double custoTotal;
        custoTotal = ( imposto * custo) + custo;
        return custoTotal;
    }
}