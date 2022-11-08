package Lista10_Exercicio3;

public class PorHora extends Empregado {
	
	private int  valorHora;
	private int numHora;

	public PorHora(String name, int valorHora, int numHora) {
		
		super(name);
		this.numHora=numHora;
		this.valorHora=valorHora;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return valorHora*numHora;
	}

	public int getValorHora() {
		return valorHora;
	}

	public int getNumHora() {
		return numHora;
	}
	
	

}
