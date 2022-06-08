package Lista08;

public class Quest03 {
	public static void main(String[] args) {
		
		
		int[][] aleat = {{2,5,4,8,9}, {9,6,5,4,7}, {8,7,5,6,1}, {3,6,5,4,7}, {3,4,5,7,6}};
		int maior5 = Integer.MIN_VALUE;
		int menor5 = Integer.MAX_VALUE;
		int maior7 = Integer.MIN_VALUE;
		int menor7 = Integer.MAX_VALUE;
		
		for (int i = 0; i < aleat.length; i++) {
			for (int j = 0; j < aleat[i].length; j++) {
				System.out.print(" " + aleat[i][j] + " ");
				
				if(aleat[1][j] > maior5)
					maior5 = aleat[1][j];
				if(aleat[1][j] < menor5)
					menor5 = aleat[1][j];
				if(aleat[i][3] > maior7)
					maior7 = aleat[i][3];
				if(aleat[i][3] < menor7)
					menor7 = aleat[i][3];
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Maior número na linha 1: " + maior5);
		System.out.println("Menor número na linha 1: " + menor5);
		System.out.println("Maior número na coluna 3: " + maior7);
		System.out.println("Menor número na coluna 3: " + menor7);
		
	}

}
