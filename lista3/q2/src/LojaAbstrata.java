public abstract class LojaAbstrata implements Registro {
	private static int contador = 0;
	private int indentificador;
	private String cnpj;
	private String razaoSocial;
	private boolean aberta;

	LojaAbstrata(String cnpj, String razaoSocial) {
		this.indentificador = LojaAbstrata.contador++;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = false;
	}

	public void registra_abertura_dia() {
		if (!this.aberta) {
			this.aberta = true;
		}
	}

	public void registra_fechamento_dia() {
		if (this.aberta) {
			this.aberta = false;
		}
	}

	public String toString() {
		return "loja: " + this.razaoSocial + " cnpj: " + this.cnpj
				+ " identificador: " + this.indentificador + " aberta: " + (this.aberta == true ? "sim" : "nao");
	}
}
