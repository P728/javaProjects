
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {

        // declaração de variáveis
        int regiao;
        int i = 1;

        // inicio
        do {
            regiao = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de procedência:"));
            switch (regiao) {

                case 1:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Sul");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Norte");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Leste");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Oeste");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Nordeste");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Sudeste");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Centro-Oeste");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "O pedido é da região Noroeste");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número Inválido");
                    break;
            }
            i++;
        } while (i <= 10);
    }
}