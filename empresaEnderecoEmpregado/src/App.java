import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a razão social da empresa:");
        String razaoEmpresa = scanner.nextLine();
        System.out.println("Digite o CNPJ da empresa:");
        String cnpjEmpresa = scanner.nextLine();
        System.out.println("Digite a rua da empresa:");
        String ruaEmpresa = scanner.nextLine();
        System.out.println("Digite o número da empresa:");
        int numeroEmpresa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o bairro da empresa:");
        String bairroEmpresa = scanner.nextLine();
        System.out.println("Digite o complemento da empresa:");
        String complementoEmpresa = scanner.nextLine();
        System.out.println("Digite a cidade da empresa:");
        String cidadeEmpresa = scanner.nextLine();
        System.out.println("Digite o estado da empresa:");
        String estadoEmpresa = scanner.nextLine();

        Endereco enderecoEmpresa = new Endereco(ruaEmpresa, numeroEmpresa, bairroEmpresa, complementoEmpresa, cidadeEmpresa, estadoEmpresa);
        Empresa empresa = new Empresa(cnpjEmpresa, razaoEmpresa, enderecoEmpresa);

        System.out.println("Quantos empregados deseja cadastrar?");
        int quantidadeEmpregados = scanner.nextInt();
        scanner.nextLine();
        Empregado[] empregados = new Empregado[quantidadeEmpregados];

        for (int i = 0; i < quantidadeEmpregados; i++) {
            System.out.println("Digite o nome do empregado:");
            String nomeEmpregado = scanner.nextLine();
            System.out.println("Digite a matrícula do empregado:");
            int matriculaEmpregado = scanner.nextInt();
            scanner.nextLine();
            empregados[i] = new Empregado(nomeEmpregado, matriculaEmpregado);
        }

        empresa.setEmpregados(empregados);

        System.out.println(empresa);

        scanner.close();
    }
}
