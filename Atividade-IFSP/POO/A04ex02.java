import java.util.Scanner;
import java.text.DecimalFormat;

public class A04ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        System.out.println("=== CALCULADORA ===");
        System.out.println("Operações disponíveis:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto da Divisão");
        System.out.println("6 - Potência");
        System.out.print("\nEscolha uma operação (1-6): ");
        int operacao = scanner.nextInt();
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        double resultado = 0;
        boolean operacaoValida = true;
        String nomeOperacao = "";
        
        switch (operacao) {
            case 1:
                resultado = valor1 + valor2;
                nomeOperacao = "Soma";
                break;
            case 2:
                resultado = valor1 - valor2;
                nomeOperacao = "Subtração";
                break;
            case 3:
                resultado = valor1 * valor2;
                nomeOperacao = "Multiplicação";
                break;
            case 4:
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    nomeOperacao = "Divisão";
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            case 5:
                if (valor2 != 0) {
                    resultado = valor1 % valor2;
                    nomeOperacao = "Resto da Divisão";
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            case 6:
                resultado = Math.pow(valor1, valor2);
                nomeOperacao = "Potência";
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }
        
        if (operacaoValida) {
            System.out.println("\n=== RESULTADO ===");
            System.out.println(nomeOperacao + ": " + valor1 + " e " + valor2);
            System.out.println("Resultado: " + df.format(resultado));
        }
        
        scanner.close();
    }
}
