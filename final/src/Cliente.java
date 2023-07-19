public class Cliente extends Pessoa {
	private static Cliente instance = null;

	private int idCliente;
	private String codCliente;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		if (codCliente.length() > 10) {
			codCliente = codCliente.substring(0, 10);
		}
		this.codCliente = codCliente;
	}

	public Cliente getInstance() {
		if (instance == null) {
			instance = new Cliente();
		}
		return instance;
	}
}
