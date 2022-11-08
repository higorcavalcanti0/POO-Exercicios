package Lista13_Exercicio1;

public class Corrente extends ContaAbstrata{

	public Corrente(Cliente c, String numeroConta, double saldoInicial, String tipo) {
		Cliente cliente  = c;
		setNumeroConta(numeroConta);
		setSaldo(saldoInicial);
		setTipo(tipo);
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		
		setSaldo(getSaldo()+valor);
		
	}

	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		
		setSaldo(getSaldo() - (valor -  valor*0.01));
		
	}
 
}
