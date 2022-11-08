package AulaThread;

public class Corrida extends Thread {
	
	private String nome;
	private int tempoHidratacao;
	
	public Corrida(String nome, int tempoHidratacao) {
		
		this.nome=nome;
		this.tempoHidratacao=tempoHidratacao;
		
		start();
	}
		public void run() {
			System.out.println(nome +" Começou...");
			for(int i =0;i < 5; i++) {
				System.out.println(nome + " Já percorreu," + i + " Voltas!");
				try {
					Thread.sleep(tempoHidratacao);
				} catch (InterruptedException e) {
					
					System.out.println(nome +" Foi interrompida");
				}
			}
			System.out.println(nome + " Terminou!");
		}
}
