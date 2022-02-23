package exemploheranca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FormaGeometrica fm = new Quadrado(new Ponto(2,3), new Ponto(7,8));
		System.out.println(fm.calculaArea());
		fm=new Circulo(new Ponto(2,3), new Ponto(7,8));
		System.out.println(fm.calculaArea());
	}

}
