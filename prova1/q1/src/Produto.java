public class Produto {
	private String descricao;
	private double preco;
	private int ano;
	private Fornecedor fornecedor;

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 0) {
			this.descricao = descricao;
		}
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		}
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		}
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		if (fornecedor != null) {
			this.fornecedor = fornecedor;
		}
	}

	Produto(String descricao) {
		this.descricao = descricao;
	}
}
