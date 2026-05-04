import java.util.Scanner;

public class A05ex02 {
    
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
        
        System.out.print("\nDigite um inteiro para incrementar as posições pares (e decrementar as ímpares): ");
        int incremento = scanner.nextInt();
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matriz[i][j] += incremento; 
                } 
                else if (i % 2 != 0 && j % 2 != 0) {
                    matriz[i][j] -= incremento; 
                }
            }
        }
        
        System.out.println("\n===== MATRIZ MODIFICADA =====");
        System.out.println("(Posições pares: incrementadas por " + incremento + ")");
        System.out.println("(Posições ímpares: decrementadas por " + incremento + ")");
        exibirMatriz(matriz);
        
        scanner.close();
    }
    
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
