package eleicoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eleicoes {

	List<Candidato> listCandidato = new ArrayList<Candidato>();
	private int votoNulo = 0;
	private int quantidadeVotos;

	private Scanner sc = new Scanner(System.in);

	public void cadastraCandidato() {
		String nome;
		int numero;

		/* for(boolean cadastrando = true;cadastrando = true; ) { */
		Candidato candidato = new Candidato();

		System.out.println("Digite o Nome do candidato:");
		nome = sc.next();
		candidato.setNome(nome);

		System.out.println("Digite o Numero do candidato");

		numero = sc.nextInt();

		candidato.setNumero(numero);
		
		/* cadastrando = false; */
		/*System.out.println("Continuar Cadastrando? S|N");
		continua = sc.next();*/

		/*
		 * if(continua.equalsIgnoreCase("n")) { cadastrando = false; }else { cadastrando
		 * = true; }
		 */

		listCandidato.add(candidato);
		/* } */
	}

	public void listarCadastros() {

		if (listCandidato.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < listCandidato.size(); i++) {
				Candidato d = listCandidato.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + d.getNome());
				System.out.println("\tNumero: " + d.getNumero());
				System.out.println("\tQuantidade: " + d.getQuantidade());

			}
			System.out.println("\nFim da lista\n");
		}
	}

	public void incluirVoto() {
		int candidatoEscolhido = 0;
		int ultimaPosicaoLista = listCandidato.size() -1;
		
		

		if (listCandidato.size() == 0) {
			System.out.println("\nNão existem candidatos cadastrados !!!\n");
		} else {
			
			System.out.println("\nInforme o numero do candidato desejado\n");
			candidatoEscolhido = sc.nextInt();
			
			setQuantidadeVotos();

			for (int i = 0; i < listCandidato.size(); i++) {
				Candidato d = listCandidato.get(i);
				
				if(candidatoEscolhido == d.getNumero() ) {
					System.out.println("chegou");
					d.setQuantidade();
					break;
				}else if(candidatoEscolhido == 0 || i == ultimaPosicaoLista) {
					votoNulo += votoNulo;
					break;
				}
			}

			
		}
			
	}
	
	public int getvotoNulo() {
		return votoNulo;
	}
	
	public void setQuantidadeVotos() {
		quantidadeVotos ++;
	}
	
	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}
}
