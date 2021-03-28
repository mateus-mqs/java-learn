
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f) {	// mesmo eu "chamando um funcionario" o que vai ser executado � o m�todo espec�fico
		double boni = f.getBonificacao(); // se teve um gerente com referencia de funcionario
		//qual metodo ele chama? o do gerente ou o do funcionario?
		//ele chama o do gerente pois � da classe gerente o objeto
		this.soma = this.soma + boni;
	}
	
	//QUEM DEFINE O QUE PODEMOS CHAMAR � A REFERENCIA: PARTE A ESQUERDA DE UM NOVO OBJETO
	// O OBJETO � DA CLASSE NA PARTE DIREITA DO NOVO OBJETO
	
	public double getSoma() {
		return soma;
	}
	
}
