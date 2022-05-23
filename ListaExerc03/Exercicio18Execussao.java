package ListaExerc03;

public class Exercicio18Execussao {
	public static void main(String[] args) {
		
		Exercicio18 ex = new Exercicio18();
		ex.quantAcoes = 1000;
		ex.valorComp = 32.87;
		ex.valorVenda = 33.92;
		ex.taxa = 0.02;
		
		double totComp = ex.valorPago();
		double totVenda = ex.valorVendido();
		double taxComp = ex.taxaComp();
		double taxVenda = ex.taxaVenda();
		
		System.out.println("Valor pago na compra: " + totComp);
		System.out.println("Taxa paga na compra: " + taxComp);
		System.out.println("Valor recebido na venda: " + totVenda);
		System.out.println("Taxa paga na venda: " + taxVenda);
		System.out.printf("Lucro ou prejuizo: %.2f", ex.lucro());
		
	}
}
