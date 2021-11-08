package agenciaDeViagens;

public class Viagem {

	private String destino, data, horario;

	// MÉTODOS DE SET E GET PARA OS DADOS O DESTINO DA VIAGEM.
	// métodos para DESTINO
	    
	protected void setDestino(String destino) {
	     this.destino = destino;
	    }
    protected String getDestino() {
        return destino;
    }

    // métodos para DATA
    protected void setData(String data) {
        this.data = data;
    }
    protected String getData() {
        return data;
    }

    // métodos para HORARIO
    protected void setHorario(String horario) {
        this.horario = horario;
    }
    protected String getHorario() {
        return horario;
    }
}

