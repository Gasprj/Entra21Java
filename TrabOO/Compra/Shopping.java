package OriObj.TrabOO.Compra;

public class Shopping {
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Maria Luiza", 96432, "Rua Pedro Zimmermann 5289");
		
		cl1.addCompra(632);
		cl1.addCompra(633);
		cl1.addCompra(634);
		
		cl1.compra.get(0).addProduto("caneta", 2, 2.15);
		cl1.compra.get(0).addProduto("lápis", 2, 1.05);
		cl1.compra.get(1).addProduto("apontador", 1, 2.20);
		cl1.compra.get(1).addProduto("borracha", 2, 1.65);
		cl1.compra.get(2).addProduto("caderno", 2, 19.90);
		cl1.compra.get(2).addProduto("livro", 4, 32.85);
		
		System.out.println(cl1);
		for (Compra cl : cl1.compra) {
			int n = 0;
			System.out.println(cl);
			for (Produto pr: cl.produtos) {
				System.out.println(pr.toString("\nSoma: " + cl.valTotInd(n)));
				n++;
			}
			System.out.printf("### Total da compra %d: %.2f ###",cl.codComp , cl.valTot());
			System.out.println();
		}
		
	}

}
