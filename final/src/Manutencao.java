public class Manutencao extends BaseClass implements Interface {
	private static Manutencao instance = null;

	private int idManutencao;
	private int idMaquina;
	private int idFornecedor;
	private String dtaManutencao;
	private String dtaProximaManutencao;

	public int getIdManutencao() {
		return idManutencao;
	}

	public void setIdManutencao(int idManutencao) {
		this.idManutencao = idManutencao;
	}

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getDtaManutencao() {
		return dtaManutencao;
	}

	public void setDtaManutencao(String dtaManutencao) {
		if (dtaManutencao.length() > 10) {
			dtaManutencao = dtaManutencao.substring(0, 10);
		}
		this.dtaManutencao = dtaManutencao;
	}

	public String getDtaProximaManutencao() {
		return dtaProximaManutencao;
	}

	public void setDtaProximaManutencao(String dtaProximaManutencao) {
		if (dtaProximaManutencao.length() > 10) {
			dtaProximaManutencao = dtaProximaManutencao.substring(0, 10);
		}
		this.dtaProximaManutencao = dtaProximaManutencao;
	}

	public Manutencao getInstance() {
		if (instance == null) {
			instance = new Manutencao();
		}
		return instance;
	}
}
