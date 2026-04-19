import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;
        int soma = 0;
        
        do {
            System.out.print("Digite um número (se for 0 some todos): ");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                soma += numero;
            }
        } while (numero != 0);
        
        System.out.println("Soma de todos os números: " + soma);
        scanner.close();
    }
    
}
    

