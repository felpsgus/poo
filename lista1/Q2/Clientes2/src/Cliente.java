public class Cliente {
	private String nome;
	private String telefone;
	private int idade;

	Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public int getIdade() {
		return idade;
	}

	public String toString() {
		return "Cliente : " + nome + " - Idade : " + idade + " - Telefone : " + telefone;
	}
}
