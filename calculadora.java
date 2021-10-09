package src;

import javax.swing.JOptionPane;

public class calculadora {

    public static void main(String[] args) {

        double vA = 0;
        double vB = 0;
        double vC = 0;

        double vB2 = 0;
        double vX1 = 0;
        double vX2 = 0;

        double vDelta = 0;

        vA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A:"));
        vB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B:"));
        vC = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor C:"));

        if (vA == 0) {
            JOptionPane.showMessageDialog(null, "Essa não é uma equação de segundo grau");
        } else {
            if (vB == 0 || vC == 0) {
                JOptionPane.showMessageDialog(null, "A equação está incompleta");
            } else {
                JOptionPane.showMessageDialog(null, "A equação está completa");
            }
        }
        vB2 = vB * vB;
        vDelta = vB2 - (4 * vA * vC);

        if (vDelta < 0) {
            JOptionPane.showMessageDialog(null, "Não existe raiz");
        } else {
            vX1 = (-vB + Math.sqrt(vDelta)) / (2 * vA);
            vX2 = (-vB - Math.sqrt(vDelta)) / (2 * vB);

            JOptionPane.showMessageDialog(null, "O valor de X1 é:" + vX1);
            JOptionPane.showMessageDialog(null, "O valor de X2 é:" + vX2);
        }
    }
}