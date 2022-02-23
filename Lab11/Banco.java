

public class Banco {

	private Cliente lista[]= new Cliente[4];
	private double saldo;
	public void addCliente(Cliente cliente, int index) {
				this.lista[index]=cliente;
				
	}
	
	
	public double getSaldo() {
		this.saldo=0;
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				this.saldo+=this.lista[i].getConta().getSaldo();
			}
		}
		return this.saldo;
	}
	
	public void atualizar() {
		
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				this.lista[i].getConta().atualizacao();
			}
		}
		System.out.println("Valores atualizados com sucesso!");
	}
	
	public void depositar(String nome, double valor) {
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				if(this.lista[i].getNome().equalsIgnoreCase(nome)) {
					this.lista[i].getConta().depositar(valor);
				}
			}
			i=5;
		}
		System.out.println("Valor depositado com sucesso!");
	}
	
	public void depositar(int numero, double valor) {
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				if(this.lista[i].getConta().getNumero()==numero) {
					this.lista[i].getConta().depositar(valor);
				}
			}
			i=5;
		}
		System.out.println("Valor depositado com sucesso!");
	}
	
	public void sacar(String nome, double valor) {
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				if(this.lista[i].getNome().equalsIgnoreCase(nome)) {
					this.lista[i].getConta().sacar(valor);
				}
			}
			i=5;
		}
		System.out.println("Valor sacado com sucesso!");
	}
	
	public void sacar(int numero, double valor) {
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				if(this.lista[i].getConta().getNumero()==numero) {
					this.lista[i].getConta().sacar(valor);
				}
			}
		}
		System.out.println("Valor sacado com sucesso!");
	}
	
	public void consultar(String nome) {
		int existe=0;
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				if(this.lista[i].getNome().equalsIgnoreCase(nome)) {
					System.out.println("O Seu saldo é ... "+this.lista[i].getConta().getSaldo());
					i=5;
					existe=1;
				}
			}
			
		}
		if(existe==0) {
		System.out.println("Cliente não existe!");
	}
}
	
	public void consultar(int numero) {
		int existe=0;
		for(int i=0;i<4;i++) {
			if(this.lista[i]!=null) {
				if(this.lista[i].getConta().getNumero()==numero) {
					System.out.println("O Seu saldo é ... "+this.lista[i].getConta().getSaldo());
					i=5;
					existe=1;
				}
			}
			
		}
		if(existe==0) {
		System.out.println("Cliente não existe!");
	}
}
}
