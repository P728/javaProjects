package agenciaViagem;

import java.io.PrintStream;
import java.util.Scanner;

class cadastro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        cliente cliente = new cliente();
        viagem viagem = new viagem();
        String[] dadosCliente = new String[4];
        String[] dadosViagem = new String[5];

        output.print("\nSeja bem vindo a sua agência de viagens!\n");

        for (int i = 0; i < dadosCliente.length; i++) {
            switch (i) {
            case 0 -> {
                output.print("\nNome: ");
                cliente.setNome(input.next());
                dadosCliente[i] = cliente.getNome();
            }
            case 1 -> {
                output.print("Sobrenome: ");
                cliente.setSobrenome(input.next());
                dadosCliente[i] = cliente.getSobrenome();
            }
            case 2 -> {
                output.print("CPF: ");
                cliente.setCPF(input.next());
                dadosCliente[i] = cliente.getCPF();
            }
            case 3 -> {
                output.print("Telefone: ");
                cliente.setTel(input.next());
                dadosCliente[i] = cliente.getTel();
            }
            default -> {
            }
            }
        }
        output.println("\n>>>>>>>>>>>> Cadastro Realizado <<<<<<<<<<<<");
        output.println("\n" + "Sr(a) " + dadosCliente[0] + " " + dadosCliente[1] + ", faça o cadastro da sua viagem.");
        output.println("Informe os dados abaixo: \n");

        int j = 0;
        while (j < dadosViagem.length) {
            switch (j) {
            case 0 -> {
                output.print("Origem: ");
                viagem.setOrigem(input.next());
                dadosViagem[j] = viagem.getOrigem();
            }
            case 1 -> {
                output.print("Destino: ");
                viagem.setDestino(input.next());
                dadosViagem[j] = viagem.getDestino();
            }
            case 2 -> {
                output.print("Dia: ");
                viagem.setDia(input.next());
                dadosViagem[j] = viagem.getDia();
            }
            case 3 -> {
                output.print("Mês: ");
                viagem.setMes(input.next());
                dadosViagem[j] = viagem.getMes();
            }
            case 4 -> {
                output.print("Horário: ");
                viagem.setHoras(input.next());
                dadosViagem[j] = viagem.getHoras();
            }
            default -> {
            }
            }
            j++;
        }

        System.out.println("\n------------------|Dados cliente e viagem|------------------\n" + "\n|     Nome: "
                + dadosCliente[0] + " " + dadosCliente[1] + "\n" + "|     CPF: " + dadosCliente[2] + " Telefone: "
                + dadosCliente[3] + "\n" + "|     Origem: " + dadosViagem[0] + " Destino: " + dadosViagem[1] + "\n"
                + "|     Data: " + dadosViagem[2] + "/" + dadosViagem[3] + " Horário: " + dadosViagem[4] + " horas"
                + "\n" + "\n------------------------------------------------------------\n");
        System.out.println("Cadastro de viagem realizado! Aperte os cintos e corra para \na aventura."
                + " Lembre-se de conferir a data e horario com \nantecedência, para conseguir se planejar." + "\n"
                + "\n" + "Agradecemos a prefêrencia, tenha uma ótima viagem!");
        System.out.print("\n          __|__");
        System.out.println("\n    *---o--(_)--o---*\n");
    }
}