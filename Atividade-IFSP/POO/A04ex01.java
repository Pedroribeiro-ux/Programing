import java.util.Scanner;

public class A04ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();
        
        System.out.print("Digite o valor final: ");
        int valorFinal = scanner.nextInt();
        
        System.out.println("\n--- Contador Progressivo ---");
        
        if (valorInicial <= valorFinal) {
            for (int i = valorInicial; i <= valorFinal; i++) {
                System.out.print(i);
                if (i < valorFinal) {
                    System.out.print(" → ");
                }
            }
        } else {
            System.out.println("Erro: O valor inicial deve ser menor ou igual ao valor final!");
        }
        
        System.out.println();
        scanner.close();
    }
}
