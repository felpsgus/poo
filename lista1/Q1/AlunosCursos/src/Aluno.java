public class Aluno {
	private String nome;
	private int matricula;
	private int ano;
	private Curso curso;

	Aluno(String nome) {
		this.nome = nome;
	}

	public void matricular(int matricula, Curso curso, int ano) {
		this.matricula = matricula;
		this.ano = ano;
		this.curso = curso;
	}

	public String toString() {
		return "Aluno : " + nome + " - matricula : " + matricula + " - Curso : " + curso + " - " + ano;
	}

	public void setCurso(String sigla, String curso) {
		this.curso.setSigla(sigla);
		this.curso.setNome(curso);
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
