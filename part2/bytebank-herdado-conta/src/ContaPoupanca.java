
public class ContaPoupanca extends Conta {

		public ContaPoupanca(int agencia, int numero) {
			super(agencia, numero);
		}
		
		@Override
		public void deposita(double valor) {
			super.saldo += valor; // eu posso usar tanto o this quanto o super mas pra mostrar q vem de uma classe nae, utilizar super
			
		}
}
