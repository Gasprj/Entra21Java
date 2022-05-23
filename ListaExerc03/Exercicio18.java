package ListaExerc03;

public class Exercicio18 {
	
	int quantAcoes;
	double valorComp;
	double valorVenda;
	double taxa;
	
	double valorPago () {
		return quantAcoes * valorComp;
	}
	double valorVendido () {
		return quantAcoes * valorVenda;
	}
	double taxaComp () {
		return (quantAcoes * valorComp) * taxa;
	}
	double taxaVenda () {
		return (quantAcoes * valorVenda) * taxa;
	}
	double lucro () {
		return valorVendido() - (valorPago() + taxaComp() + taxaVenda());
	}

}
