package Lista15_Exercicio1;

public class Bicicleta extends Veiculo{

	private int nrMarchas;
	
	public Bicicleta() {
		
	}
	public Bicicleta(String Chassi, String tipo, Double velocidadeMax) {
		super(Chassi, tipo, velocidadeMax);
	}
	
  public void incrementarVeloc(int vell) {
	  nrMarchas = vell;
	  
  }
}
