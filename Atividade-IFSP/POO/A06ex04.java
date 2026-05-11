public class A06ex04 {
    
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
    
    public static void main(String[] args) {

        System.out.println("Dia 1: " + obterNomeDia(1));
        System.out.println("Dia 2: " + obterNomeDia(2));
        System.out.println("Dia 3: " + obterNomeDia(3));
        System.out.println("Dia 4: " + obterNomeDia(4));
        System.out.println("Dia 5: " + obterNomeDia(5));
        System.out.println("Dia 6: " + obterNomeDia(6));
        System.out.println("Dia 7: " + obterNomeDia(7));
        System.out.println("Dia 10: " + obterNomeDia(10));
    }
}
// Pedro Ribeiro Gomes da Silva