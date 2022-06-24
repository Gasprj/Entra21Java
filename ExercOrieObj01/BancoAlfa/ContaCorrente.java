package ExercOrieObj01.BancoAlfa;

public class ContaCorrente {
	
	int numero;
	double saldo;
	String status;
	double limite = 2000;
	
	String saque(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return "Saque realizado com sucesso no valor de R$ " + valor;
		}else if(valor > this.saldo && valor <= (this.saldo + this.limite)) {
			this.limite -= (valor - this.saldo);
			this.saldo = 0;
			return "Saque realizado com sucesso no valor de R$ " + valor;
		}else
			return "Saque não autorizado.";
	}
	
	String deposito(double valor) {
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
	
	boolean limiteUsado() {
		if(limite < 2000)
			return true;
		else
			return false;
	}

}
