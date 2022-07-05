package orientObj.universidade;

import java.util.Objects;

public class Tecnico extends FuncionariosUniver{
	
	private String cargoTecnico;
	private String departamentoTecnico;
	
	public String getCargoTecnico() {
		return cargoTecnico;
	}
	public void setCargoTecnico(String cargoTecnico) {
		this.cargoTecnico = cargoTecnico;
	}
	public String getDepartamentoTecnico() {
		return departamentoTecnico;
	}
	public void setDepartamentoTecnico(String departamentoTecnico) {
		this.departamentoTecnico = departamentoTecnico;
	}

	public int hashCode() {
		return Objects.hash(cargoTecnico, departamentoTecnico);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tecnico other = (Tecnico) obj;
		return Objects.equals(cargoTecnico, other.cargoTecnico)
				&& Objects.equals(departamentoTecnico, other.departamentoTecnico);
	}
	
	
	

}
