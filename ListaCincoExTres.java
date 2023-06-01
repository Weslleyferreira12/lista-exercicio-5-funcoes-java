import java.util.Scanner;

public class ListaCincoExTres {
  public static void main(String[] args) {
    System.out.println("\nFunção para converter graus Fahrenheit em graus Celsius.");
    Scanner scanner = new Scanner(System.in);

    double grausFahrenheit;

    System.out.println("\nInforme a temperatura(Fahrenheit):");
    grausFahrenheit = scanner.nextDouble();

    double grausCelsius = converterTemperaturaEmCelsius(grausFahrenheit);
    System.out.println("\nA temperatura em Graus Celsius é: " + grausCelsius);
    scanner.close();
   }
    
  public static double converterTemperaturaEmCelsius(double grausFahrenheit) {
    double temperaturaGrausCelsius;
    temperaturaGrausCelsius = (grausFahrenheit -32) / 1.8;
    return temperaturaGrausCelsius;
   }
}


