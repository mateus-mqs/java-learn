public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	void deposita(double valor) {
		this.saldo = this.saldo + valor;
		// o this serve para falar que o valor � da conta a qual o m�todo foi invocado
		// nesse caso � meio opcional
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>= valor ) {
			this.saldo -= valor;
			destino.deposita(valor);
			return false;
		} else {
			return false;
		}
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}
}