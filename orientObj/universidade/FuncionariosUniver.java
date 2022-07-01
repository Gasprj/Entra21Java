package orientObj.universidade;

import java.util.Objects;

public class FuncionariosUniver {
	
	private String nomeFuncionario;
	private String enderecoFuncionario;
	private int telefoneFuncionario;
	private int cpfFuncionario;
	private String ctpsFuncionario;
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}
	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}
	public int getTelefoneFuncionario() {
		return telefoneFuncionario;
	}
	public void setTelefoneFuncionario(int telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
	public int getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(int cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public String getCtpsFuncionario() {
		return ctpsFuncionario;
	}
	public void setCtpsFuncionario(String ctpsFuncionario) {
		this.ctpsFuncionario = ctpsFuncionario;
	}

	public int hashCode() {
		return Objects.hash(cpfFuncionario, ctpsFuncionario, enderecoFuncionario, nomeFuncionario, telefoneFuncionario);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionariosUniver other = (FuncionariosUniver) obj;
		return cpfFuncionario == other.cpfFuncionario && Objects.equals(ctpsFuncionario, other.ctpsFuncionario)
				&& Objects.equals(enderecoFuncionario, other.enderecoFuncionario)
				&& Objects.equals(nomeFuncionario, other.nomeFuncionario)
				&& telefoneFuncionario == other.telefoneFuncionario;
	}
	
	
}
