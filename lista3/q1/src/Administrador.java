public class Administrador extends Funcionario {
	private double salario;

	Administrador(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		setSalario(salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public double getSalarioTotal() {
		return salario;
	}

	public String toString() {
		return super.toString() + "\nFuncionario: Administrador" + "\nSalário: " + getSalarioTotal();
	}
}
