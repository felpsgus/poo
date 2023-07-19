public class CadastroMultiplo {

	public static void main(String[] args) {

		Cliente[] cliente = new Cliente[5];

		cliente[0] = new Cliente("Maria");
		cliente[0].setIdade(20);
		cliente[0].setTelefone("999-8899");

		cliente[1] = new Cliente("João");
		cliente[1].setIdade(30);
		cliente[1].setTelefone("999-8899");

		cliente[2] = new Cliente("Pedro");
		cliente[2].setIdade(40);
		cliente[2].setTelefone("999-8899");

		cliente[3] = new Cliente("Ana");
		cliente[3].setIdade(50);
		cliente[3].setTelefone("999-8899");

		cliente[4] = new Cliente("Paulo");
		cliente[4].setIdade(60);
		cliente[4].setTelefone("999-8899");

		for (int i = 0; i < cliente.length; i++) {
			System.out.println(cliente[i]);

		}
	}
}
