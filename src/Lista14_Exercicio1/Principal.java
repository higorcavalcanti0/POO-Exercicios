package Lista14_Exercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws ExcecaoDadoInvalido {
		// TODO Auto-generated method stub
		
		CadastroConta conta = new CadastroConta();
		
		String cliente;
		String fornecedor;
		int numConta;
		double contaAPagar;
		double contaAReceber;
		try {
			
		cliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		
		fornecedor = JOptionPane.showInputDialog("Digite o nome do fornecedor");
		
		numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta"));
		
		contaAPagar = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta a Pagar!"));
		
		contaAReceber = Double.parseDouble(JOptionPane.showInputDialog("Valor das conta a receber"));
		
		conta.inserirConta(cliente, fornecedor, numConta, contaAPagar, contaAReceber);
		conta.buscarConta(numConta);
		}catch (ExcecaoContaJaExistente e) {
			System.out.println(e.getMessage());
		}catch(ExcecaoCadastroCheio e) {
			System.out.println(e.getMessage());
		}catch (ExcecaoContaNaoExistente e) {
			System.out.println(e.getMessage());
		}
	}

}
