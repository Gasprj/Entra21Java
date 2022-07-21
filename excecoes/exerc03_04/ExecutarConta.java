package excecoes.exerc03_04;

public class ExecutarConta {
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.setLimite(100);
		minhaConta.depositar(100);
		
		try {
			minhaConta.sacar(1000);
		} catch (ContaExcecao e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(minhaConta.getSaldo());
		System.out.println(minhaConta.getLimite());
		System.out.println("Encerrando operação.");
	}

}
