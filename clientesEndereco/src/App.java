import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos clientes deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Cliente[] clientes = new Cliente[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do cliente "+(i+1)+":");
            String nome = scanner.nextLine();

            System.out.println("Digite o CPF do cliente "+(i+1)+":");
            String cpf = scanner.nextLine();

            System.out.println("Digite a rua do cliente "+(i+1)+":");
            String rua = scanner.nextLine();

            System.out.println("Digite o número do cliente "+(i+1)+":");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o bairro do cliente "+(i+1)+":");
            String bairro = scanner.nextLine();

            System.out.println("Digite o complemento do cliente "+(i+1)+":");
            String complemento = scanner.nextLine();

            System.out.println("Digite a cidade do cliente "+(i+1)+":");
            String cidade = scanner.nextLine();

            System.out.println("Digite o estado do cliente "+(i+1)+":");
            String estado = scanner.nextLine();

            Endereco endereco = new Endereco(rua, numero, bairro, complemento, cidade, estado);
            Cliente cliente = new Cliente(nome, cpf, endereco);

            clientes[i] = cliente;
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println(clientes[i].toString());
        }
    }
}
