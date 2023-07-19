public class App {
	public static void main(String[] args) throws Exception {

		Loja[] lojas = new Loja[3];

		lojas[0] = new Loja("00.000.000/0000-00", "Loja Matriz", "Rua 1, 1", "Gerente 1");
		lojas[1] = new Loja("11.111.111/1111-11", "Loja Filial 1", "Rua 2, 2", "Gerente 2");
		lojas[2] = new Loja("22.222.222/2222-22", "Loja Filial 2", "Rua 3, 3", "Gerente 3");

		for (Loja loja : lojas) {
			System.out.println(loja);
		}

		for (Loja loja : lojas) {
			loja.registra_abertura_dia();
			System.out.println(loja);
		}

		for (Loja loja : lojas) {
			loja.registra_fechamento_dia();
			System.out.println(loja);
		}

	}
}
