package agenciaViagem;

public class viagem {

    private String origem, destino, dia, mes, horas;

    protected void setOrigem(String origem) {
	    this.origem = origem;
	}

    protected String getOrigem() {
        return origem;
    }

    protected void setDestino(String destino) {
	    this.destino = destino;
	}

    protected String getDestino() {
        return destino;
    }

    protected void setDia(String dia) {
        this.dia = dia;
    }

    protected String getDia() {
        return dia;
    }

    protected void setMes(String mes) {
        this.mes = mes;
    }

    protected String getMes() {
        return mes;
    }

    protected void setHoras(String horas) {
        this.horas = horas;
    }

    protected String getHoras() {
        return horas;
    }
}