import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
        
        scanner.close();
    }
    
}
