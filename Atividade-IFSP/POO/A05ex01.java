import java.util.Scanner;

public class A05ex01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[8][8];
        
        int valor = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = valor++;
            }
        }
        
        System.out.println("===== MATRIZ INICIAL (8x8) =====");
        exibirMatriz(matriz);
        
        System.out.print("\nDigite um inteiro para substituir as posições pares: ");
        int novoValor = scanner.nextInt();
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matriz[i][j] = novoValor;
                }
            }
        }
        
        System.out.println("\n===== MATRIZ MODIFICADA =====");
        System.out.println("(Posições pares substituídas por: " + novoValor + ")");
        exibirMatriz(matriz);
        
        scanner.close();
    }
    
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
