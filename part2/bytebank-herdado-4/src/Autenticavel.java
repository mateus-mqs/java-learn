// uma interface é uma classe com tudo abstrato, napo pode ter nada concreto, nem variaveis
//meio que definimos um contarto do Autenticavel
	//quem assinar esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica
//nao existe extends para interface, existe implements
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
