import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double VELOCIDADE_MAXIMA = 80.0;
        final double MULTA_POR_KM = 5.0;

        System.out.println("-------Radar de Velocidade-------");
        System.out.println("Velocidade máxima permitida: " + VELOCIDADE_MAXIMA + " km/h");
        System.out.print("Digite a quantidade de carros: ");

        int quantidadeCarros = scanner.nextInt();
        double[] velocidades = new double[quantidadeCarros];
        double totalMultas = 0;

        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.print("Digite a velocidade do carro " + (i + 1) + ": ");
            velocidades[i] = scanner.nextDouble();
        }

        System.out.println("\n-------Carros acima da velocidade permitida-------");
        for (int i = 0; i < quantidadeCarros; i++) {
            if (velocidades[i] > VELOCIDADE_MAXIMA) {
                double excesso = velocidades[i] - VELOCIDADE_MAXIMA;
                double multa = excesso * MULTA_POR_KM;
                totalMultas += multa;
                
                System.out.println("Carro " + (i + 1) + ": " + velocidades[i] + " km/h");
                System.out.println("  Excesso: " + excesso + " km/h");
                System.out.println("  Multa: R$ " + multa);
            }
        }

        System.out.println("\n=== RESUMO ===");
        System.out.println("Velocidade máxima: " + VELOCIDADE_MAXIMA + " km/h");
        System.out.println("Total de multas arrecadadas: R$ " + totalMultas);

        scanner.close();
    }
}
