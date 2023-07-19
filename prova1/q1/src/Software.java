public class Software extends Produto {
	private String versao;

	public String getVersao() {
		return this.versao;
	}

	public void setVersao(String versao) {
		if (versao.length() > 0) {
			this.versao = versao;
		}
	}

	Software(String descricao) {
		super(descricao);
	}
}
