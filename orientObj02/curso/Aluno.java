package orientObj02.curso;

public class Aluno {
	
	private String nome;
	private String matricula;
	private float[] notas = new float[4];
	private float soma;
	private float media;
	
	public Aluno() {
	}

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getMedia() {
		this.media = this.soma / this.notas.length;
		return this.media;
	}

	public void getNotasMediaSituacao() {
		for (int i = 0; i < this.notas.length; i++) {
			System.out.printf("%d� nota: %.2f%n", (i + 1), this.notas[i]);
			this.soma += this.notas[i];
		}
			System.out.printf("M�dia: %.2f%n", this.getMedia());
			if(this.media >= 7 && this.media <= 10)
				System.out.println("Situa��o: Aprovado");
			else if(this.media >= 5 && this.media < 7)
				System.out.println("Situa��o: Recupera��o");
			else if(this.media >= 0 && this.media < 5)
				System.out.println("Situa��o: Reprovado");
			else
				System.out.println("M�dia inexistente");
	}

	public void setNotas(int i, float notas) {
		this.notas[i] = notas;
	}
	
	public String toString() {
		return "\nNome: " + this.nome + "\nMatr�cula: " + this.matricula;
	}

}
