
import javax.swing.JOptionPane;

public class ifEncadeado{

    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));

        if (nota >= 7.0) {
            JOptionPane.showMessageDialog(null, " A sua nota foi: " + nota + "Parabens você foi aprovado");
        }

        else if (nota >= 6) {
            JOptionPane.showMessageDialog(null, "A sua nota foi:" + nota + "Você esta em recuperção");

        }

        else {
            JOptionPane.showMessageDialog(null, " A sua nota foi: " + nota + " Você foi reprovado" );

        }
    }
}