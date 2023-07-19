public class Estoque extends BaseClass implements Interface {
	private static Estoque instance = null;

	private int idEstoque;
	private int idProduto;
	private int quantidade;

	public int getIdEstoque() {
		return idEstoque;
	}

	public void setIdEstoque(int idEstoque) {
		this.idEstoque = idEstoque;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 999999999) {
			quantidade = 999999999;
		}
		this.quantidade = quantidade;
	}

	public Estoque getInstance() {
		if (instance == null) {
			instance = new Estoque();
		}
		return instance;
	}
}
