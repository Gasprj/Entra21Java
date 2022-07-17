package orientObj02.universidade;

public class Tecnico extends Funcionario{
	
	private String cargo;
	private String departamento;
	private double auxTransporte;
	static private double auxAlimentacao;
	
	public Tecnico() {
	}
	
	public Tecnico(String cargo, String departamento) {
		super();
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public String getCargoTecnico() {
		return cargo;
	}
	
	public void setCargoTecnico(String cargoTecnico) {
		this.cargo = cargoTecnico;
	}
	
	public String getDepartamentoTecnico() {
		return departamento;
	}
	
	public void setDepartamentoTecnico(String departamentoTecnico) {
		this.departamento = departamentoTecnico;
	}
	
	public double getAuxTransporte() {
		return auxTransporte;
	}

	public void setAuxTransporte(double auxTransporte) {
		this.auxTransporte = auxTransporte;
	}

	public static double getAuxAlimentacao() {
		return auxAlimentacao;
	}

	public static void setAuxAlimentacao(double auxAlimentacao) {
		Tecnico.auxAlimentacao = auxAlimentacao;
	}

	@Override
	protected double calcSalario() {
		double salarioTotal = super.getSalarioBase() + this.auxTransporte + Tecnico.auxAlimentacao;
		return salarioTotal;
	}
	
	protected double calcSalario(double salarioBase, double auxTransporte,
								double auxAlimentacao, double quantHoras, double valorHora) {
		super.setSalarioBase(salarioBase);
		this.auxTransporte = auxTransporte;
		Tecnico.auxAlimentacao = auxAlimentacao;
		double salarioTotal = super.getSalarioBase() + this.auxTransporte 
							+ Tecnico.auxAlimentacao + (quantHoras * valorHora);
		return salarioTotal;
	}
	
	protected double calcSalario(double quantHoras, double valorHora) {
		double salarioTotal = super.getSalarioBase() + this.auxTransporte 
				+ Tecnico.auxAlimentacao + (quantHoras * valorHora);
		return salarioTotal;
	}

	@Override
	public String toString() {
		return " ##  T�CNICO  ##" + "\n_________________" + super.toString() + "\nCargo: " + cargo + "\nDepartamento: " 
				+ departamento + "\nSal�rio base: " + super.getSalarioBase() + "\nAux�lio transporte: " + auxTransporte + "\nAuxilio alimenta��o: " + Tecnico.auxAlimentacao;
	}
	
}
