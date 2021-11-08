package agenciaDeViagens;

import java.io.PrintStream;
import java.util.Scanner;

class CodigoCadastro {
    public static void main(String[] args) {

        // objetos e funcionalidades utilizadas no código.
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;
        Cliente usuario = new Cliente();
        Viagem viagem = new Viagem();
        String[] dadosUser = new String[5];
        String[] dadosViagem = new String[3];

        // cadastro de cliente
        saida.print("Olá Cliente, seja bem vindo ao Monkey Trips. Realize seu cadastro digitando os dados abaixo:\n");
        for (int i = 0; i < dadosUser.length; i++) {
            switch (i) {
            case 0 -> {
                saida.print("Nome: \n");
                usuario.setNome(entrada.next());
                dadosUser[i] = usuario.getNome();
            }
            case 1 -> {
                saida.print("Sobrenome: " + "\n");
                usuario.setSobrenome(entrada.next());
                dadosUser[i] = usuario.getSobrenome();
            }
            case 2 -> {
                saida.print("CPF: \n");
                usuario.setCPF(entrada.next());
                dadosUser[i] = usuario.getCPF();
            }
            case 3 -> {
                saida.print("Telefone: \n");
                usuario.setTel(entrada.next());
                dadosUser[i] = usuario.getTel();
            }
            case 4 -> {
                saida.print("Endereço: \n");
                usuario.setEnd(entrada.next());
                dadosUser[i] = usuario.getEnd();
            }
            default -> {
            }
            }
        }
        saida.println("Cadastro de Cliente realizado, " + dadosUser[0] + ' ' + dadosUser[1] + " !");

        // código de cadastro da viagem do cliente
        saida.print("Agora, faça o cadastro da sua viagem informando os dados abaixo:\n");
        int j = 0;
        while (j < dadosViagem.length) {
            switch (j) {
            case 0 -> {
                saida.print("Destino: \n");
                viagem.setDestino(entrada.next());
                dadosViagem[j] = viagem.getDestino();
            }
            case 1 -> {
                saida.print("Data: " + "\n");
                viagem.setData(entrada.next());
                dadosViagem[j] = viagem.getData();
            }
            case 2 -> {
                saida.print("Horario: \n");
                viagem.setHorario(entrada.next());
                dadosViagem[j] = viagem.getHorario();
            }
            default -> {
            }
            }
            j++;
        }
        saida.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \n"
                + "--------------------|Dados do cliente|-------------------- \n" + "\n" + "Nome: " + dadosUser[0]
                + "\n" + "Sobrenome: " + dadosUser[1] + "CPF: " + dadosUser[2] + "Telefone: " + dadosUser[3] + "\n"
                + "Local de Destino: " + dadosViagem[0] + "\n" + "Data: " + dadosViagem[1] + "\n" + "Horario: "
                + dadosViagem[2] + "\n" + "\n" + "=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n");
        saida.print("Cadastro de Viagem Realizado. Lembre-se de conferir a data e horario "
                + "antecipado para se planejar melhor. "
                + "A Monkey Trips agradece a preferência e deseja uma excelente viagem !!!");

    }
}
