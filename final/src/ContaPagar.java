public class ContaPagar extends BaseClass implements Interface {
	private static ContaPagar instance = null;

	private int idContaPagar;
	private int idFornecedor;
	private int idProduto;
	private double valor;
	private String dtaContaPagar;
	private String dtaVencimento;
	private String dtaPagamento;

	public int getIdContaPagar() {
		return idContaPagar;
	}

	public void setIdContaPagar(int idContaPagar) {
		this.idContaPagar = idContaPagar;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 999999999) {
			valor = 999999999;
		}
		this.valor = valor;
	}

	public String getDtaContaPagar() {
		return dtaContaPagar;
	}

	public void setDtaContaPagar(String dtaContaPagar) {
		this.dtaContaPagar = dtaContaPagar;
	}

	public String getDtaVencimento() {
		return dtaVencimento;
	}

	public void setDtaVencimento(String dtaVencimento) {
		this.dtaVencimento = dtaVencimento;
	}

	public String getDtaPagamento() {
		return dtaPagamento;
	}

	public void setDtaPagamento(String dtaPagamento) {
		this.dtaPagamento = dtaPagamento;
	}

	public ContaPagar getInstance() {
		if (instance == null) {
			instance = new ContaPagar();
		}
		return instance;
	}
}
