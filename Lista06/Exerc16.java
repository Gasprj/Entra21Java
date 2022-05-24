package Lista06;

import java.util.Scanner;

public class Exerc16 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		double salario = 0;
		char sexo = '0';
		char estCivil = '0';
		
		while (true) {
			String ec = "";
			String sx = "";
			salario = 0;
			idade = 0;
			sexo = '0';
			estCivil = '0';
			
			System.out.print("Informe seu nome ou 'sair' para encerrar: ");
			nome = ent.next();
			
			if(nome.equalsIgnoreCase("sair"))
				break;
			
			System.out.println();
			
			while(!(idade > 0 && idade <= 100)) {
				System.out.print("Informe sua idade: ");
				idade = ent.nextInt();
				
				String id = idade <= 0 || idade > 100 ? "Idade inválida\n\n" : "\n";
				System.out.print(id);
			}
			
			while(!(salario > 0)) {
				System.out.print("Informe seu salário: ");
				salario = ent.nextDouble();
				
				String sl = salario <= 0 ? "Salário inválido\n\n" : "\n";
				System.out.print(sl);
			}
			while(Character.toLowerCase(sexo) != 'f' && Character.toLowerCase(sexo) != 'm') {
				System.out.print("Informe seu sexo digitando 'f' para 'feminino' \nou 'm' para 'masculino': ");
				sexo = ent.next().charAt(0);
				
				switch(Character.toLowerCase(sexo)) {
				case 'f':
					sx = "Feminino";
					System.out.println();
					break;
				case 'm':
					sx = "Masculino";
					System.out.println();
					break;
				default:
					System.out.println("Informação inválida\n");
				}	
			}
			while(Character.toLowerCase(estCivil) != 's' && Character.toLowerCase(estCivil) != 'v' 
				  && Character.toLowerCase(estCivil) != 'c' && Character.toLowerCase(estCivil) != 'd') {
				System.out.print("Informe seu estado civil digitando 's' para 'solteiro', "
								 + "\n'c' para 'casado', 'v' para 'viúvo' ou 'd' para 'divorciado':");
				estCivil = ent.next().charAt(0);
				
				if(Character.toLowerCase(sexo) == 'm') {
					switch(Character.toLowerCase(estCivil)) {
					case 's':
						ec = "Solteiro";
						break;
					case 'c':
						ec = "Casado";
						break;
					case 'd':
						ec = "Divorciado";
						break;
					case 'v':
						ec = "Viúvo";
						break;
					default:
						System.out.println("Informação inválida\n");
					}
				}else if(Character.toLowerCase(sexo) == 'f') {
					switch(Character.toLowerCase(estCivil)) {
					case 's':
						ec = "Solteira";
						break;
					case 'c':
						ec = "Casada";
						break;
					case 'd':
						ec = "Divorciada";
						break;
					case 'v':
						ec = "Viúva";
						break;
					default:
						System.out.println("Informação inválida\n");
					}
				}
			}
			
			String result = "	Nome: " + nome + "\n	Idade: " + idade + "\n	Salário: "
							+ salario + "\n	Sexo: " + sx + "\n	Estado civil: " + ec;
			System.out.println("\n--------------------------------------------");
			System.out.println(result);
			System.out.println("--------------------------------------------\n");
			System.out.println("-NOVA ENTRADA DE DADOS-");
		}
		
		System.out.println("Até a próxima!");
		
		ent.close();	
			
	}

}
