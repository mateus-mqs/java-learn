
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu sal�rio � " + salario);
		
		double divisao = 3.14/2;
		System.out.println(divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5/2;
		System.out.println(novaTentativa); //A primeira coisa que � realizada � a divis�o
		// S� depois que o programa v� que tem q ser double
		
		double novaTentativa2 = 5.0/2;
		System.out.println(novaTentativa2); //Agora ele v� que � um double sobre um int
		//Logo,  resultado ser� em double
	}
}
