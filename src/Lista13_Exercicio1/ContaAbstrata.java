package Lista13_Exercicio1;

public abstract class ContaAbstrata {
	
	private String numeroConta;
	
	private double Saldo;
	
	private String tipo;
	
	public String getTipo() {
		
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNumeroConta() {
		
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		
		return Saldo;
	}
	
	public void setSaldo(double saldo) {
		
		Saldo = saldo;
	}
	
	
	public abstract void  deposito(double valor);
	
	public abstract  void saque(double valor);

}
