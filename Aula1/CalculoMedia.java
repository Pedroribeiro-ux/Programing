import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

    if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            System.out.println("Notas inválidas. As notas devem estar entre 0 e 10.");
            scanner.close();
            return;
    } else {
            System.out.println("Notas válidas. Calculando a média...");
    } 
    
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média de " + nota1 + " e " + nota2 + " e " + nota3 + " é: " + media);
        
        if (media >= 7 && media <= 10) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("O aluno está em recuperação com média " + media);
        } else if (media < 5 && media >= 0) {
            System.out.println("O aluno foi reprovado com média " + media);
        } else {
            System.out.println("Média inválida. A média deve estar entre 0 e 10.");
        }
        
        scanner.close();
    }
}

