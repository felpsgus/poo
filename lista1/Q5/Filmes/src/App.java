import java.util.Vector;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) throws Exception {

		Vector<Filme> filmes = new Vector<Filme>();
		Filme filme;

		int codigo = 1;
		int i = 0;
		while (codigo != 0) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do filme:", "Filmes",
					JOptionPane.INFORMATION_MESSAGE));
			if (codigo != 0) {
				String nome = JOptionPane.showInputDialog(null, "Digite o nome do filme:", "Filmes",
						JOptionPane.INFORMATION_MESSAGE);
				filme = new Filme(codigo, nome);
				filme.setGenero(JOptionPane.showInputDialog(null, "Digite o gênero do filme:", "Filmes",
						JOptionPane.INFORMATION_MESSAGE));
				filme.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do filme:", "Filmes",
						JOptionPane.INFORMATION_MESSAGE)));
				filme.setAutor(JOptionPane.showInputDialog(null, "Digite o autor do filme:", "Filmes",
						JOptionPane.INFORMATION_MESSAGE));
			} else {
				break;
			}

			filmes.add(filme);
			i++;
		}

		JOptionPane.showMessageDialog(null, "Quantidade de filmes cadastrados: " + i, "Filmes",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
