public class Loja extends LojaAbstrata {
	private String endereco;
	private String gerente;

	Loja(String cnpj, String razaoSocial, String endereco,
			String gerente) {
		super(cnpj, razaoSocial);
		this.endereco = endereco;
		this.gerente = gerente;
	}

	public String toString() {
		return super.toString() + " endereco: " + this.endereco
				+ " gerente: " + this.gerente;
	}
}
