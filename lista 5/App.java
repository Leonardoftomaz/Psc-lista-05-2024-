import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double soma = 0;
        int contagem = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Medição da Temperatura da Água");
        System.out.println("--------------------------------");
        System.out.println("Insira as temperaturas medidas:");

        for (int i = 0; i < 12; i++) {
            double temperatura;
            do {
                System.out.print("Temperatura " + (i + 1) + " de 4ºC e 10ºC: ");
                temperatura = scanner.nextDouble();
                if (temperatura < 4 || temperatura > 10) {
                    System.out.println("Temperatura inválida! Insira uma temperatura entre 4ºC e 10ºC.");
                }
            } while (temperatura < 4 || temperatura > 10);

            soma += temperatura;
            contagem++;
        }

        scanner.close();

        double media = soma / contagem;
        System.out.printf("A média de hoje das temperaturas é: %.1fºC%n", media);
    }
}
