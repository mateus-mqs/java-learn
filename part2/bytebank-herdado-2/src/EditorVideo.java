//Gerente � um funcion�rio, gerente herda da classe Funcionario
public class EditorVideo extends Funcionario { // extends cria a heran�a com o funcionario
	
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}

}