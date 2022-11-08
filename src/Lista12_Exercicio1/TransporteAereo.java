package Lista12_Exercicio1;

public abstract class TransporteAereo extends Transporte{
	
	public int altitudeAtual;
	
	public int getAltitudeAtual() {
		return altitudeAtual;
	}
	public void setAltitudeAtual(int altitudeAtual) {
		this.altitudeAtual = altitudeAtual;
	}
	public abstract void subir(int metros);
	public abstract void descer(int metros);

}
