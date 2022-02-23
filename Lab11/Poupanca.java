package LABXI;

public class Poupanca extends Conta{

	public Poupanca(int numero, double saldo) {
		super(numero, saldo);
	}

	public void atualizacao() {
		double saldo=this.getSaldo();
		saldo=(saldo + (1/100*saldo));
		this.setSaldo(saldo);
	}
}
