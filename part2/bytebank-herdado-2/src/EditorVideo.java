//Gerente é um funcionário, gerente herda da classe Funcionario
public class EditorVideo extends Funcionario { // extends cria a herança com o funcionario
	
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}

}