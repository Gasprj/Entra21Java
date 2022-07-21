package excecoes.exerc03_04;

public class Conta {
	
	private double saldo;
	private double limite;
	
	public Conta() {
	}

	public Conta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double valor) {
		double saldo = this.limite + valor - 100;
		
		if (this.limite < 100) {
			this.limite += valor;
			if (this.limite > 100) {
				this.limite = 100;
				this.saldo = saldo;
			}
			System.out.println("Depósito realizado com sucesso");
		}else {
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso");
		}
	}
	
	public void sacar(double valor) throws ContaExcecao {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso no valor de R$ " + valor);
		}else if(valor > this.saldo && valor <= (this.saldo + this.limite)) {
			this.limite -= (valor - this.saldo);
			this.saldo = 0;
			System.out.println("Saque realizado com sucesso no valor de R$ " + valor);
		}else
			throw new ContaExcecao();
	}
	
}
