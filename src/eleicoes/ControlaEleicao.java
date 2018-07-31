package eleicoes;

public class ControlaEleicao {

	public static void main(String[] args) {
		
		String retornoMenu;
		boolean sessaoAberta = true;
		Menu menu = new Menu();
		Eleicoes eleicoes = new Eleicoes();
		
		
		while(sessaoAberta) {
			
			retornoMenu = menu.menuInstrucoes();
			if(retornoMenu.equalsIgnoreCase("1")) {
				eleicoes.cadastraCandidato();
			}else if(retornoMenu.equalsIgnoreCase("2")) {
				eleicoes.incluirVoto();
			}else if(retornoMenu.equalsIgnoreCase("3")) {
				eleicoes.listarCadastros();
			}else if(retornoMenu.equalsIgnoreCase("4")) {
				eleicoes.listarCadastros();
			}else if(retornoMenu.equalsIgnoreCase("x")) {
				sessaoAberta = false;
			}
		}

	}

}
