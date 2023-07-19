abstract class BaseClass {
	private String obs;
	private String dtaCadastro;
	private int deletado;

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getDtaCadastro() {
		return dtaCadastro;
	}

	public void setDtaCadastro(String dtaCadastro) {
		this.dtaCadastro = dtaCadastro;
	}

	public int getDeletado() {
		return deletado;
	}

	public void setDeletado(int deletado) {
		this.deletado = deletado;
	}
}