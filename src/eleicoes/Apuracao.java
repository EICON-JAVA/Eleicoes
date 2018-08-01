package eleicoes;


public class Apuracao  {
	
	Eleicoes eleicoes = new Eleicoes();
	
	public void exibeApuracao() {
		
		eleicoes.listarCadastros();
		
		
		System.out.println();
		System.out.println("Quantidade de votos nulos = " + eleicoes.getVotoNulo());
	}
}
