package Lista11_Exercicio2;

public class Cliente implements DAO,Estoque{
	
	private int codigo;
	private String nome;
	@Override
	public void inserir() {
		System.out.println("O cliente foi inserido com sucesso!");
		
	}
	@Override
	public void excluir() {
		
		System.out.println("O cliente foi deletado com sucesso!");
	
		
	}
	@Override
	public void localizar() {
		System.out.println("Localizando Cliente..");
		
	}
	
	
	
	
	

}
