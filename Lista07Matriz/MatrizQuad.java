package Lista07Matriz;

import java.util.Arrays;

public class MatrizQuad {
	public static void main(String[] args) {
		
		int[][][][] mat = new int[3][3][3][3];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for (int j2 = 0; j2 < mat[i][j].length; j2++) {
					for (int k = 0; k < mat[i][j][j2].length; k++) {
						mat[i][j][j2][k] = (int) (Math.random() * 100);
					}
				}
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for (int j2 = 0; j2 < mat[i][j].length; j2++) {
					for (int k = 0; k < mat[i][j][j2].length; k++) {
						System.out.print(mat[i][j][j2][k] + " ");
					}
					System.out.print(" | ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("\n" + Arrays.toString(mat[1][0][2]) + "\n");
		
		System.out.println("\n" + mat[2][1][1][0] + "\n");
		
		for (int[][][] is : mat) {
			for (int[][] is2 : is) {
				for (int[] is3 : is2) {
					for (int is4 : is3) {
						System.out.print(is4 + " ");
					}
					System.out.print(" | ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for (int j2 = 0; j2 < mat[i][j].length; j2++) {
						System.out.print(Arrays.toString(mat[i][j][j2]) + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
