

import java.util.ArrayList;
import java.util.Random;

public class ZeroACem extends Jogo{

	public ZeroACem() {
		super();
	}


	public String rodada() {
		this.jogadas="";
		Random r= new Random();
		for (int i = 0; i < this.participantes.size(); i++) {
			this.participantes.get(i).setValor(r.nextInt(2));
			this.jogadas+=" "+this.participantes.get(i).getNome()+"="+this.participantes.get(i).getValor();
		}
		return this.jogadas;
	}
	
	public String jogar() {
		
		String resultado = "";
		ArrayList<Jogador> zeros = new ArrayList<Jogador>();
		ArrayList<Jogador> uns = new ArrayList<Jogador>();
		this.rodada();
		if (this.participantes.size() > 2) {
			for (int i = 0; i < this.participantes.size(); i++) {
				if (this.participantes.get(i).getValor() == 0) {
					zeros.add(this.participantes.get(i));
				} else {
					uns.add(this.participantes.get(i));
				}
			}

			if (zeros.size() == 1) {
				resultado += " O Jogador " + zeros.get(0).getNome() + " é o vencedor da rodada";
				this.participantes.remove(zeros.get(0));
			} else if (uns.size() == 1) {
				resultado += " O Jogador " + uns.get(0).getNome() + " é o vencedor da rodada";
				this.participantes.remove(uns.get(0));
			}else {
				resultado += "Empate! ";		
			}
		} else {
			resultado = "Só restam 2 jogaores e a partida acabou";
		}
		return resultado;
	}
}
