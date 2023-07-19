public class App {
	public static void main(String[] args) throws Exception {

		Funcionario[] funcionarios = new Funcionario[10];

		funcionarios[0] = new Horista("João", "Silva", 40, 10);
		funcionarios[1] = new Horista("Maria", "Silva", 40, 10);
		funcionarios[2] = new Administrador("José", "Silva", 1000);
		funcionarios[3] = new Administrador("Ana", "Silva", 1000);
		funcionarios[4] = new Administrador("Pedro", "Silva", 1000);
		funcionarios[5] = new Administrador("Paulo", "Silva", 1000);
		funcionarios[6] = new Comissionado("Joana", "Silva", 1000, 500, 0.1);
		funcionarios[7] = new Comissionado("Carlos", "Silva", 1000, 500, 0.1);
		funcionarios[8] = new Comissionado("Mariana", "Silva", 1000, 500, 0.1);
		funcionarios[9] = new Gerente("Marcos", "Silva", 1000, 1000);

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

	}
}
