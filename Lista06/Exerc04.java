package Lista06;

import java.util.Scanner;

public class Exerc04 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int sexo = 0;
	int qp =0;
	int qm = 0;
	int qf = 0;
	double altFem = 0;
	double altTot = 0;
	double alt = 0;
	double maisAlto = 0;
	double maisBaixo = 9999;
	
	for(;qp < 5;) {
		System.out.print("Informe o sexo (0=masc, 1=fem): ");
		sexo = ent.nextInt();
		System.out.print("Informe sua altura: ");
		alt = ent.nextDouble();
		
		qp++;
		altTot += alt;
		
		if (alt > maisAlto)
			maisAlto = alt;
		
		if(alt < maisBaixo)
			maisBaixo = alt;
		
		if(sexo == 0) {
			qm++;
		}else if(sexo == 1) {
			altFem += alt;
			qf++;
		}		
	}
	double mediaFem = altFem / qf;
	double mediaPop = altTot / qp;
	double percMasc = (qm * 100) / qp;
			
	System.out.printf("%nA maior altura encontrada foi %.2f e a menor foi %.2f.", maisAlto, maisBaixo);
	System.out.printf("%nA média de altura das mulheres é %.2f.", mediaFem);
	System.out.printf("%nA média de altura da população é %.2f.", mediaPop);
	System.out.printf("%nA quantidade de homens na população é de %.2f por cento", percMasc);

	ent.close();	
		
	}
}
