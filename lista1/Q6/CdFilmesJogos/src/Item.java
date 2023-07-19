public class Item {
	private String titulo;
	private int ano;
	private int duracao;
	private String comentarios;

	public String getTitulo() {
		return titulo;
	}

	public int getAno() {
		return ano;
	}

	public int getDuracao() {
		return duracao;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	Item(String titulo, int ano, int duracao, String comentarios) {
		this.titulo = titulo;
		this.ano = ano;
		this.duracao = duracao;
		this.comentarios = comentarios;
	}

	public String apresentar() {
		return "Titulo: " + titulo + " | Ano: " + ano + " | Duracao: " + duracao + "min | Comentarios: " + comentarios;
	}
}
