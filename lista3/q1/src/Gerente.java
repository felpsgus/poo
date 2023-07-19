public class Gerente extends Funcionario {
	private double salario;
	private double bonificacao;

	Gerente(String nome, String sobrenome, double salario, double bonificacao) {
		super(nome, sobrenome);
		setSalario(salario);
		setBonificacao(bonificacao);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return salario;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public double getSalarioTotal() {
		return salario + bonificacao;
	}

	public String toString() {
		return super.toString() + "\nFuncionario: Gerente" + "\nSalário: " + getSalarioTotal();
	}
}
