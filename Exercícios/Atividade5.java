import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        System.out.println("\n-------Tabuada de " + numero + "-------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " × " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }
}
