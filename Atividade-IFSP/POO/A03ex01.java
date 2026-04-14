import java.util.Scanner;

public class A03ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a largura da parede (em metros): ");
        double largura = scanner.nextDouble();
        
        System.out.print("Informe a altura da parede (em metros): ");
        double altura = scanner.nextDouble();
        
        double area = largura * altura;
        
        int quantidadeTijolos = (int) (area * 20);
        
        System.out.println("\n--- Resultado ---");
        System.out.printf("Área da parede: %.2f m²%n", area);
        System.out.println("Quantidade de tijolos necessários: " + quantidadeTijolos);
        
        scanner.close();
    }
}
