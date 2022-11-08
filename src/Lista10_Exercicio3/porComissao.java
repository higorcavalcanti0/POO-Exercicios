package Lista10_Exercicio3;

public class porComissao extends Empregado implements Commission{
	
	private double sales;
	
	public porComissao(String name,double sales) {
		super(name);
		this.sales=sales;
	}
	public void setVendas(double s) {
		
	}
	public double getPay() {
		return sales + sales * COMMISSION_HATE;
	}
}
