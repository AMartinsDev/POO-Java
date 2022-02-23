

public class Professor extends Pesquisador {

	public Professor(String nome, Pesquisador coordenador) {
		super(nome, coordenador);
	}

	public  double getValorPago() {
		double valor=220;
		double valorCoordenador=(this.getCoordenador().getValorPago())*0.3;
		return valor + valorCoordenador;
	}
	
	public  void inserirSupervisionado(Pesquisador pesquisador) {
		
	}
}
