
public abstract class Funcionario { //o abstract nao deixa criar um objeto funcionario
	//mas deixa criar outros objetos com a referencia funcionairo
	//o compilador não permite instanciar um objeto dessa classe. 
	//Para instanciar é preciso criar primeiro uma classe filha não abstrata.
	private String nome;
	private String cpf;
	private double salario;

	//metodo sem corpo, nao ha implementacao
	// agr os filhos precisam de implementar esse metodo, é obrigatorio
	// para colocar metodo abstrato, a classe tbm tem q ser abstrata
	//métodos abstratos jamais podem ter um corpo (implementação).
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
