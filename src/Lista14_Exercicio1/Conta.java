package Lista14_Exercicio1;

public class Conta {
	
	private String cliente, fornecedor;
	private int numConta;
	private double contaAPagar;
	private double ContaAReceber;
	
	public Conta() {
		
	}
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getContaAPagar() {
		return contaAPagar;
	}
	public void setContaAPagar(double contaAPagar) {
		this.contaAPagar = contaAPagar;
	}
	public double getContaAReceber() {
		return ContaAReceber;
	}
	public void setContaAReceber(double contaAReceber) {
		ContaAReceber = contaAReceber;
	}

}
