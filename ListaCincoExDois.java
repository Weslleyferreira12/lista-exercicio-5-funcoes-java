import java.util.Scanner;

public class ListaCincoExDois {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nFunção para calcular a porcentagem acrescida no produto");

    double precoDoProduto;

    System.out.println("\nDigite o preço do produto");
    precoDoProduto = scanner.nextDouble();

    double novoPrecoDoProduto = calcularPorcentagemAcrescidaProduto(precoDoProduto);
    System.out.println("\nNovo valor do produto é igual a: " + novoPrecoDoProduto);
    scanner.close();
  }
  
  public static double calcularPorcentagemAcrescidaProduto(double precoDoProduto) {
    double porcentagem, precoAcrescido;

    porcentagem = precoDoProduto * 0.1;

    precoAcrescido = precoDoProduto + porcentagem;
    return precoAcrescido;
  }
}