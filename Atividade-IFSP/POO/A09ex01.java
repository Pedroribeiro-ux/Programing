import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class A09ex01 {
    
    public static void main(String[] args) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            String dataInicio = JOptionPane.showInputDialog(
                null,
                "Informe a data de INÍCIO das férias (dd/MM/yyyy):",
                "Férias do Funcionário - Data de Início",
                JOptionPane.QUESTION_MESSAGE
            );
            
            if (dataInicio == null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Operação cancelada pelo usuário.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }
            
            if (dataInicio.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "A data de início não pode estar vazia!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            LocalDate inicio = LocalDate.parse(dataInicio.trim(), formatter);
            
            String dataTermino = JOptionPane.showInputDialog(
                null,
                "Informe a data de TÉRMINO das férias (dd/MM/yyyy):",
                "Férias do Funcionário - Data de Término",
                JOptionPane.QUESTION_MESSAGE
            );
            
            if (dataTermino == null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Operação cancelada pelo usuário.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }
            
            if (dataTermino.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "A data de término não pode estar vazia!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            LocalDate termino = LocalDate.parse(dataTermino.trim(), formatter);
            
            if (termino.isBefore(inicio)) {
                JOptionPane.showMessageDialog(
                    null,
                    "A data de término não pode ser anterior à data de início!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            List<String> diasFerias = gerarDiasFerias(inicio, termino, formatter);
            
            exibirResultado(diasFerias, dataInicio, dataTermino);
            
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(
                null,
                "Formato de data inválido! Use o formato dd/MM/yyyy.\n\nExemplo: 15/06/2026",
                "Erro de Formato",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "Erro inesperado: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private static List<String> gerarDiasFerias(LocalDate inicio, LocalDate termino, DateTimeFormatter formatter) {
        List<String> dias = new ArrayList<>();
        LocalDate dataAtual = inicio;
        int numeroDia = 1;
        
        while (!dataAtual.isAfter(termino)) {
            String dia = String.format(
                "Dia %2d: %s - %s",
                numeroDia,
                dataAtual.format(formatter),
                obterNomeDia(dataAtual)
            );
            dias.add(dia);
            dataAtual = dataAtual.plusDays(1);
            numeroDia++;
        }
        
        return dias;
    }
    
    private static String obterNomeDia(LocalDate data) {
        String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        return diasSemana[data.getDayOfWeek().getValue() % 7];
    }
    
    private static void exibirResultado(List<String> diasFerias, String dataInicio, String dataTermino) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("=== PERÍODO DE FÉRIAS ===\n");
        resultado.append("Início: ").append(dataInicio).append("\n");
        resultado.append("Término: ").append(dataTermino).append("\n");
        resultado.append("Total de dias: ").append(diasFerias.size()).append("\n");
        resultado.append("\n=== DIAS DE FÉRIAS ===\n\n");
        
        for (String dia : diasFerias) {
            resultado.append(dia).append("\n");
        }
        
        JOptionPane.showMessageDialog(
            null,
            resultado.toString(),
            "Período de Férias - Detalhamento",
            JOptionPane.INFORMATION_MESSAGE
        );
        
        System.out.println(resultado.toString());
    }
}
