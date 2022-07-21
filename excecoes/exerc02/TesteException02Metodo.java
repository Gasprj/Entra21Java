package excecoes.exerc02;

import javax.swing.JOptionPane;

public class TesteException02Metodo {
	public static void main(String[] args) {
		
		metodo01();
		
	}
	
	static void metodo01() {
		int x = 0;
		int y = 0;
		
		System.out.println("Eu sei dividir.");
		
		double r = 0;
		try {
			x = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º valor: "));
			y = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º valor: "));
			r = x / y;
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Digite somente números inteiros diferentes de 0.");
			metodo01();
		}
		
		System.out.println("O resultado da divisão é " + r);
	}

}
