package Lista10_Exercicio3;

public class FolhaDePagamento {

	public static void main(String[] args) {
		
		Empregado e1 = new porComissao("João",3200);
		System.out.println("Nome:" +e1.getName());
		System.out.println("Valor recebido");
		e1.printPay();
		
		Empregado e2 = new PorHora("Lucas",5,3);
		System.out.println("Nome: " + e2.getName());
		System.out.println("Valor por Hora");
		e2.printPay();
		
		Empregado e3 = new PorHoraeComissao("Carlos",4,8,1200);
		System.out.println("Nome: " + e3.getName());
		System.out.println("Valor por Hora e Comissão");
		e3.printPay();
		

	}

}
