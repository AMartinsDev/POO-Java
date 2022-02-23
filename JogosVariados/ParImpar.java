package Jogos;

import java.util.Random;

public class ParImpar extends Jogo {

	public String rodada() {
		this.jogadas = "";
		Random r = new Random();
		int parouimpar = r.nextInt(2);
		if (parouimpar == 0) {
			this.participantes.get(0).setParouimpar("PAR");
			this.participantes.get(1).setParouimpar("IMPAR");
		} else {
			this.participantes.get(0).setParouimpar("IMPAR");
			this.participantes.get(1).setParouimpar("PAR");
		}
		this.participantes.get(0).setValor(r.nextInt(11));
		this.participantes.get(1).setValor(r.nextInt(11));

		this.jogadas += " " + this.participantes.get(0).getNome() + "=" + this.participantes.get(0).getValor()+" escolheu = "+this.participantes.get(0).getParouimpar();
		this.jogadas += " " + this.participantes.get(1).getNome() + "=" + this.participantes.get(1).getValor()+" escolheu = "+this.participantes.get(1).getParouimpar();
		return this.jogadas;
	}

	public String jogar() {
		int valor = this.participantes.get(0).getValor()+this.participantes.get(1).getValor();
		if(valor%2==0) {
			return "Jogador PAR venceu";
		}else {
			return "Jogador IMPAR venceu";
		}
	}
}
