
public class Corrente extends Conta{

	public Corrente(int numero, double saldo) {
		super(numero, saldo);
	}

	public void atualizacao() {
		double saldo=this.getSaldo();
		saldo=(saldo-1);
		this.setSaldo(saldo);
	}
}
