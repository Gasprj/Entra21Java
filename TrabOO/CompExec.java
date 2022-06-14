package OriObj.TrabOO;

public class CompExec {
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Antonio Carlos", 658479665, "Rua Arnold Back 235, apto 203");
		cl1.compra.add(new Compra(1218));
		cl1.compra.get(0).produtos.add(new Produto("caneta", 3, 2.5));
		cl1.compra.get(0).produtos.add(new Produto("lápis", 3, 1.5));
		cl1.compra.get(0).produtos.add(new Produto("borracha", 2, 1.2));
		
		cl1.compra.add(new Compra(1324));
		cl1.compra.get(1).produtos.add(new Produto("apontador", 2, 2.3));
		cl1.compra.get(1).produtos.add(new Produto("resma de papel", 1, 19.9));
		cl1.compra.get(1).produtos.add(new Produto("caderno", 4, 11.6));
		
		System.out.println(cl1 + "\n");
		
		for (Compra cl : cl1.compra) {
			int cont = 0;
			System.out.println(cl);
			
			for (Produto pd : cl.produtos) {
				System.out.println(pd.toString("\nSoma: " + cl.valTotInd(cont)));
				cont++;
			}
			
			System.out.printf("### Total da compra %d: %.2f ###",cl.codComp , cl.valTot());
			System.out.println("\n\n");
		}
		
	}

}
