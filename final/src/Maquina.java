public class Maquina extends BaseClass implements Interface {
	private static Maquina instance = null;

	private int idMaquina;
	private String codMaquina;
	private String descricao;
	private String dtaCompra;

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public String getCodMaquina() {
		return codMaquina;
	}

	public void setCodMaquina(String codMaquina) {
		if (codMaquina.length() > 10) {
			codMaquina = codMaquina.substring(0, 10);
		}
		this.codMaquina = codMaquina;
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

	public String getDtaCompra() {
		return dtaCompra;
	}

	public void setDtaCompra(String dtaCompra) {
		if (dtaCompra.length() > 10) {
			dtaCompra = dtaCompra.substring(0, 10);
		}
		this.dtaCompra = dtaCompra;
	}

	public Maquina getInstance() {
		if (instance == null) {
			instance = new Maquina();
		}
		return instance;
	}
}
