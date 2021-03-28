//Gerente é um funcionário, gerente herda da classe Funcionario
public class Gerente extends Funcionario { // extends cria a herança com o funcionario
	// lembrando que a classe gerente herda as coisas PUBLICAS!!!
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		return super.getSalario();

		// mesmo com a heranca, o salario é privado a classe funcionario
		// o super serve para mostrar que este atributo esta na classe mae
		// tambem serve para chamar um metodo da classe mae que foi duplicado na filha
	}

}