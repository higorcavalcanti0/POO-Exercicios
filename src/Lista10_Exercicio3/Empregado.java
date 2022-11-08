package Lista10_Exercicio3;

public abstract class Empregado {
	
	private String name;
	
	public Empregado(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void printPay() {
		System.out.println(getPay());
		
	}
  public abstract double getPay();
}
