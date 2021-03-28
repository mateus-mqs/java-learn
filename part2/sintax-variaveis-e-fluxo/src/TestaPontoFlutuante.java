
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("Meu salário é " + salario);
		
		double divisao = 3.14/2;
		System.out.println(divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5/2;
		System.out.println(novaTentativa); //A primeira coisa que é realizada é a divisão
		// Só depois que o programa vê que tem q ser double
		
		double novaTentativa2 = 5.0/2;
		System.out.println(novaTentativa2); //Agora ele vê que é um double sobre um int
		//Logo,  resultado será em double
	}
}
