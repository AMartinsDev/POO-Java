

import java.util.ArrayList;
import java.util.Random;

public abstract class Jogo {
	protected ArrayList<Jogador> participantes;
	protected String jogadas;
	
	public Jogo() {
		this.participantes = new ArrayList<Jogador>();
	}

	public String getJogadas() {
		return this.jogadas;
	}
	
	public void addJogador(Jogador jogador) {		
		this.participantes.add(jogador);
		if(this.participantes.size()>1)
			this.rodada();
	}
	
	public abstract String rodada();

	public abstract String jogar();
}
