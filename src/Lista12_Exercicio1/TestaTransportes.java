package Lista12_Exercicio1;

public class TestaTransportes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aviao a1 = new Aviao();
		
		a1.setNome("Avião");
		a1.ligarMotor();
		a1.setAltitudeAtual(300);
		a1.setNumeroMotores(2);
		a1.setNumeroPassageiro(200);
		a1.setVelocidadeAtual(250);
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Altitude: " + a1.getAltitudeAtual());
		System.out.println("Motores:" + a1.getNumeroMotores());
		System.out.println("Está parado:" + a1.estaParado());
		
		Balao b1 = new Balao();
		
		
		b1.setNome("Balão");
		b1.descer(7);
		b1.setPesoLargard(5);
		b1.setAltitudeAtual(100);
		b1.setVelocidadeAtual(80);
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Altitude: " + a1.getAltitudeAtual());
		System.out.println("Motores:" + a1.getNumeroMotores());
		System.out.println("Está parado:" + a1.estaParado());
		
		Carro c1 = new Carro();
		
		c1.setNome("Carro");
		c1.ligarMotor();
		c1.setNumeroCilindros(4);
		c1.setNumeroPassageiro(5);
		c1.setVelocidadeAtual(50);
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Velocidade: " + c1.getVelocidadeAtual());
		System.out.println("Passageiros: " + c1.getNumeroPassageiro());
		System.out.println("Está parado; " + c1.estaParado());
		
		
		
		

	}

}
