package eleicoes;

public class Candidato {

	private String nome;
	private int numero;
	private int quantidade;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade() {
		this.quantidade ++;
	}
		
	
}
