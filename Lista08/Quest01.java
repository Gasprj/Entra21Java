package Lista08;

public class Quest01 {
	public static void main(String[] args) {
		
		int[][] aleat = {{5,2,3,6}, {9,5,2,4}}; 
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		for (int i = 0; i < aleat.length; i++) {
			for (int j = 0; j < aleat[i].length; j++) {
				System.out.print(" " + aleat[i][j] + " ");
				if(maior < aleat[i][j]) {
					maior = aleat[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("%nO maior número é %d, e está na posição linha %d / coluna %d.", maior, linha, coluna);
		
	}

}
