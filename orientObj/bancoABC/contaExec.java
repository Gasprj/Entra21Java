package orientObj.bancoABC;

public class contaExec {
	public static void main(String[] args) {
		
	
		contaBancaria cc = new contaBancaria();
		contaBancaria cc1 = new contaBancaria();
		
		cc.numero = 654256;
		cc.status = "Especial";
		cc.saldo = 5600.00;
	
		cc1.numero = 656329;
		cc1.status = "Básica";
		cc1.saldo = 1200.00;
		
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
	
	}
	
}
