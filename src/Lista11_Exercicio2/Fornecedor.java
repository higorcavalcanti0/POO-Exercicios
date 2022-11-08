package Lista11_Exercicio2;

public class Fornecedor implements DAO{
	
	private String cnpj;
	private String razaoSocial;
	@Override
	public void inserir() {
		System.out.println("Fornecedor inserido com sucesso!");
		
	}
	@Override
	public void excluir() {
		System.out.println("Fornecedor Deletado com sucesso!");
		
	}
	@Override
	public void localizar() {
		System.out.println("Localizando Fornecedor..");
		
	}
	
	
	

}
