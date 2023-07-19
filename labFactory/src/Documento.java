abstract class Documento {
	private String remetente;
	private String tipo;
	private int numero;

	public Documento(String remetente, String tipo, int numero) {
		this.remetente = remetente;
		this.tipo = tipo;
		this.numero = numero;
	}

	public String getRemetente() {
		return remetente;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Documento [remetente=" + remetente + ", tipo=" + tipo + ", numero=" + numero + "]";
	}
}
