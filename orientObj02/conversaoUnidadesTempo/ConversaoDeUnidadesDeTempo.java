package orientObj02.conversaoUnidadesTempo;

import java.math.BigDecimal;

public class ConversaoDeUnidadesDeTempo {
	
	static public void converterMinutos(double x) {
		BigDecimal min = new BigDecimal(x);
		BigDecimal seg = new BigDecimal(60);
		BigDecimal resultado = min.multiply(seg);
		if(x > 0 && x <= 1) {
			System.out.println(" ## " + x + " Minuto ##");
			System.out.println("Conversão para segundos: " + resultado.toPlainString() + "\n");
		}else if(x > 1) {
			System.out.println(" ## " + x + " Minutos ##");
			System.out.println("Conversão para segundos: " + resultado.toPlainString() + "\n");
		}else
			System.out.println("Valor inválido\n");
	}
	
	static public void converterHoras(double x) {
		BigDecimal hora = new BigDecimal(x);
		BigDecimal min = new BigDecimal(60);
		BigDecimal resultado = hora.multiply(min);
		double res = resultado.doubleValue();
		if(x > 0 && x <= 1) {
			System.out.println(" ## " + x + " Hora ##");
			System.out.println("Conversão para minutos: " + resultado.toPlainString());
			converterMinutos(res);
		}else if(x > 1) {
			System.out.println(" ## " + x + " Horas ##");
			System.out.println("Conversão para minutos: " + resultado.toPlainString());
			converterMinutos(res);
		}else
			System.out.println("Valor inválido\n");
	}
	
	static public void converterDia(double x) {
		BigDecimal dia = new BigDecimal(x);
		BigDecimal hora = new BigDecimal(24);
		BigDecimal resultado = dia.multiply(hora);
		double res = resultado.doubleValue();
		if(x > 0 && x <= 1) {
			System.out.println(" ## " + x + " Dia ##");
			System.out.println("Conversão para horas: " + resultado.toPlainString());
			converterHoras(res);
		}else if(x > 1) {
			System.out.println(" ## " + x + " Dias ##");
			System.out.println("Conversão para horas: " + resultado.toPlainString());
			converterHoras(res);
		}else
			System.out.println("Valor inválido\n");
	}
	
	static public void converterSemana(double x) {
		BigDecimal sem = new BigDecimal(x);
		BigDecimal dia = new BigDecimal(7);
		BigDecimal resultado = sem.multiply(dia);
		double res = resultado.doubleValue();
		if(x > 0 && x <= 1) {
			System.out.println(" ## " + x + " Semana ##");
			System.out.println("Conversão para dias: " + resultado.toPlainString());
			converterDia(res);
		}else if(x > 1) {
			System.out.println(" ## " + x + " Semanas ##");
			System.out.println("Conversão para dias: " + resultado.toPlainString());
			converterDia(res);
		}else
			System.out.println("Valor inválido\n");
	}
	
	static public void converterMes(double x) {
		BigDecimal mes = new BigDecimal(x);
		BigDecimal dia = new BigDecimal(30);
		BigDecimal resultado = mes.multiply(dia);
		double res = resultado.doubleValue();
		if(x > 0 && x <= 1) {
			System.out.println(" ## " + x + " Mês ##");
			System.out.println("Conversão para dias: " + resultado.toPlainString());
			converterDia(res);
		}else if(x > 1) {
			System.out.println(" ## " + x + " Meses ##");
			System.out.println("Conversão para dias: " + resultado.toPlainString());
			converterDia(res);
		}else
			System.out.println("Valor inválido\n");
	}
	
	static public void converterAno(double x) {
		BigDecimal ano = new BigDecimal(x);
		BigDecimal dia = new BigDecimal(365.25);
		BigDecimal resultado = ano.multiply(dia);
		double res = resultado.doubleValue();
		if(x > 0 && x <= 1) {
			System.out.println(" ## " + x + " Ano ##");
			System.out.println("Conversão para dias: " + resultado.toPlainString());
			converterDia(res);
		}else if(x > 1) {
			System.out.println(" ## " + x + " Anos ##");
			System.out.println("Conversão para dias: " + resultado.toPlainString());
			converterDia(res);
		}else
			System.out.println("Valor inválido\n");
	}

}
