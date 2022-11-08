package Lista13_Exercicio1;

public class Banco implements BancoGeral{
	public  ContaAbstrata conta;
	@Override
	public void abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {
		
		if(tipo == "c") {
			conta = new Corrente(c,numeroConta,saldoInicial,"Corrente");
		}if(tipo == "p") {
			conta  = new Poupanca(c,numeroConta,saldoInicial,"Poupança");
		}else if(tipo != "c" && tipo != "p") {
		System.out.println("Esse tipo não existe");
		};
		
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		conta.deposito(valor);
	}

	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		conta.saque(valor);
	}
	
	

}
