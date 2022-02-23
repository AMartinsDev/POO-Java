

public class Cliente {

	private Conta conta;
	private String nome;
	public Cliente(String nome,Conta conta) {
		this.nome=nome;
		this.conta = conta;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
