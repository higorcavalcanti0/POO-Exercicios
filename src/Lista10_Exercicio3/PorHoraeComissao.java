package Lista10_Exercicio3;

public class PorHoraeComissao extends PorHora implements Commission{
	
	private double sales;
	
	public PorHoraeComissao(String name, int valorHora, int numHora, double sales) {
		super(name, valorHora, numHora);
		// TODO Auto-generated constructor stub
		this.sales=sales;
		
		
	}

	public void setVendas(double s) {
		this.sales=s;
		
	}
	public void printPay() {
		System.out.println(getPay());
		
	}
	
	public double getPay(){
		return (getNumHora()*getValorHora())+(sales + sales * COMMISSION_HATE);
	}
	

}
