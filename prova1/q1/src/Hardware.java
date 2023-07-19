public class Hardware extends Produto {
	private int registro;

	public int getRegistro() {
		return this.registro;
	}

	public void setRegistro(int registro) {
		if (registro > 0) {
			this.registro = registro;
		}
	}

	Hardware(String descricao) {
		super(descricao);
	}
}
