package Lista15_Exercicio1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo[] b1 = {new Bicicleta("805X48650", "Bicicleta", 30.0), new Bicicleta(), new Carro(), new Carro()};
		
		Oficina of1 = new Oficina();
		
		of1.adicionarVeiculos(b1);
		
		for(int i=0;i < 4;i++) {
			
			of1.atenderProximo();
		}

	}

}
