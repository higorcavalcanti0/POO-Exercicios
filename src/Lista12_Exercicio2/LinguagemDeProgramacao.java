package Lista12_Exercicio2;

public class LinguagemDeProgramacao extends Modelo implements Imprimivel{
	
	private String nomeDaLinguagem;
	
	public LinguagemDeProgramacao(String nomeDaEmpresa, String nomeDaLinguagem) {
		super(nomeDaEmpresa);
		this.nomeDaLinguagem=nomeDaLinguagem;
	}



	@Override
	public void imprimeStatus(boolean teste) {
		if(teste  == true) {
			System.out.println(toString());
		}
		
	}

	@Override
	public String toString() {
		
		return "Empresa: " + getNomeDaEmpresa() + " Linguagem:  " + nomeDaLinguagem ;
	}
	
	

}
