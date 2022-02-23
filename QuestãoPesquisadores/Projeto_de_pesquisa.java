

import java.util.ArrayList;

public class Projeto_de_pesquisa extends Pesquisador {
	
	public void inserirPesquisadorMaior(){
		this.armazenador.add(this.getPesqMaior());
		x[0] = 0;
	}
	
	public void inserirPesquisador() {
		
		int i = 0;
		
		if(tipo == 1) {
			this.armazenador.add(getCoordenador());
			x[i + 1] = armazenador.lastIndexOf(armazenador);
			i++;
		}
		else if(tipo == 2) {
			this.armazenador.add(getProfessor());
			y[i + 1] = armazenador.lastIndexOf(armazenador);
			i++;	
		}
	}

	
	public int getQtdPesquisador(int qtd){
		
		int cont=0;
		
		for(int i=0; i < armazenador.size(); i++){
			if(this.pesq().equalsIgnoreCase(getCoordenador())) {
				for(int j = armazenador.indexOf(getCoordenador()); j < armazenador.size(); j++ ) {
					cont++;
				}
			}
		}
		cont = cont + armazenador.indexOf(getProfessor());
		qtd = cont;
		return qtd;
	}
	
	public int getQtdPesquisador2(int qtd) {
		
		int cont=0;
		
		for(int i=0; i < armazenador.size(); i++){
			if(this.pesq().equalsIgnoreCase(getProfessor())) {
					cont = armazenador.indexOf(getProfessor());
				}
			}
		qtd = cont;
		return qtd;
	}
}

