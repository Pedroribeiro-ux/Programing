import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Números de 1 até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
