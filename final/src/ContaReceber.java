public class ContaReceber extends BaseClass implements Interface {
	private static ContaReceber instance = null;

	private int idContaReceber;
	private int idCliente;
	private double valor;
	private String dtaContaReceber;
	private String dtaVencimento;
	private String dtaPagamento;

	public int getIdContaReceber() {
		return idContaReceber;
	}

	public void setIdContaReceber(int idContaReceber) {
		this.idContaReceber = idContaReceber;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public String getDtaContaReceber() {
		return dtaContaReceber;
	}

	public void setDtaContaReceber(String dtaContaReceber) {
		this.dtaContaReceber = dtaContaReceber;
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

	public ContaReceber getInstance() {
		if (instance == null) {
			instance = new ContaReceber();
		}
		return instance;
	}
}
