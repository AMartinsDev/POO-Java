//Aluno: Arthur Silva Martins
//Matricula: 2018216002
//Disciplina: Programação Orientada a Objeto
//Professor: Manoel Carvalho
//Período: 2021.2



public class Disciplina {

	private String cod_Disc;
	private String nome;
	private String sigla;
	private String docente;
	private int qtd_Aulas;

	public Disciplina(String cod_Disc, String nome, String sigla, String docente, int qtd_Aulas) {
		
		this.cod_Disc = cod_Disc;
		this.nome = nome;
		this.sigla = sigla;
		this.docente = docente;
		this.qtd_Aulas = qtd_Aulas;
	}

	public String getCod_Disc() {
		return cod_Disc;
	}

	public void setCod_Disc(String cod_Disc) {
		this.cod_Disc = cod_Disc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public int getQtd_Aulas() {
		return qtd_Aulas;
	}

	public void setQtd_Aulas(int qtd_Aulas) {
		this.qtd_Aulas = qtd_Aulas;
	}

}
