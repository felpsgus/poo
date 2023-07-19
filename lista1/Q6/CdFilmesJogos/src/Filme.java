public class Filme extends Item {
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	Filme(String titulo, int ano, int duracao, String comentarios, String diretor) {
		super(titulo, ano, duracao, comentarios);
		this.diretor = diretor;
	}

	public String apresentar() {
		return super.apresentar() + " | Diretor: " + diretor + " \n";
	}
}
