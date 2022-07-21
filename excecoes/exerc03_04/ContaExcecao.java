package excecoes.exerc03_04;

@SuppressWarnings("serial")
public class ContaExcecao extends Exception{

	public ContaExcecao () {
	}
	
	@Override
	public String getMessage() {
		return String.format("\n## ERRO : Saldo em conta inferior ao valor do saque ##\n");
	}
	
}
