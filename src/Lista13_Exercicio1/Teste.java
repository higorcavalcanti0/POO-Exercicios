package Lista13_Exercicio1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new  Cliente("Junior","123456789");
		Banco b1  = new Banco();
		
		b1.abrirConta(c1, "123489", 350.00, "c");
		b1.deposito(100.00);
		b1.saque(10.00);
		
		System.out.println("Nome:"+c1.getNome()+"|CPF: " + c1.getCpf()+ "|Conta: "  + b1.conta.getTipo() +"|Saldo:" + b1.conta.getSaldo());
		
		Cliente c2 =  new Cliente("Carlos","321654897");
		Banco b2 =  new Banco();
		b2.abrirConta(c2, "321654", 750.00, "p");
		b2.deposito(350.00);
		b2.saque(200.00);
		System.out.println("Nome:" + c2.getNome()+"|CPF: " +c2.getCpf()+"|Conta" + b2.conta.getTipo()  + "|Saldo: "+ b2.conta.getSaldo());
	}

}
