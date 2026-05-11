public class A06ex06 {
    
    // ========== MÉTODO DO EXERCÍCIO 4 ==========
    
    public static String obterNomeDia(int dia) {
        switch (dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Dia inválido";
        }
    }
    
    // ========== MÉTODOS DO EXERCÍCIO 5 ==========
    
    public static void imprimir(String mensagem) {
        imprimir(mensagem, 2); // Padrão: mensagem gráfica
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
    
    // ========== MÉTODO MAIN PARA TESTES ==========
    
    public static void main(String[] args) {
        System.out.println("===== CLASSE CALENDARIO =====\n");
        
        System.out.println("--- Testando obterNomeDia() ---");
        for (int i = 1; i <= 7; i++) {
            System.out.println("Dia " + i + ": " + obterNomeDia(i));
        }
        
        System.out.println();
        
        System.out.println("--- Testando imprimir() com tipo 1 (texto simples) ---");
        imprimir("Segunda-feira - Reunião de trabalho", 1);
        imprimir("Sexta-feira - Fim de semana!", 1);
        
        System.out.println();
        
        System.out.println("--- Testando imprimir() com tipo 2 (gráfico) ---");
        imprimir("Sábado - Dia de descanso", 2);
        imprimir("Domingo - Volta ao trabalho amanhã!", 2);
        
        System.out.println();
        
        System.out.println("--- Testando imprimir() com padrão (tipo 2) ---");
        imprimir("Feliz Aniversário!");
    }
}
// Pedro Ribeiro Gomes da Silva