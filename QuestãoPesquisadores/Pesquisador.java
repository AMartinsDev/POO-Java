

import java.util.ArrayList;

public abstract class Pesquisador {
	
	private Pesquisador coordenador;
	protected ArrayList<Pesquisador> supervisonados;
	private String nome;
	
	
	public Pesquisador(String nome, Pesquisador coordenador) {
		this.nome=nome;
		this.coordenador=coordenador;
		this.supervisonados= new ArrayList<>();
	}
	
	public Pesquisador getByNome(String nome) {
		if (this.getNome().equalsIgnoreCase(nome)) {
            return this;
        }

        Pesquisador retorno = null;
        int i = 0;
        while ((i < this.supervisonados.size()) && (retorno == null)) {
            retorno = (this.supervisonados.get(i)).getByNome(nome);
            i++;
        }
        return retorno;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getNumeroSupervisionados() {
		return this.supervisonados.size();
	}
	
	public void setCoordenador(Pesquisador coordenador) {
		this.coordenador=coordenador;
	}
	
	public Pesquisador getCoordenador() {
		return this.coordenador;
	}
	
	public abstract double getValorPago();
	
	public abstract void inserirSupervisionado(Pesquisador pesquisador);
}
