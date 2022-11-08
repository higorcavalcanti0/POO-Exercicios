package Lista12_Exercicio1;

public class Aviao extends TransporteAereo implements Motorizado {
	
	
	public int getNumeroMotores() {
		return numeroMotores;
	}

	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}

	private int numeroMotores;

	@Override
	public void subir(int metros) {
		// TODO Auto-generated method stub
		setAltitudeAtual(getAltitudeAtual()+metros);
		
		
	}

	@Override
	public void descer(int metros) {
		// TODO Auto-generated method stub
		setAltitudeAtual(getAltitudeAtual()-metros);
	}

	@Override
	public boolean estaParado() {
		
		
		return getVelocidadeAtual() == 0 ? true:false;
	}

	@Override
	public void ligarMotor() {
		// TODO Auto-generated method stub
		System.out.println("Motor ligado!");
	}

	@Override
	public void abastecer(int qtdLitros) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
