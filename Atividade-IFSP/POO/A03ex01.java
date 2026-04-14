import java.util.Scanner;

public class A03ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a largura da parede
        System.out.print("Informe a largura da parede (em metros): ");
        double largura = scanner.nextDouble();
        
        // Solicita a altura da parede
        System.out.print("Informe a altura da parede (em metros): ");
        double altura = scanner.nextDouble();
        
        // Calcula a área da parede
        double area = largura * altura;
        
        // Calcula a quantidade de tijolos necessários (20 tijolos por metro quadrado)
        int quantidadeTijolos = (int) (area * 20);
        
        // Exibe os resultados
        System.out.println("\n--- Resultado ---");
        System.out.printf("Área da parede: %.2f m²%n", area);
        System.out.println("Quantidade de tijolos necessários: " + quantidadeTijolos);
        
        scanner.close();
    }
}
