package Lista10_Exercicio2;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa[] p1 = {new Empregado("Fernando",1200), new Estudante("Carlos","TI")};
		
		System.out.println(p1[0].getDescricao());
		System.out.println(p1[1].getDescricao());

	}

}
