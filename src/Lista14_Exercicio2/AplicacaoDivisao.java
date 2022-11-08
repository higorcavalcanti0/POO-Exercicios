package Lista14_Exercicio2;

import javax.swing.JOptionPane;

public class AplicacaoDivisao {
	
	public static void main(String[]args) {
		
		
		Divisao div = new Divisao();
		double n1,n2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número"));
		
		try {
			div.calcula(n1, n2);
		} catch (ExcecaoDivisaoPorZero e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
