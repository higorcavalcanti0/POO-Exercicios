package Lista13_Exercicio1;

public interface BancoGeral {
	
	public abstract void abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo);
	public  abstract void deposito(double  valor);
	public  abstract void saque(double valor);

}
