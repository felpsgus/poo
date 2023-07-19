public class Comissionado extends Funcionario {
	private double salario;
	private int vendas;
	private double percentualComissao;

	Comissionado(String nome, String sobrenome, double salario, int vendas, double percentualComissao) {
		super(nome, sobrenome);
		setSalario(salario);
		setVendas(vendas);
		setPercentualComissao(percentualComissao);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public double getSalario() {
		return salario;
	}

	public int getVendas() {
		return vendas;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public double getSalarioTotal() {
		return salario + (vendas * percentualComissao);
	}

	public String toString() {
		return super.toString() + "\nFuncionario: Comissionado" + "\nSalário: " + getSalarioTotal();
	}
}
