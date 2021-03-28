
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoMateus = new Conta();
		contaDoMateus.saldo = 100;
		contaDoMateus.deposita(50);
		System.out.println(contaDoMateus.saldo);
		boolean conseguiuRetirar = contaDoMateus.saca(20);
		System.out.println(contaDoMateus.saldo);
		System.out.println(conseguiuRetirar);
		Conta contaDaPolly = new Conta();
		contaDaPolly.deposita(1000);
		contaDoMateus.transfere(100, contaDaPolly);
		System.out.println(contaDoMateus.saldo);
		System.out.println(contaDaPolly.saldo);
	}
}
