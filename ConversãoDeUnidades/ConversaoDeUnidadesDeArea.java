//Aluno: Arthur Silva Martins
//Matricula: 2018216002
//Disciplina: Programação Orientada a Objeto
//Professor: Manoel Carvalho
//Período: 2021.2


public class ConversaoDeUnidadesDeArea {
	
	protected float metroQuadrado;
	protected float peQuadrado;
	protected float milhaQuadrada;
	protected float acre;
	protected float centimetrosQuadrados;
	
	public float getMetroQuadrado() {
		return metroQuadrado;
	}
	public void setMetroQuadrado(float metroQuadrado) {
		this.metroQuadrado =  (float) (peQuadrado / 10.76);
	}
	public float getPeQuadrado() {
		return peQuadrado;
	}
	public void setPeQuadrado(float peQuadrado) {
		this.peQuadrado =  (float) (metroQuadrado * 10.76);
	}
	public float getMilhaQuadrada() {
		return milhaQuadrada;
	}
	public void setMilhaQuadrada(float milhaQuadrada) {
		this.milhaQuadrada = acre / 640;
	}
	public float getAcre() {
		return acre;
	}
	public void setAcre(float acre) {
		this.acre = peQuadrado / 43560;
	}
	public float getCentimetrosQuadrados() {
		return centimetrosQuadrados;
	}
	public void setCentimetrosQuadrados(float centimetrosQuadrados) {
		this.centimetrosQuadrados = peQuadrado * 929;
	}
	
	
}
