package Lista9_Exercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoEscola a1 = new AlunoEscola();
		AlunoGraduacao a2 = new AlunoGraduacao();
		AlunoPos a3 =  new AlunoPos();
		
		a1.imprimeAluno("Fernando");
		a2.imprimeAluno("José", "Ciencias da computação");
		a3.imprimeAluno("João", "Analise de dados");

	}

}
