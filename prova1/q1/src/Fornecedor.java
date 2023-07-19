public class Fornecedor {
	private String nome;
	private Endereco endereco;
	private Produto[] produtos;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		}
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		if (endereco != null) {
			this.endereco = endereco;
		}
	}

	public Produto[] getProdutos() {
		return this.produtos;
	}

	public void setProdutos(Produto[] produtos) {
		if (produtos != null) {
			this.produtos = produtos;
		}
	}

	Fornecedor(String nome) {
		this.nome = nome;
	}
}
