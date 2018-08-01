package eleicoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Eleicoes {

	private List<Candidato> listCandidato = new ArrayList<Candidato>();
	private int votoNulo;
	private int quantidadeVotos;

	public List<Candidato> getListCandidato() {
		return listCandidato;
	}

	private Scanner sc = new Scanner(System.in);

	public int getVotoNulo() {
		return votoNulo;
	}
	
	public void setQuantidadeVotos() {
		quantidadeVotos ++;
	}
	
	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}
	
	public void cadastraCandidato() {
		String nome;
		int numero;

		Candidato candidato = new Candidato();

		System.out.println("Digite o Nome do candidato:");
		nome = sc.next();
		candidato.setNome(nome);

		System.out.println("Digite o Numero do candidato");
		numero = sc.nextInt();
		candidato.setNumero(numero);
		
		listCandidato.add(candidato);
	}

	public void listarCadastros() {

		if (listCandidato.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros sem ordem \n");
			for (int i = 0; i < listCandidato.size(); i++) {
				Candidato d = listCandidato.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + d.getNome());
				System.out.println("\tNumero: " + d.getNumero());
				System.out.println("\tQuantidade: " + d.getQuantidade());

			}
			
			Collections.sort(listCandidato, new ComparatorCandidatos());
			
			System.out.println("\nLista de Cadastros em ordem \n");
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
		
		int candidatoEscolhido;
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
					d.setQuantidade();
					break;
				}else if(candidatoEscolhido == 0 || i == ultimaPosicaoLista) {
					votoNulo += votoNulo;
					break;
				}
			}

			
		}
			
	}
	
}

class ComparatorCandidatos implements Comparator<Candidato>{

	@Override
	public int compare(Candidato primeiroCandidato, Candidato segundoCandidato) {
		return primeiroCandidato.getQuantidade() < segundoCandidato.getQuantidade() ? +1 
				: (primeiroCandidato.getQuantidade() > segundoCandidato.getQuantidade() ? -1 : 0);
	}
	
}
