import java.util.Scanner;
import java.lang.Math;

public class ListaCincoExQuatro {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nFunção para calcular média aritmética, harmônica e geométrica.");

    double valorA, valorB, valorC;

    System.out.println("\nInforme o valor de A: ");
    valorA = scanner.nextDouble();

    System.out.println("\nInforme o valor de B: ");
    valorB = scanner.nextDouble();

    System.out.println("\nInforme o valor de C: ");
    valorC = scanner.nextDouble(); 

    double mediaAritimeticaPronta =calcularMediaAritimetica(valorA, valorB, valorC);
    double mediaHarmonicaPronta = calcularMediaHarmonica(valorA, valorB, valorC);
    double mediaGeometricaPronta = calcularMediaGeometrica(valorA, valorB, valorC);

    System.out.printf(
                "Resultado média aritmética: %.2f\nResultado média harmônica: %.2f\nResultado média geométrica: %.2f\n",
                mediaAritimeticaPronta, mediaHarmonicaPronta, mediaGeometricaPronta);
    scanner.close();
}
    public static double calcularMediaAritimetica(double valorA, double valorB, double valorC) {
        double mediaAritmetica;
        mediaAritmetica = (valorA + valorB + valorC) /3;
        return mediaAritmetica;
    }
    public static double calcularMediaHarmonica(double valorA, double valorB, double valorC) {
        double mediaHarmonica;
        mediaHarmonica = (3/(1/valorA) + (1/valorB) + (1/valorC));
        return mediaHarmonica;
    }
    public static double calcularMediaGeometrica(double valorA, double valorB, double valorC) {
        double mediaGeometrica;
        mediaGeometrica = Math.cbrt(valorA * valorB * valorC);
        return mediaGeometrica;
    }
}