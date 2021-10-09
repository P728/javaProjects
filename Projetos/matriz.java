import java.util.Scanner;

public class matriz {
    static final int LIN = 3;
    static final int COL = 3;

    public static void main(String[] args) throws Exception {

        Object input;
        int mat[][] = new int[LIN][COL];
        int dp = 0;
        int m = 0;

        for (int i = 0; i < LIN; i++) {
            input = new Scanner(System.in);
            for (int j = 0; j < COL; j++) {
                System.out.print("Informe o elemento: ");
                mat[i][j] = ((Scanner) input).nextInt();
            }
        }

        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                if (i == j) {
                    dp = dp + mat[i][j];
                    m = dp * 2;
                }
            }
        }
        System.out.println("Diagonal principal é: " + m);
    }

}
