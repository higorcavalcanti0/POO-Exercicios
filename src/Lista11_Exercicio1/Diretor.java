package Lista11_Exercicio1;

public class Diretor extends Funcionario implements Autenticavel{

	
	private int senha;
	
	public boolean autentica(int senha) {
		
		boolean test = this.senha == senha ? true:false;
		
		return test;
		
	}
	
	public double getBonificacao() {
		
		return 0.10*getSalario();
	}
	
	
}
