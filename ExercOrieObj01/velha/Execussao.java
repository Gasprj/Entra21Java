package ExercOrieObj01.velha;

public class Execussao {
	public static void main(String[] args) {
		
		Comandos velha = new Comandos();
		
		while(true) {
			velha.tabuleiro();
			velha.resultado();
			
			if(!velha.geraResult().equals("")) {
				System.out.println(velha.geraResult());
				break;
			}
				
			velha.jogada();

		}
			
		System.out.println("\nFim de jogo!");
		
		velha.ent.close();
	}
}
