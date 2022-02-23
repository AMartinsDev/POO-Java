package LABXI;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco brasil=new Banco();
		brasil.addCliente(new Cliente("Manoel", new Poupanca(1234, 100)),0);
		brasil.addCliente(new Cliente("Maria", new Poupanca(1235, 100)),1);
		brasil.addCliente(new Cliente("Joao", new Poupanca(1236, 100)),2);
		brasil.addCliente(new Cliente("Teresa", new Corrente(1237, 100)),3);
		brasil.sacar(1237, 30);
		brasil.depositar("Manoel", 34);
		brasil.atualizar();
		brasil.consultar(1237);
		System.out.println(brasil.getSaldo());
	}

}
