public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static � da classe e nao do objeto
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + numero);
		System.out.println("total = " + Conta.total);
		
	} // � possivel utilizar outro construtor que recebe um numero de parametros diferentes
	  // se no main um objeto � criado com um valor x, o construtor que ser� chamado vai ser o que tiver com valor x de recebimento de parametros x

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
		if (this.saldo >= valor) {
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

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0){
			System.out.println("nao � possivel numero negativo");
			return;
		}
		
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0){
			System.out.println("nao � possivel numero negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public static void setTotal(int total) {
		Conta.total = total;
	}
}