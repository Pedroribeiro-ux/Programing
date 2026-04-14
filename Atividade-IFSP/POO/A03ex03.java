import javax.swing.JOptionPane;

public class A03ex03 {
    public static void main(String[] args) {
        String titulo = "Pedro Ribeiro";
        
        // Solicita a largura da parede
        String inputLargura = JOptionPane.showInputDialog(null, 
            "Informe a largura da parede (em metros):", 
            titulo, 
            JOptionPane.QUESTION_MESSAGE);
        
        if (inputLargura == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        double largura = Double.parseDouble(inputLargura);
        
        // Solicita a altura da parede
        String inputAltura = JOptionPane.showInputDialog(null, 
            "Informe a altura da parede (em metros):", 
            titulo, 
            JOptionPane.QUESTION_MESSAGE);
        
        if (inputAltura == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        double altura = Double.parseDouble(inputAltura);
        
        // Calcula a área da parede
        double area = largura * altura;
        
        // Calcula a quantidade de tijolos necessários (20 tijolos por metro quadrado)
        int quantidadeTijolos = (int) (area * 20);
        
        // Classifica a altura da parede
        String classificacao;
        if (altura < 3.0) {
            classificacao = "BAIXA";
        } else if (altura <= 3.5) {
            classificacao = "MÉDIA";
        } else {
            classificacao = "ALTA";
        }
        
        // Exibe os resultados
        String resultado = String.format(
            "Área da parede: %.2f m²\nQuantidade de tijolos necessários: %d\n\nClassificação da altura: %s", 
            area, 
            quantidadeTijolos,
            classificacao);
        
        JOptionPane.showMessageDialog(null, resultado, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
