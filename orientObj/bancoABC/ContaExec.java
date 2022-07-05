package orientObj.bancoABC;

public class ContaExec {
	public static void main(String[] args) {
		
	
		ContaBancaria cc = new ContaBancaria();
		ContaBancaria cc1 = new ContaBancaria();
		
		cc.setNumero(654256);
		cc.setStatus("Especial");
		cc.setSaldo(5600.00);
	
		cc1.setNumero(656329);
		cc1.setStatus("Básica");
		cc1.setSaldo(1200.00);
/*		
		System.out.println("  == Conta Corrente ==");
		System.out.println("________________________");
		System.out.println("Número: " + cc.numero);
		System.out.println("Status: " + cc.status);
		System.out.printf("Saldo: R$%.2f", cc.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", cc.limite);
		System.out.println("\n------------------------\n");
		System.out.println("\n  == Conta Corrente ==");
		System.out.println("________________________");
		System.out.println("Número: " + cc1.numero);
		System.out.println("Status: " + cc1.status);
		System.out.printf("Saldo: R$%.2f", cc1.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", cc1.limite);
		System.out.println("\n------------------------\n");
		
		System.out.println("\n\n");
		
		System.out.println("CC número: " + cc.numero);
		System.out.println(cc.saque(3200.00));
		System.out.printf("Saldo: R$%.2f", cc.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", cc.limite);
		System.out.println("\nEstá usado cheque especial? " + cc.limiteUsado());
		System.out.println("\n\n");
		System.out.println("CC número: " + cc1.numero);
		System.out.println(cc1.saque(2300.00));
		System.out.printf("Saldo: R$%.2f", cc1.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", cc1.limite);
		System.out.println("\nEstá usado cheque especial? " + cc1.limiteUsado());
		
		System.out.println("\n\n");
		
		System.out.println("CC número: " + cc.numero);
		System.out.println(cc.deposito(2200.00));
		System.out.printf("Saldo: R$%.2f", cc.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", cc.limite);
		System.out.println("\n\n");
		System.out.println("CC número: " + cc1.numero);
		System.out.println(cc1.deposito(3800.00));
		System.out.printf("Saldo: R$%.2f", cc1.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", cc1.limite);
*/
		
		cc.informacaoConta();
		cc1.informacaoConta();
		cc.sacar(3200);
		cc1.sacar(2300);
		cc.depositar(2200);
		cc1.depositar(3800);
	}
	
}
