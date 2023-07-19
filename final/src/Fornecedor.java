public class Fornecedor extends Pessoa {
	private static Fornecedor instance = null;

	private int idFornecedor;
	private String codFornecedor;

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(String codFornecedor) {
		if (codFornecedor.length() > 10) {
			codFornecedor = codFornecedor.substring(0, 10);
		}
		this.codFornecedor = codFornecedor;
	}

	public Fornecedor getInstance() {
		if (instance == null) {
			instance = new Fornecedor();
		}
		return instance;
	}
}
