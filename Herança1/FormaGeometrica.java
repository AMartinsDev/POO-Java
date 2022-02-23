package exemploheranca;

public class FormaGeometrica {
	
	private String corDaLina;
	private String corDaArea;
	
	public String getCorDaLina() {
		return corDaLina;
	}
	public void setCorDaLina(String corDaLina) {
		this.corDaLina = corDaLina;
	}
	public String getCorDaArea() {
		return corDaArea;
	}
	public void setCorDaArea(String corDaArea) {
		this.corDaArea = corDaArea;
	}
	
	public double distancia(Ponto a, Ponto b) {
		return Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2));
		
	}
	
	public double calculaArea() {
		return 0;
	}
	

}
