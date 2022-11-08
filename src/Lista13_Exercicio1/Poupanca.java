package Lista13_Exercicio1;

public class Poupanca extends ContaAbstrata{

	public Poupanca(Cliente c, String numeroConta, double saldoInicial, String tipo) {
		
		Cliente cliente = c;
		setNumeroConta(numeroConta);
		setSaldo(saldoInicial);
		setTipo(tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		
		setSaldo(getSaldo()+valor);
		
	}

	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()-valor);
		
	}
	
	 private void renderJuros() {
		 
		 setSaldo(getSaldo() + getSaldo() *0.01);
		  
		  
	  }
	
	

}
