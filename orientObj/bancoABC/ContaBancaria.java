package orientObj.bancoABC;

public class ContaBancaria {
	
	private int numero;
	private double saldo;
	private String status;
	private double limite = 2000;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(String status, int numero, double saldo){
		this.status = status;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String saque(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return "Saque realizado com sucesso no valor de R$ " + valor;
		}else if(valor > this.saldo && valor <= (this.saldo + this.limite)) {
			this.limite -= (valor - this.saldo);
			this.saldo = this.limite - 2000;
			return "Saque realizado com sucesso no valor de R$ " + valor;
		}else
			return "Saque não autorizado.";
	}
	
	public String deposito(double valor) {
		double saldo = this.limite + valor - 2000;
		
		if (this.limite < 2000) {
			this.limite += valor;
			if (this.limite > 2000) {
				this.limite = 2000;
				this.saldo = saldo;
			}
			return "Depósito realizado com sucesso";
		}else {
			this.saldo += valor;
			return "Depósito realizado com sucesso";
		}
	}
	
	public boolean limiteUsado() {
		if(limite < 2000)
			return true;
		else
			return false;
	}
	
	public void informacaoConta() {
		System.out.println("  == Conta Corrente ==");
		System.out.println("________________________");
		System.out.println("Número: " + this.numero);
		System.out.println("Status: " + this.status);
		System.out.printf("Saldo: R$%.2f", this.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", this.limite);
		System.out.println("\n------------------------\n\n");
	}
	
	public void sacar(double valor) {
		System.out.println("CC número: " + this.numero);
		System.out.println(this.saque(valor));
		System.out.printf("Saldo: R$%.2f", this.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", this.limite);
		System.out.println("\nEstá usado cheque especial? " + this.limiteUsado());
		System.out.println("\n\n");
	}
	
	public void depositar(double valor) {
		System.out.println("CC número: " + this.numero);
		System.out.println(this.deposito(valor));
		System.out.printf("Saldo: R$%.2f", this.saldo);
		System.out.printf("%nLimite cheque especial: R$%.2f", this.limite);
		System.out.println("\n\n");
	}

}
