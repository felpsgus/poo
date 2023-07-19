import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) throws Exception {

		try {

			FileInputStream stream = new FileInputStream("leituraArquivo\\funcionarios.txt");

			InputStreamReader reader = new InputStreamReader(stream);

			BufferedReader br = new BufferedReader(reader);
			String linha = br.readLine();

			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			double irm = 0;
			double irf = 0;
			double irt = 0;

			while (linha != null) {
				String[] dados = linha.split("#");

				funcionarios.add(new Funcionario(dados[0], dados[1].charAt(0), Double.parseDouble(dados[2]),
						Integer.parseInt(dados[3])));

				if (funcionarios.get(funcionarios.size() - 1).sexo == 'M')
					irm += funcionarios.get(funcionarios.size() - 1).impostoRenda();
				else
					irf += funcionarios.get(funcionarios.size() - 1).impostoRenda();

				irt += funcionarios.get(funcionarios.size() - 1).impostoRenda();

				System.out.println(funcionarios.get(funcionarios.size() -
						1).mostraFuncionario());
				linha = br.readLine();
			}

			System.out.printf("Total de imposto de renda pago por homens: %.2f R$\n", irm);
			System.out.printf("Total de imposto de renda pago por mulheres: %.2f R$\n", irf);
			System.out.printf("Total de imposto de renda pago por todos os funcionários: %.2f R$\n", irt);

			br.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
