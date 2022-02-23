//Aluno: Arthur Silva Martins
//Matricula: 2018216002
//Disciplina: Programação Orientada a Objeto
//Professor: Manoel Carvalho
//Período: 2021.2



public class Aluno {
	
	private String nome;
	private String cod_Aluno;
	private String carga_Horaria;
	protected String cod_Disciplina;
	
	public Aluno(String nome, String cod_Aluno, String carga_Horaria, String cod_Disciplina) {
		this.nome = nome;
		this.cod_Aluno = cod_Aluno;
		this.carga_Horaria = carga_Horaria;
		this.cod_Disciplina = cod_Disciplina;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCod_Aluno() {
		return cod_Aluno;
	}
	public void setCod_Aluno(String cod_Aluno) {
		this.cod_Aluno = cod_Aluno;
	}
	public String getCarga_Horaria() {
		return carga_Horaria;
	}
	public void setCarga_Horaria(String carga_Horaria) {
		this.carga_Horaria = carga_Horaria;
	}
	public String getCod_Disciplina() {
		return cod_Disciplina;
	}
	public void setCod_Disciplina(String cod_Disciplina) {
		this.cod_Disciplina = cod_Disciplina;
	}
}
