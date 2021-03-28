
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 30;
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta; // a segunda conta passa a referir a primeira conta
		// duas variaveis apontando para um objeto (só deu um 'new')
		System.out.println("saldo da segunda: " + segundaConta.saldo);

		segundaConta.saldo += 100;

		System.out.println("saldo da segunda: " + segundaConta.saldo);
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
	}
}
