package AulaThread;

public class CorridaRun implements Runnable{

	private String nome;
	
	public CorridaRun(String nome) {
		this.nome=nome;
		
	}
	
	@Override
	public void run() {
		System.out.println(nome +" Começou...");
		for(int i =0;i < 5; i++) {
			System.out.println(nome + "Já percorreu" + i + " Voltas!");
		}
		System.out.println(nome + " Terminou!");
		
	}

}
