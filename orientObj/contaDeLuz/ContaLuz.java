package orientObj.contaDeLuz;

public class ContaLuz {
	
	private String dataLeitura;
	private int numLeitura;
	private int kwMes;
	private double valorConta;
	private String dataPagam;
	private int mediaCons;
	
	public ContaLuz() {
	}
	
	public ContaLuz(String dataLeitura, int numLeitura, int kwMes, double valorConta, String dataPagam, int mediaCons) {
		this.dataLeitura = dataLeitura;
		this.numLeitura = numLeitura;
		this.kwMes = kwMes;
		this.valorConta = valorConta;
		this.dataPagam = dataPagam;
		this.mediaCons = mediaCons;
	}
	
	public String getDataLeitura() {
		return dataLeitura;
	}

	public void setDataLeitura(String dataLeitura) {
		this.dataLeitura = dataLeitura;
	}

	public int getNumLeitura() {
		return numLeitura;
	}

	public void setNumLeitura(int numLeitura) {
		this.numLeitura = numLeitura;
	}

	public int getKwMes() {
		return kwMes;
	}

	public void setKwMes(int kwMes) {
		this.kwMes = kwMes;
	}

	public double getValorConta() {
		return valorConta;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}

	public String getDataPagam() {
		return dataPagam;
	}

	public void setDataPagam(String dataPagam) {
		this.dataPagam = dataPagam;
	}

	public int getMediaCons() {
		return mediaCons;
	}

	public void setMediaCons(int mediaCons) {
		this.mediaCons = mediaCons;
	}

	public void mesDeMenorCons() {
	}
	
	public void mesDeMaiorCons() {
	}

}
