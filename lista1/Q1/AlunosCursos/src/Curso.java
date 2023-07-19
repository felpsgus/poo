public class Curso {
	private String sigla;
	private String nome;

	Curso(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String toString() {
		return sigla + " - " + nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		if (sigla.length() < 3) {
			this.sigla = sigla;
		} else {
			System.out.println("Sigla invalida");
		}
	}
}
