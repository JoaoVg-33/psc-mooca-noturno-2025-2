import javax.swing.JOptionPane;

public class SwitchCase {

    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String op = JOptionPane.showInputDialog("Digite o operador (+, -, *, /):");


        char operador = op.charAt(0);
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int resultado;

        switch(operador){
            case '+':
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null,"Soma " + resultado);
            break;

            case '-':
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null,"Subtração " + resultado);
            break;

            case '*':
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null,"Multiplicação " + resultado);
            break;

            case '/':
            if(num2 != 0){
            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null,"Divisão " + resultado);
            }else{
                System.err.println("Erro: Divisão por zero");

            }
            break;

            default:
                System.err.println("Operador Invalido");
            


        }

        
    }
}