public class A06ex03 {
    
    public static void imprimir(String mensagem) {
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
    }
    
    public static void main(String[] args) {
        imprimir("Olá, Mundo!");
        System.out.println();
        imprimir("Java é incrível");
        System.out.println();
        imprimir("Programação em POO");
        System.out.println();
        imprimir("Sucesso!");
    }
}
// Pedro Ribeiro Gomes da Silva