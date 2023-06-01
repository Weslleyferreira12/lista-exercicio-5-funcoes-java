import java.util.Scanner;

public class ListaCincoExUm {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("\nFunção para calcular média Áritmetica");

     double numeroUm, numeroDois;

     System.out.println("\nDigite o primeiro número: ");
     numeroUm = scanner.nextDouble();
     System.out.println("\nDigite o segundo número: ");
     numeroDois = scanner.nextDouble();

     double mediaResultado = calucularMediaAritmetica(numeroUm, numeroDois);
     System.out.println("\nA média é: " + mediaResultado);
     scanner.close();
    }
    
    public static double calucularMediaAritmetica(double numeroUm, double numeroDois) {
     double mediaAritmetica;
     mediaAritmetica = (numeroUm + numeroDois) /2;
     return mediaAritmetica;
    }
}
