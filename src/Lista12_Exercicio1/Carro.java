package Lista12_Exercicio1;

public class Carro extends TransporteTerrestre implements Motorizado,Conduzivel{
	
	private int numeroCilindros;

	public int getNumeroCilindros() {
		return numeroCilindros;
	}

	public void setNumeroCilindros(int numeroCilindros) {
		this.numeroCilindros = numeroCilindros;
	}

	@Override
	public void Curvar(float angulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarMotor() {
		// TODO Auto-generated method stub
		System.out.println("Motor ligado!");
	
	}

	@Override
	public void abastecer(int qtdLitros) {
		// TODO Auto-generated method stub
				qtdLitros++;
	
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
	
	public void embreiar() {
		
	}

}
