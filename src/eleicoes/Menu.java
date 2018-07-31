package eleicoes;
import java.util.Scanner;

public class Menu {
 
	private Scanner inputOpcao = new Scanner(System.in);
	
	public  String menuInstrucoes() {
		

		
		System.out.println("Eleições em Java 2018");
		System.out.println("Selecione uma opção");
		System.out.println("1 - Cadastrar candidato");
		System.out.println("2 - Iniciar Votação");
		System.out.println("3 - Listar Candidatos");
		System.out.println("4 - Apuração");
		System.out.println("x - Sair");
		
		return inputOpcao.nextLine();
		
		
	}
}

