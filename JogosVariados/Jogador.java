package Jogos;

public class Jogador {
	private String nome;
	private String parouimpar;
	private int valor;
	
	public String getParouimpar() {
		return parouimpar;
	}
	public void setParouimpar(String parouimpar) {
		this.parouimpar = parouimpar;
	}
	public Jogador(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
