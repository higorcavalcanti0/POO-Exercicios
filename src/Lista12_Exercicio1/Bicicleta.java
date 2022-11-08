package Lista12_Exercicio1;

public class Bicicleta extends TransporteTerrestre implements Conduzivel{
	
	private int numeroRaios;

	public int getNumeroRaios() {
		return numeroRaios;
	}

	public void setNumeroRaios(int numeroRaios) {
		this.numeroRaios = numeroRaios;
	}

	@Override
	public void Curvar(float angulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estacionar() {
		// TODO Auto-generated method stub
		setVelocidadeAtual(0);
		
	}

	@Override
	public boolean estaParado() {
		// TODO Auto-generated method stub
		return getVelocidadeAtual() == 0 ? true:false;
	}
	
	public void pedalar() {
		
		setVelocidadeAtual(getVelocidadeAtual()+1);
		
	}

}
