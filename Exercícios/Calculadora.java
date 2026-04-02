import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Calculadora Simples");

            System.out.print("Digite o primeiro número: ");
            double num1 = leitor.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = leitor.nextDouble();

            int operacao = exibirMenuOperacoes(leitor);
            
            double resultado = calcular(num1, num2, operacao);
            
            if (!Double.isNaN(resultado)) {
                System.out.println("Resultado: " + resultado);
            }
        }
    }

    private static int exibirMenuOperacoes(Scanner leitor) {
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        return leitor.nextInt();
    }

    private static double calcular(double num1, double num2, int operacao) {
        switch (operacao) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return Double.NaN;
                }
            default:
                System.out.println("Operação inválida.");
                return Double.NaN;
        }
    }
}