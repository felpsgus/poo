public class Filme {
	private static int qtd;
	private int codigo;
	private String nome;
	private String genero;
	private int ano;
	private String autor;

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public int getAno() {
		return ano;
	}

	public String getAutor() {
		return autor;
	}

	Filme(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		qtd++;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String toString() {
		return "Filme [codigo=" + codigo + ", nome=" + nome + ", genero=" + genero + ", ano=" + ano + ", autor=" + autor
				+ "]";
	}
}
