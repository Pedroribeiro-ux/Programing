public class A06ex02 {
    
    public static void mostrarMaior(double numero1, double numero2) {
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais: " + numero1);
        }
    }
    
    public static void main(String[] args) {
        mostrarMaior(10, 5);
        mostrarMaior(20, 35);
        mostrarMaior(15, 15);
        mostrarMaior(-8, -3);
        mostrarMaior(100.5, 100.3);
    }
}
// Pedro Ribeiro Gomes da Silva