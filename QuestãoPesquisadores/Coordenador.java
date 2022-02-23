package projetopequsadores;

public class Coordenador extends Pesquisador{

	public Coordenador(String nome, Pesquisador coordenador) {
		super(nome, coordenador);
	}

	@Override
	public double getValorPago() {
		double valor=300;
		double desconto=(this.getNumeroSupervisionados()*0.025)*valor;
		return desconto;
	}

	@Override
	public void inserirSupervisionado(Pesquisador pesquisador) {
		this.supervisonados.add(pesquisador);
		
	}

}
