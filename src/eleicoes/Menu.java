package eleicoes;
import java.util.Scanner;

public class Menu {
 
	private Scanner inputOpcao = new Scanner(System.in);
	
	public  String menuInstrucoes() {
		

		
		System.out.println("Elei��es em Java 2018");
		System.out.println("Selecione uma op��o");
		System.out.println("1 - Cadastrar candidato");
		System.out.println("2 - Iniciar Vota��o");
		System.out.println("3 - Listar Candidatos");
		System.out.println("4 - Apura��o");
		System.out.println("x - Sair");
		
		return inputOpcao.nextLine();
		
		
	}
}

