public class App {
	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor("Fornecedor 1");

		Endereco endereco = new Endereco("Rua 1");
		endereco.setNumero(222);
		fornecedor.setEndereco(endereco);

		Software software = new Software("Software 1");
		software.setVersao("1.0");
		software.setPreco(100);
		software.setAno(2020);

		Hardware hardware = new Hardware("Hardware 1");
		hardware.setRegistro(007);
		hardware.setPreco(200);
		hardware.setAno(2020);

		fornecedor.setProdutos(new Produto[] { software, hardware });

		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println(
				"Endereco: " + fornecedor.getEndereco().getRua() + ", " + fornecedor.getEndereco().getNumero());
		System.out.println("Produtos:");
		for (Produto produto : fornecedor.getProdutos()) {
			System.out.println("Descricao: " + produto.getDescricao());
			System.out.println("Preco: " + produto.getPreco());
			System.out.println("Ano: " + produto.getAno());
			if (produto instanceof Software) {
				System.out.println("Versao: " + ((Software) produto).getVersao());
			} else if (produto instanceof Hardware) {
				System.out.println("Registro: " + ((Hardware) produto).getRegistro());
			}
		}
	}
}
