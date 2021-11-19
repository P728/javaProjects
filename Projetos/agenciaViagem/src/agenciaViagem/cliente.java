package agenciaViagem;

public class cliente {

    private String sobrenome, cpf, tel;

    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    protected String getSobrenome() {
        return sobrenome;
    }

    protected void setCPF(String cpf) {
        this.cpf = cpf;
    }

    protected String getCPF() {
        return cpf;
    }

    protected void setTel(String tel) {
        this.tel = tel;
    }

    protected String getTel() {
        return tel;
    }
}