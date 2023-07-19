public class Carro {
	private String marca;
	private String modelo;
	private int ano;

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	Carro(String marca) {
		this.marca = marca;
	}
}