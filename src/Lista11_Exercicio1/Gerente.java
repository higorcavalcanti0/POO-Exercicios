package Lista11_Exercicio1;

public class Gerente extends Funcionario implements Autenticavel{

	
	
	private int senha;
	private int numFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		
		boolean test = this.senha == senha ? true:false;
		
		return test;
	}

	@Override
	public double getBonificacao() {
		
		return 0*15*getSalario();
	}
	
	
}
