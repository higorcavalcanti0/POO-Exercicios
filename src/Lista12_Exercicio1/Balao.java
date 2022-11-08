package Lista12_Exercicio1;

public class Balao extends TransporteAereo{

	private int PesoLargard;

	public int getPesoLargard() {
		return PesoLargard;
	}

	public void setPesoLargard(int pesoLargard) {
		PesoLargard = pesoLargard;
	}

	@Override
	public void subir(int metros) {
		// TODO Auto-generated method stub
		
		setAltitudeAtual(getAltitudeAtual()+ metros);
		
	}

	@Override
	public void descer(int metros) {
		// TODO Auto-generated method stub
		setAltitudeAtual(getAltitudeAtual()- metros);
		
	}

	@Override
	public boolean estaParado() {
		// TODO Auto-generated method stub
		return getVelocidadeAtual() == 0 ? true:false;
	}
	
	public void largarPeso(float peso) {
		
		PesoLargard += peso;
		
	}
	
	public void aquecarAr(float temp) {
		
		setVelocidadeAtual(getVelocidadeAtual()+1);	
	}
	
	
}
