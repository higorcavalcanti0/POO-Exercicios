package Lista12_Exercicio1;

public abstract class Transporte {
	
	private String nome;
	private int numeroPassageiro;
	private int velocidadeAtual;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroPassageiro() {
		return numeroPassageiro;
	}
	public void setNumeroPassageiro(int numeroPassageiro) {
		this.numeroPassageiro = numeroPassageiro;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	
	public abstract boolean estaParado();

}
