import javax.swing.JOptionPane;

public class Vendas {
    private static int contador;
    /**
     *
     */
    private static final double PARSE_DOUBLE = Double
            .parseDouble(JOptionPane.showInputDialog("Digite o " + (contador + 1) + "º" + " valor do produto"));

    public static void main(String[] args) throws Exception {

        {
            double venda[] = new double[1000];
            double soma = 0, media;
            int contador;
            /* ler os valores dos produtos */
            for (contador = 0; contador < 1000; contador++) {
                venda[contador] = PARSE_DOUBLE;
            }
            /* soma os produtos */
            for (contador = 0; contador < 1000; contador++) {
                soma = soma + venda[contador];
            }
            media = soma / 1000;

            JOptionPane.showMessageDialog(null,
                    "O total de vendas é:\n" + "R$ " + soma + "\n" + "A média das vendas é:\n" + "R$ " + media);
        }
    }
}