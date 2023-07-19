public class Contrato extends BaseClass implements Interface {
	private static Contrato instance = null;

	private int idContrato;
	private int idCliente;
	private String dtaAssinatura;
	private String dtaVencimento;
	private String dtaCancelamento;

	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getDtaAssinatura() {
		return dtaAssinatura;
	}

	public void setDtaAssinatura(String dtaAssinatura) {
		this.dtaAssinatura = dtaAssinatura;
	}

	public String getDtaVencimento() {
		return dtaVencimento;
	}

	public void setDtaVencimento(String dtaVencimento) {
		this.dtaVencimento = dtaVencimento;
	}

	public String getDtaCancelamento() {
		return dtaCancelamento;
	}

	public void setDtaCancelamento(String dtaCancelamento) {
		this.dtaCancelamento = dtaCancelamento;
	}

	public Contrato getInstance() {
		if (instance == null) {
			instance = new Contrato();
		}
		return instance;
	}
}
