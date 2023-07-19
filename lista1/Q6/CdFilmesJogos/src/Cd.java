public class Cd extends Item {
	private String artista;
	private int faixas;

	public String getArtista() {
		return artista;
	}

	public int getFaixas() {
		return faixas;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	Cd(String titulo, int ano, int duracao, String comentarios, String artista, int faixas) {
		super(titulo, ano, duracao, comentarios);
		this.artista = artista;
		this.faixas = faixas;
	}

	public String apresentar() {
		return super.apresentar() + " | Artista: " + artista + " | Faixas: " + faixas + " \n";
	}

}