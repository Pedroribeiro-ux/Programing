import java.util.Scanner;

public class A04ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        
        String textoSemVogais = texto.replaceAll("[aeiouAEIOU]", "");
        
        System.out.println("\nTexto original: " + texto);
        System.out.println("Texto sem vogais: " + textoSemVogais);
        
        scanner.close();
    }
}
