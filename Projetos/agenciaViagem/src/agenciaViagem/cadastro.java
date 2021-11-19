package agenciaViagem;

import java.io.PrintStream;
import java.util.Scanner;

class cadastro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        cliente cliente = new cliente();
        viagem viagem = new viagem();
        String[] dadosCliente = new String[3]; 
        String[] dadosViagem = new String[5];

        System.out.print("Digite seu nome: ");
        double Nome = ((Scanner) input).nextDouble();
        output.print("Olá Cliente " + Nome + ", seja bem vindo a sua agência de viagens!");

        for (int i = 0; i < dadosCliente.length; i++) {
            switch (i) {
                case 0 -> {
                    output.println("Sobrenome: \n");
                    cliente.setSobrenome(input.next());
                    dadosCliente[i] = cliente.getSobrenome;
                }
                case 1 -> {
                    output.println("CPF: \n");
                    cliente.setCPF(input.next());
                    dadosCliente[i] = cliente.getCPF;
                }
                case 2 -> {
                    output.println("Telefone: \n");
                    cliente.setTel(input.next());
                    dadosCliente[i] = cliente.getTel;
                }
                default -> {                    
                }
            }
        }
        output.println("Cadastro Realizado!");
        output.println(Nome + " " + dadosCliente[0] + ", faça o cadastro da sua viagem.");
        output.println("Informe os dados abaixo: ");

        int j = 0;
        while (j < dadosViagem.length) {
            switch (j) {
                case 0 -> {
                    output.println("Origem: ");
                    viagem.setOrigem(input.next());
                    dadosViagem[j] = viagem.getOrigem();
                }
                case 1 -> {
                    output.println("Destino: ");
                    viagem.setDestino(input.next());
                    dadosViagem[j] = viagem.getDestino();
                }
                case 2 -> {
                    output.println("Dia: ");
                    viagem.setDia(input.next());
                    dadosViagem[j] = viagem.getDia();
                }
                case 3 -> {
                    output.println("Mês: ");
                    viagem.setMes(input.next());
                    dadosViagem[j] = viagem.getMes();
                }
                case 4 -> {
                    output.println("Horário: ");
                    viagem.setHoras(input.next());
                    dadosViagem[j] = viagem.getHoras();
                }
                default -> {
                }
            }
            j++;
        }

        output.print("------------------|Dados cliente e viagem|------------------\n"
                    + "Nome: " + Nome + " " + dadosCliente[0] + "\n"
                    + "CPF: " + dadosCliente[1] + " Telefone: " + dadosCliente[2] + "\n"
                    + "Origem: " + dadosViagem[0] + " Destino: " + dadosViagem[1] + "\n"
                    + "Data" + dadosViagem[2] + "/" + dadosViagem[3] + " Horário: " + dadosViagem[4]
                    + "\n" 
                    +"------------------------------------------------------------\n");

        output.print("Cadastro de viagem realizado! Aperte os cintos e se aventure.\n"
                    + "Lembre-se de conferir a data e horario antecipado para se planejar melhor."
                    + "\n" + "\n" + "Agradecemos a prefêrencia, tenha uma ótima viagem!");            
    }
} 