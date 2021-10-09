import javax.swing.JOptionPane;

public class calculo2 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0;
        int total;
        int i = 1;

        do {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

            total = (num1 + num2) / 2;
            i++;

            if (num2 > 0) {
                JOptionPane.showMessageDialog(null, "O resultado da divisão é:\n" + total);
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }
        } while (i <= 4);
    }
}
