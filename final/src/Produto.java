public class Produto extends BaseClass implements Interface {
	private static Produto instance = null;

	private int idProduto;
	private String codProduto;
	private String nome;
	private String descricao;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		if (codProduto.length() > 10) {
			codProduto = codProduto.substring(0, 10);
		}
		this.codProduto = codProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 50) {
			nome = nome.substring(0, 50);
		}
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 50) {
			descricao = descricao.substring(0, 50);
		}
		this.descricao = descricao;
	}

	public Produto getInstance() {
		if (instance == null) {
			instance = new Produto();
		}
		return instance;
	}
}
