package Lista15_Exercicio1;

public class Carro extends Veiculo{
	
	private int combustivel;
	
	public Carro() {
		
	}
 public Carro(String Chassi, String tipo, Double velocidademax) {
	 
	 super(Chassi, tipo, velocidademax);
	 
 }
 
 public void trocaOleo() {
	 System.out.println("O veiculo " + getTipo() + "trocou o oleo");
 }
/**
 * @return the combustivel
 */
public int getCombustivel() {
	return combustivel;
}
/**
 * @param combustivel the combustivel to set
 */
public void setCombustivel(int combustivel) {
	this.combustivel = combustivel;
}
}
