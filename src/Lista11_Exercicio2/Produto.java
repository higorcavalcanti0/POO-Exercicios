package Lista11_Exercicio2;

public class Produto implements DAO{
	
	private int numero;
	private String descricao;
	@Override
	public void inserir() {
		
		
		System.out.println("Produto inserido com sucesso!");
		
	}
	@Override
	public void excluir() {
	
		System.out.println("Produto excluido com sucesso!");
		
	}
	@Override
	public void localizar() {
		
		System.out.println("Localizando produto..");
		
	}
	
	public void baixar() {
		System.out.println("Produto sendo baixado..");
		
	}

}
