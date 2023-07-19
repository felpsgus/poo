import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class App {
	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("leituraArquivo\\2\\src\\funcionarios.txt");
		ObjectInputStream ois = new ObjectInputStream(stream);

		for (Funcionario f : (Funcionario[]) ois.readObject()) {
			System.out.println(f.mostraFuncionario());
		}
	}
}
