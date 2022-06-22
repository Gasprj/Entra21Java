package ExercOrieObj01.BancoAlfa;

public class ContaCorrenteExec {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaCorrente cc1 = new ContaCorrente();
		
		cc.numero = 654256;
		cc.status = "Especial";
		cc.saldo = 8624.86;
		cc.limite = 3820.65;
	
		cc1.numero = 656329;
		cc1.status = "Básica";
		cc1.saldo = 3254.41;
		cc1.limite = 1655.65;
		
		System.out.println("  == Conta Corrente ==");
		System.out.println("________________________");
		System.out.println("Número: " + cc.numero);
		System.out.println("Status: " + cc.status);
		System.out.println("Saldo: " + cc.saldo);
		System.out.println("Limite cheque especial: " + cc.limite);
		System.out.println("------------------------\n");
		System.out.println("\n  == Conta Corrente ==");
		System.out.println("________________________");
		System.out.println("Número: " + cc.numero);
		System.out.println("Status: " + cc.status);
		System.out.println("Saldo: " + cc.saldo);
		System.out.println("Limite cheque especial: " + cc.limite);
		System.out.println("------------------------\n");
	
	}

}
