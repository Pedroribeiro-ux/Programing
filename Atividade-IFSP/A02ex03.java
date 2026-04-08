public class A02ex03 {

    public static void main(String arg[]) {
        
        int valor1 = Integer.parseInt(arg[0]);
        int valor2 = Integer.parseInt(arg[1]);
    
        int resto = valor1 % valor2;
        int produto = valor1 * valor2;
    
        double media = (valor1 + valor2) / 2.0;
        
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("Resto da divisão: " + resto);
        System.out.println("Produto: " + produto);
        System.out.println("Média: " + media);
    }
    
}

// Pedro Ribeiro Gomes da Silva