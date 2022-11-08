package Lista10_Exercicio1;

public class Contas {

	public static void mostrarCalculo(OperacaoMatematica op, double n1, double n2) {
		
		System.out.println(op.calcular(n1, n2));
	}
	
	public static  void  main (String [] args) {
		
		SomaAbs sm = new SomaAbs();
		SubtraiAbs sub = new SubtraiAbs();
		
		mostrarCalculo(sm,7,9);
		mostrarCalculo(sub,10,3);
	}
	
}
