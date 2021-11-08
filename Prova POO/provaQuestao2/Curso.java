//Aluno: Arthur Silva Martins
//Matricula: 2018216002
//Disciplina: Programação Orientada a Objeto
//Professor: Manoel Carvalho
//Período: 2021.2

package provaQuestao2;

public class Curso {
	
	private String nome;
	private String cod_Curso;
	private int qtd_Disciplinas;
	private int qtd_Alunos;
	private int duracao_Em_Horas;
	
	public Curso(String nome, String cod_Curso, int qtd_Disciplinas, int qtd_Alunos, int duracao_Em_Horas) {
		
		this.nome = nome;
		this.cod_Curso = cod_Curso;
		this.qtd_Disciplinas = qtd_Disciplinas;
		this.qtd_Alunos = qtd_Alunos;
		this.duracao_Em_Horas = duracao_Em_Horas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCod_Curso() {
		return cod_Curso;
	}

	public void setCod_Curso(String cod_Curso) {
		this.cod_Curso = cod_Curso;
	}

	public int getQtd_Disciplinas() {
		return qtd_Disciplinas;
	}

	public void setQtd_Disciplinas(int qtd_Disciplinas) {
		this.qtd_Disciplinas = qtd_Disciplinas;
	}

	public int getQtd_Alunos() {
		return qtd_Alunos;
	}

	public void setQtd_Alunos(int qtd_Alunos) {
		this.qtd_Alunos = qtd_Alunos;
	}

	public int getDuracao_Em_Horas() {
		return duracao_Em_Horas;
	}

	public void setDuracao_Em_Horas(int duracao_Em_Horas) {
		this.duracao_Em_Horas = duracao_Em_Horas;
	}
	
}
