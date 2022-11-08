package Lista12_Exercicio1;

public abstract class TransporteTerrestre extends Transporte{

	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public abstract void estacionar();
	
}
