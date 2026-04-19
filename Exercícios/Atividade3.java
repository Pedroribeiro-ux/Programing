import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Baú do tesouro-------");
        System.out.print("Digite a quantidade de moedas no baú: ");

        int quantidadeMoedas = scanner.nextInt();
        int[] moedas = new int[quantidadeMoedas];
        int totalMoedas = 0;
        
        for (int i = 0; i < quantidadeMoedas; i++) {
            System.out.print("Digite o valor da moeda " + (i + 1) + ": ");
            moedas[i] = scanner.nextInt();
            totalMoedas += moedas[i];
        }
        
        System.out.println("\n-------Moedas Coletadas-------");
        for (int i = 0; i < quantidadeMoedas; i++) {
            System.out.println("Moeda " + (i + 1) + ": " + moedas[i]);
        }
        
        System.out.println("\n=== RESUMO ===");
        System.out.println("Total de moedas coletadas: " + quantidadeMoedas);
        System.out.println("Valor total: " + totalMoedas);
        
        scanner.close();
    }
    
}
    

