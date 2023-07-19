public class Horista extends Funcionario {
	private int horasTrabalhadas;
	private double valorHora;

	Horista(String nome, String sobrenome, int horasTrabalhadas, double valorHora) {
		super(nome, sobrenome);
		setHorasTrabalhadas(horasTrabalhadas);
		setValorHora(valorHora);
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public double getSalario() {
		return horasTrabalhadas * valorHora;
	}

	public String toString() {
		return super.toString() + "\nFuncionario: Horista" + "\nSalário: " + getSalario();
	}

}
