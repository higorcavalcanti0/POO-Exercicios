package Lista14_Exercicio1;

public class CadastroConta {
	
	public Conta inserirConta(String cliente, String fornecedor, int numConta,Double contaAPagar, Double contaAReceber) throws
	ExcecaoCadastroCheio,ExcecaoContaJaExistente{
		
		if(existeConta(false)) {
			System.out.println("Conta Inserida");
			
		}else if(cadastroCheio(true)) {
			System.out.println("Cadastro Cheio");
		}else {
			System.out.println("Conta ja existente");
		}
		return null;
		
	}
	
	public Conta buscarConta(int numConta) throws ExcecaoContaNaoExistente {
		
		if(buscarConta(false)) {
			System.out.println("Conta encontrada");
		} else {
			throw new ExcecaoContaNaoExistente("Conta não Existente");
		}
		return null;
	}
	
	public boolean existeConta(boolean existeConta) {
		
		return existeConta;
	}
	public boolean cadastroCheio(boolean cadastroCheio) {
		
		return cadastroCheio;
		
	}
	
	public boolean buscarConta(boolean buscarConta) {
		return buscarConta;
	}
	
}
