package Lista05.ListaExt;

import java.util.Scanner;

public class Exerc05 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		System.out.print("Informe o valor da hora de trabalho: ");
		double valor = ent.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas no mês:");
		double hora = ent.nextDouble();
		
		double salario = valor * hora;
		double descIR = 0;
		
		if(salario <= 900) {
			descIR = 0;
		}else if(salario > 900 && salario <= 1500) {
			descIR = salario * 0.05;
		}else if(salario > 1500 && salario <= 2500) {
			descIR = salario * 0.1;
		}else
			descIR = salario * 0.2;
		
		double inss = salario * 0.1;
		double fgts = salario * 0.11;
		double totDesc = inss + descIR;
		double sl = salario - totDesc;
		
		
		System.out.println("\nSalario Bruto: (" + valor + " * " + hora + ")= R$ " + salario);
		System.out.println("(-) IR (5%) = R$ " + descIR);
		System.out.println("(-) INSS (10%)= R$ " + inss);
		System.out.println("FGTS (11%)= R$ " + fgts);
		System.out.println("Total de descontos= R$ " + totDesc);
		System.out.println("Salário liquido= R$ " +  sl);
		
		ent.close();
	}
}
