class Funcionario {
	private String nome;
	private String sobrenome;

	Funcionario(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String toString() {
		return "Nome: " + getNome() + "\nSobrenome: " + getSobrenome();
	}
}