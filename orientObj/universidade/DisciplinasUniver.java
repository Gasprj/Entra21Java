package orientObj.universidade;

import java.util.Objects;

public class DisciplinasUniver {
	
	private String nomeDisciplinas;
	private String codigoDisciplina;
	private int cargaHorariaDisciplina;
	
	public String getNomeDisciplinas() {
		return nomeDisciplinas;
	}
	public void setNomeDisciplinas(String nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}
	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public int getCargaHorariaDisciplina() {
		return cargaHorariaDisciplina;
	}
	public void setCargaHorariaDisciplina(int cargaHorariaDisciplina) {
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
	}

	public int hashCode() {
		return Objects.hash(cargaHorariaDisciplina, codigoDisciplina, nomeDisciplinas);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisciplinasUniver other = (DisciplinasUniver) obj;
		return cargaHorariaDisciplina == other.cargaHorariaDisciplina
				&& Objects.equals(codigoDisciplina, other.codigoDisciplina)
				&& Objects.equals(nomeDisciplinas, other.nomeDisciplinas);
	}

}
