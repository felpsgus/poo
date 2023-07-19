public class Pessoa extends BaseClass implements Interface {

	private static Pessoa instance = null;

	private int idPessoa;
	private int idEndereco;
	private String nome;
	private String nomeFantasia;
	private int tpPessoa;
	private String cpfCnpj;
	private String telefone;
	private String email;
	private String dtaNascimento;

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 50) {
			nome = nome.substring(0, 50);
		}
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.length() > 50) {
			nomeFantasia = nomeFantasia.substring(0, 50);
		}
		this.nomeFantasia = nomeFantasia;
	}

	public int getTpPessoa() {
		return tpPessoa;
	}

	public void setTpPessoa(int tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

	public String getcpfCnpj() {
		return cpfCnpj;
	}

	public void setcpfCnpj(String cpfCnpj) {
		if (cpfCnpj.length() > 14) {
			cpfCnpj = cpfCnpj.substring(0, 14);
		}
		this.cpfCnpj = cpfCnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() > 11) {
			telefone = telefone.substring(0, 11);
		}
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() > 50) {
			email = email.substring(0, 50);
		}
		this.email = email;
	}

	public String getDtaNascimento() {
		return dtaNascimento;
	}

	public void setDtaNascimento(String dtaNascimento) {
		this.dtaNascimento = dtaNascimento;
	}

	public BaseClass getInstance() {
		if (instance == null) {
			instance = new Pessoa();
		}
		return instance;
	}
}
