public class A06ex05 {
    
    public static void imprimir(String mensagem) {
        imprimir(mensagem, 2); 
    }
    
    public static void imprimir(String mensagem, int tipo) {
        if (tipo == 1) {
            System.out.println(mensagem);
        } else if (tipo == 2) {
            int tamanho = mensagem.length() + 4;
            
            for (int i = 0; i < tamanho; i++) {
                System.out.print("=");
            }
            System.out.println();
            
            System.out.println("| " + mensagem + " |");
            
            for (int i = 0; i < tamanho; i++) {
                System.out.print("=");
            }
            System.out.println();
        } else {
            System.out.println("Tipo inválido! Use 1 ou 2.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("--- Mensagens em Texto Simples (tipo 1) ---");
        imprimir("Olá, Mundo!", 1);
        imprimir("Java é incrível", 1);
        imprimir("Programação em POO", 1);
        
        System.out.println();
        
        System.out.println("--- Mensagens Gráficas (tipo 2) ---");
        imprimir("Olá, Mundo!", 2);
        imprimir("Java é incrível", 2);
        
        System.out.println();
        
        System.out.println("--- Usando método original (padrão tipo 2) ---");
        imprimir("Sucesso!");
    }
}
// Pedro Ribeiro Gomes da Silva