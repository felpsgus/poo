public class Funcionario extends Pessoa {
	private static Funcionario instance = null;

	private int idFuncionario;
	private String codFuncionario;
	private String dtaAdmissao;
	private String dtaDemissao;
	private int idFuncionarioChefe;

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(String codFuncionario) {
		if (codFuncionario.length() > 10) {
			codFuncionario = codFuncionario.substring(0, 10);
		}
		this.codFuncionario = codFuncionario;
	}

	public String getDtaAdmissao() {
		return dtaAdmissao;
	}

	public void setDtaAdmissao(String dtaAdmissao) {
		this.dtaAdmissao = dtaAdmissao;
	}

	public String getDtaDemissao() {
		return dtaDemissao;
	}

	public void setDtaDemissao(String dtaDemissao) {
		this.dtaDemissao = dtaDemissao;
	}

	public int getIdFuncionarioChefe() {
		return idFuncionarioChefe;
	}

	public void setIdFuncionarioChefe(int idFuncionarioChefe) {
		this.idFuncionarioChefe = idFuncionarioChefe;
	}

	public Funcionario getInstance() {
		if (instance == null) {
			instance = new Funcionario();
		}
		return instance;
	}
}
