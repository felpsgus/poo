public class Jogo extends Item {
	private int numJogadores;
	private String plataforma;

	public int getNumJogadores() {
		return numJogadores;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	Jogo(String titulo, int ano, int duracao, String comentarios, int numJogadores, String plataforma) {
		super(titulo, ano, duracao, comentarios);
		this.numJogadores = numJogadores;
		this.plataforma = plataforma;
	}

	public String apresentar() {
		return super.apresentar() + " | Num. Jogadores: " + numJogadores + " | Plataforma: " + plataforma + " \n";
	}
}
