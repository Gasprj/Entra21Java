package orientObj.universidade;

import java.util.Objects;

public class CursosUniver {
	
	DisciplinasUniver disciplinas;
	private String nomeCurso;
	private String codigoCurso;
	private int duracaoCurso;
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public int getDuracaoCurso() {
		return duracaoCurso;
	}
	public void setDuracaoCurso(int duracaoCurso) {
		this.duracaoCurso = duracaoCurso;
	}

	public int hashCode() {
		return Objects.hash(codigoCurso, duracaoCurso, nomeCurso);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursosUniver other = (CursosUniver) obj;
		return Objects.equals(codigoCurso, other.codigoCurso) && duracaoCurso == other.duracaoCurso
				&& Objects.equals(nomeCurso, other.nomeCurso);
	}
	
}
