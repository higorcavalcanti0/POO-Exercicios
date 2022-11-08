package Lista10_Exercicio2;

public class Estudante extends Pessoa{
	
	private String areaEstudo;

	public Estudante(String nome, String areaEstudo) {
		super(nome);
		
		this.areaEstudo=areaEstudo;
		
	}

  public String getDescricao() {
	  return super.getNome() + " Estuda na area de: " + areaEstudo;
  }

public String getAreaEstudo() {
	return areaEstudo;
}

}
