import java.util.Vector;

public class App {
	public static void main(String[] args) throws Exception {

		Vector<Item> itens = new Vector<Item>();
		// preencher manualmente o vetor com 4 filmes, 4 cds e 4 jogos reais
		itens.add(new Filme("O Poderoso Chefão", 1972, 175, "Filme muito bom", "Francis Ford Coppola"));
		itens.add(new Filme("O Poderoso Chefão II", 1974, 202, "Filme muito bom", "Francis Ford Coppola"));
		itens.add(new Filme("O Poderoso Chefão III", 1990, 170, "Filme muito bom", "Francis Ford Coppola"));
		itens.add(new Filme("O Poderoso Chefão IV", 2021, 180, "Filme muito bom", "Francis Ford Coppola"));

		itens.add(new Cd("The Dark Side of the Moon", 1973, 43, "Album muito bom", "Pink Floyd", 10));
		itens.add(new Cd("The Wall", 1979, 81, "Album muito bom", "Pink Floyd", 26));
		itens.add(new Cd("The Division Bell", 1994, 66, "Album muito bom", "Pink Floyd", 11));
		itens.add(new Cd("The Endless River", 2014, 53, "Album muito bom", "Pink Floyd", 18));

		itens.add(new Jogo("The Legend of Zelda: Breath of the Wild", 2017, 0, "Jogo muito bom", 2, "Nintendo"));
		itens.add(new Jogo("The Legend of Zelda: Ocarina of Time", 1998, 0, "Jogo muito bom", 1, "Nintendo"));
		itens.add(new Jogo("The Legend of Zelda: Majora's Mask", 2000, 0, "Jogo muito bom", 1, "Nintendo"));
		itens.add(new Jogo("The Legend of Zelda: Skyward Sword", 2011, 0, "Jogo muito bom", 1, "Nintendo"));

		// imprimir o vetor de itens com os dados comuns a todos os itens e os dados
		// específicos de cada tipo de item
		for (Item item : itens) {
			System.out.println(item.apresentar());
		}
	}
}
