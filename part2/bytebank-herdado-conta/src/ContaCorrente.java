
public class ContaCorrente extends Conta implements Tributavel {
	// OS CONTRUTORES NAO PASSAM PARA AS CLASSES FILHAS
	
	
	public ContaCorrente(int agencia, int numero) { // dentro deste construtor é chamado automaticamente o construtor da classe mae
		super(agencia, numero);
	}
	// se colocarmos o construtor para receber os paremetros que o construtor especifico que criamos recebe,
	// este construtor acima irá utilizar o construtor mae criado
	
	@Override //diz pro compilador q esse metodo é o mesmo na classe mae
	public boolean saca(double valor) { // essa linha tem q ser igual ao mesmo metodo na classe mae
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
