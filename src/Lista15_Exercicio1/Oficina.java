package Lista15_Exercicio1;

import javax.swing.JOptionPane;

public class Oficina extends Thread{
	
	private Veiculo[] v1;
	private Double apurado;
	
	public void adicionarVeiculos(Veiculo[] v) {
		
		this.v1=v;
	}
	
	public void atenderProximo() {
		System.out.println("Atendendo...");
		
		Veiculo veiculo = new Veiculo();
		
		for(int i=0; i < v1.length;i++) {
			veiculo.limpar();
			veiculo.ajustar();
			System.out.println("Veiculo Atendido");
		}
		
		System.out.println();
		String resposta = JOptionPane.showInputDialog("Deseja incrementar o veiculo");
		if(resposta == "SIM") {
			veiculo.imcrementVeloc(1);
		}
		else {System.out.println("Obrigado!");}
		
		String verificaTipo = JOptionPane.showInputDialog("Digite o tipo do veiculo!  ");
		if(veiculo.getTipo() == verificaTipo) {
			String resposta1 = JOptionPane.showInputDialog("Deseja trocar o óleo?");
			if(resposta1 == "SIM") {
				Carro carro = new Carro();
				carro.trocaOleo();
			}
			
		}
	}
	

}
