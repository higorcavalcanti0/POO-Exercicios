package Lista11_Exercicio1;

public class Cliente extends PessoaFisica implements Autenticavel{

	private double saldo;
	private double 	limite;
	private double chequeEspecial;
	
	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void saca(double valor) {
		
		System.out.println("Valor sacado:" + (saldo - valor));
	}
	
	public void deposita(double valor) {
		
		System.out.println("Valor depositado" + (saldo + valor));
		
	}

	
	public boolean autentica(int senha) {
		
		return true;
	}

}
