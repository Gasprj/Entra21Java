package orientObj.universidade;

import java.util.Objects;

public class Professor extends FuncionariosUniver{
	
	CursosUniver curso;
	private String tituloProfessor;
	private String areaProfessor;
	
	public String getTituloProfessor() {
		return tituloProfessor;
	}
	public void setTituloProfessor(String tituloProfessor) {
		this.tituloProfessor = tituloProfessor;
	}
	public String getAreaProfessor() {
		return areaProfessor;
	}
	public void setAreaProfessor(String areaProfessor) {
		this.areaProfessor = areaProfessor;
	}

	public int hashCode() {
		return Objects.hash(areaProfessor, curso, tituloProfessor);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Professor) {
		Professor outro = (Professor) obj;
		return Objects.equals(areaProfessor, outro.areaProfessor) && Objects.equals(tituloProfessor, outro.tituloProfessor);
		}
		else
			return false;
	}

	
}
