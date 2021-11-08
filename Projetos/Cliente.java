package agenciaDeViagens;

public class Cliente {

    // VARIÁVEIS DECLARADAS EM MODO PRIVATE, PARA EVITAR ALTERAÇÕES EXTERNAS.
    private String nome, sobrenome, cpf, tel, end;

    // METODOS DE SET E GET PARA OS DADOS DO CLIENTE.
    // metodos para NOME
    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    // metodos para SOBRENOME
    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    protected String getSobrenome() {
        return sobrenome;
    }

    // metodos para CPF
    protected void setCPF(String cpf) {
        this.cpf = cpf;
    }

    protected String getCPF() {
        return cpf;
    }

    // metodos para TELEFONE
    protected void setTel(String tel) {
        this.tel = tel;
    }

    protected String getTel() {
        return tel;
    }

    // metodos para ENDEREÇO
    protected void setEnd(String end) {
        this.end = end;
    }

    protected String getEnd() {
        return end;
    }
}
