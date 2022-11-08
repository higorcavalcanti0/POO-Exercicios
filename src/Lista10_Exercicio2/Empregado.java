package Lista10_Exercicio2;

public class Empregado extends Pessoa{

	
	private double salario;
	
	
	public Empregado(String nome,double salario) {
		super(nome);
		
		this.salario=salario;
	}

	public String getDescricao() {
		String sal = Double.toString(salario);
		return super.getNome() + "o valor do salario de R$: "+ sal;
		
	}

	public double getSalario() {
		return salario;
	}
	
	public double atualizaSalario(double porPercentual) {
		
		return salario* porPercentual/100;
	}
	
	

}
