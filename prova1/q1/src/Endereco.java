public class Endereco {
	private String rua;
	private int numero;

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	Endereco(String rua) {
		this.rua = rua;
	}
}
