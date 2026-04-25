import java.util.Scanner;

public class A04ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE PERGUNTAS INTELIGENTES ===\n");
        
        // Pergunta 1: Prato Preferido
        String[] dicionario1 = {"lasanha", "pizza", "churrasco"};
        String pergunta1 = "Qual é seu prato preferido?";
        String respostaPositivaPergunta1 = "Eu adoro [...] Excelente escolha!";
        String respostaNegativaPergunta1 = "Disso eu não gosto muito!";
        
        System.out.print(pergunta1 + " ");
        String resposta1 = scanner.nextLine().toLowerCase();
        verificarEResponder(resposta1, dicionario1, respostaPositivaPergunta1, respostaNegativaPergunta1);
        
        // Pergunta 2: Fruta Favorita
        String[] dicionario2 = {"maçã", "banana", "morango"};
        String pergunta2 = "Qual é sua fruta favorita?";
        String respostaPositivaPergunta2 = "Que gosto saudável! Eu também gosto!";
        String respostaNegativaPergunta2 = "Que pena, essa fruta não é tão interessante!";
        
        System.out.print(pergunta2 + " ");
        String resposta2 = scanner.nextLine().toLowerCase();
        verificarEResponder(resposta2, dicionario2, respostaPositivaPergunta2, respostaNegativaPergunta2);
        
        // Pergunta 3: Hobby/Atividade Favorita
        String[] dicionario3 = {"leitura", "games", "esportes"};
        String pergunta3 = "Qual é sua atividade favorita?";
        String respostaPositivaPergunta3 = "Que interessante! Eu também acho isso legal!";
        String respostaNegativaPergunta3 = "Interessante, mas não é bem meu estilo!";
        
        System.out.print(pergunta3 + " ");
        String resposta3 = scanner.nextLine().toLowerCase();
        verificarEResponder(resposta3, dicionario3, respostaPositivaPergunta3, respostaNegativaPergunta3);
        
        System.out.println("\n=== FIM DA ENTREVISTA ===");
        System.out.println("Obrigado pelas respostas!");
        
        scanner.close();
    }
    
    static void verificarEResponder(String resposta, String[] dicionario, 
                                    String respostaPositivaPadrão, String respostaNegativaPadrão) {
        boolean encontrou = false;
        String palavraEncontrada = "";
        
        for (String palavra : dicionario) {
            if (resposta.contains(palavra)) {
                encontrou = true;
                palavraEncontrada = palavra;
                break;
            }
        }
        
        if (encontrou) {
            String resposta_formatada = respostaPositivaPadrão.replace("[...]", palavraEncontrada);
            System.out.println("→ " + resposta_formatada);
        } else {
            System.out.println("→ " + respostaNegativaPadrão);
        }
        System.out.println();
    }
}
