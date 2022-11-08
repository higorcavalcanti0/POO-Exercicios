package Lista10_Exercicio2;

public abstract class Pessoa {
	
	private String  nome;
	
	public Pessoa(String nome) {
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}
	
	public abstract String getDescricao();

}
