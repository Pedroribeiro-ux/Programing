import javax.swing.JOptionPane;

public class A03ex02 {
    public static void main(String[] args) {
        String titulo = "Pedro Ribeiro";
        
        String inputLargura = JOptionPane.showInputDialog(null, 
            "Informe a largura da parede (em metros):", 
            titulo, 
            JOptionPane.QUESTION_MESSAGE);
        
        if (inputLargura == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        double largura = Double.parseDouble(inputLargura);
        
        String inputAltura = JOptionPane.showInputDialog(null, 
            "Informe a altura da parede (em metros):", 
            titulo, 
            JOptionPane.QUESTION_MESSAGE);
        
        if (inputAltura == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada!", titulo, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        double altura = Double.parseDouble(inputAltura);
        
        double area = largura * altura;
        
        int quantidadeTijolos = (int) (area * 20);
        
        String resultado = String.format(
            "Área da parede: %.2f m²\nQuantidade de tijolos necessários: %d", 
            area, 
            quantidadeTijolos);
        
        JOptionPane.showMessageDialog(null, resultado, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
