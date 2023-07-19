public class BancoDados {

	private String nome;
	private int codigo;
	private static BancoDados instancia;

	private BancoDados() {
		codigo = 001;
		nome = "MySql";
	}

	public String toString() {
		return "BancoDados : " + codigo + "-" + nome + " - Instância :" + this.hashCode();
	}

	public static BancoDados getInstancia() {
		if (instancia == null) {
			instancia = new BancoDados();
		}
		return instancia;
	}

}