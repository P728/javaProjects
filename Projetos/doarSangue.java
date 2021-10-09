package src;

import java.util.Scanner;

public class doarSangue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        double idade = ((Scanner) input).nextDouble();

        if (idade >= 20)
            System.out.println("Você pode doar sangue");
        else
            System.out.println("Você não pode doar sangue");
    }
}
