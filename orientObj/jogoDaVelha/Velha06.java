package orientObj.jogoDaVelha;

public class Velha06 {
	
	char[][] mat = {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};
	int cont = 0;
	char jog;
	char x = 'X';
	char o = 'O';
	
	void tabuleiro() {
		for (int i = 0; i < this.mat.length; i++) {
			System.out.println("---------------");
			
			for (int j = 0; j < this.mat[i].length; j++) {
				
				if(this.mat[i][j] == this.jog && this.cont % 2 == 1)
					this.mat[i][j] = 'x';
				else if(mat[i][j] == this.jog && this.cont % 2 == 0)
					this.mat[i][j] = 'o';
				
				System.out.print("| " + this.mat[i][j] + " |");
			}
			
			System.out.println("\n---------------");
		}
	}
	
	char resultado() {
		if((mat[0][0] == mat[0][1] && mat[0][0] == mat[0][2] && mat[0][0] == 'x') ||
				(mat[1][0] == mat[1][1] && mat[1][0] == mat[1][2] && mat[1][0] == 'x') ||
				(mat[2][0] == mat[2][1] && mat[2][0] == mat[2][2] && mat[2][0] == 'x') ||
				(mat[0][0] == mat[1][0] && mat[0][0] == mat[2][0] && mat[0][0] == 'x') ||
				(mat[0][1] == mat[1][1] && mat[0][1] == mat[2][1] && mat[0][1] == 'x') ||
				(mat[0][2] == mat[1][2] && mat[0][2] == mat[2][2] && mat[0][2] == 'x') ||
				(mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == 'x') ||
				(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2] && mat[2][0] == 'x')) {
					return 'x';
			}else if((mat[0][0] == mat[0][1] && mat[0][0] == mat[0][2] && mat[0][0] == 'o') ||
					(mat[1][0] == mat[1][1] && mat[1][0] == mat[1][2] && mat[1][0] == 'o') ||
					(mat[2][0] == mat[2][1] && mat[2][0] == mat[2][2] && mat[2][0] == 'o') ||
					(mat[0][0] == mat[1][0] && mat[0][0] == mat[2][0] && mat[0][0] == 'o') ||
					(mat[0][1] == mat[1][1] && mat[0][1] == mat[2][1] && mat[0][1] == 'o') ||
					(mat[0][2] == mat[1][2] && mat[0][2] == mat[2][2] && mat[0][2] == 'o') ||
					(mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == 'o') ||
					(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2] && mat[2][0] == 'o')) {
						return 'o';
			}else if(this.cont == 10) {
				return 'e';
			}else
				return 'c';
	}
	
	String geraResult() {
		if(resultado() == 'x') 
			return "\nO 'x' venceu!";
		else if (resultado() == 'o')
			return "\nO 'o' venceu!";
		else if(resultado() == 'e')
			return "\nEmpate!";
		else
			return "";
	}
	
	boolean jogada (char jog) {
		boolean result;
		if(jog == '1' || jog == '2' || jog == '3' || jog == '4' || jog == '5' 
				|| jog == '6' || jog == '7' || jog == '8' || jog == '9') {
			this.jog = jog;
			result = true;
		}else
			result = false;
		return result;
	}

}
