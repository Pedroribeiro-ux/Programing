import java.util.HashMap;
import java.util.Map;

public class A06ex01 {
    
    private static Map<Integer, String> individuos = new HashMap<>();
    
    static {
        individuos.put(1, "João Silva");
        individuos.put(2, "Maria Santos");
        individuos.put(3, "Pedro Oliveira");
        individuos.put(4, "Ana Costa");
        individuos.put(5, "Carlos Souza");
    }
    
    public static String obterNomeIndividuo(int codigo) {
        return individuos.getOrDefault(codigo, "Indivíduo não encontrado");
    }
    
    public static void main(String[] args) {
        System.out.println("Código 1: " + obterNomeIndividuo(1));
        System.out.println("Código 2: " + obterNomeIndividuo(2));
        System.out.println("Código 3: " + obterNomeIndividuo(3));
        System.out.println("Código 10: " + obterNomeIndividuo(10));
    }
}
// Pedro Ribeiro Gomes da Silva