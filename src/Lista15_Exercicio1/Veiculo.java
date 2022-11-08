package Lista15_Exercicio1;

public class Veiculo {
	
	
	private String Chassi;
	private String tipo;
	private Double velocidadeMax;
	
	public Veiculo() {
		
	}
	public Veiculo(String Chassi, String tipo, Double velocidadeMax) {
		this.setTipo(tipo);
		this.Chassi=Chassi;
		this.velocidadeMax=velocidadeMax;
	}
	public void limpar() {
	 System.out.println("O veiculo" + getTipo() + "Está sendo limpo");
 }
	public void ajustar() {
		System.out.println("O veiculo" + getTipo() + "Está sendo ajustado");
		
		
	}
	public void imcrementVeloc(int vell) {
		velocidadeMax += vell;
		
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
