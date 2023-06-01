import java.util.Scanner;

public class ListaCincoExNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFunção para imprimir o reverso do número.");

        int numeroDigitado;

        System.out.println("\nDigite um número");
        numeroDigitado = scanner.nextInt();

        reversoDoNumero(numeroDigitado);
        scanner.close();
    }
    public static void reversoDoNumero(int numeroDigitado) {
        int unidade = numeroDigitado % 10;
        int dezena = (numeroDigitado % 100) / 10;
        int centena = numeroDigitado / 100;

        System.out.printf("O número invertido é: %d%d%d",unidade, dezena, centena);
    }
}