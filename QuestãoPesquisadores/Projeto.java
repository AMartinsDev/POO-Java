package projetopequsadores;

import java.util.ArrayList;

public class Projeto {
	
	private Coordenador raiz;
	
	public Projeto() {
		raiz=new Coordenador("Mara Andrade", null);
	}
	
	public void addPesquisador(String nome, String tipo, String coordenador) {
		Pesquisador chefe = this.raiz.getByNome(coordenador);
		Pesquisador novo=null;
		if(tipo.equalsIgnoreCase("Coordenador")) {
			novo=new Coordenador(nome, chefe);
		}else {
			novo=new Professor(nome, chefe);
		}
		chefe.inserirSupervisionado(novo);
	}
	
	public Coordenador getRaiz() {
		return raiz;
	}


}
