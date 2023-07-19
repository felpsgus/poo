import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você desejar cadastrar Musicas ou Compositores?");
        System.out.println("1 - Musicas");
        System.out.println("2 - Compositores");
        System.out.println("3 - Sair");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Quantas musicas você deseja cadastrar?");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                Musica[] musicas = new Musica[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o nome da música "+(i+1)+": ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o ano da música "+(i+1)+": ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o tipo da música "+(i+1)+": ");
                    String tipo = scanner.nextLine();

                    System.out.println("Quantos compositores você deseja cadastrar?");
                    int quantidadeCompositores = scanner.nextInt();
                    scanner.nextLine();

                    Compositor[] compositores = new Compositor[quantidadeCompositores];

                    for (int j = 0; j < quantidadeCompositores; j++) {
                        System.out.println("Digite o nome do compositor "+(j+1)+": ");
                        String nomeCompositor = scanner.nextLine();

                        System.out.println("Digite a nacionalidade do compositor "+(j+1)+": ");
                        String nacionalidadeCompositor = scanner.nextLine();

                        compositores[j] = new Compositor(nomeCompositor, nacionalidadeCompositor);
                    }

                    musicas[i] = new Musica(nome, ano, tipo, compositores);
                }
                break;
            case 2:
                System.out.println("Quantos compositores você deseja cadastrar?");
                quantidade = scanner.nextInt();
                scanner.nextLine();

                Compositor[] compositores = new Compositor[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o nome do compositor "+(i+1)+": ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a nacionalidade do compositor "+(i+1)+": ");
                    String nacionalidade = scanner.nextLine();

                    System.out.println("Quantas músicas você deseja cadastrar?");
                    int quantidadeMusicas = scanner.nextInt();
                    scanner.nextLine();

                    musicas = new Musica[quantidadeMusicas];

                    for (int j = 0; j < quantidadeMusicas; j++) {
                        System.out.println("Digite o nome da música "+(j+1)+": ");
                        String nomeMusica = scanner.nextLine();

                        System.out.println("Digite o ano da música "+(j+1)+": ");
                        int anoMusica = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o tipo da música "+(j+1)+": ");
                        String tipoMusica = scanner.nextLine();

                        musicas[j] = new Musica(nomeMusica, anoMusica, tipoMusica);
                    }

                    compositores[i] = new Compositor(nome, nacionalidade, musicas);
                }
                break;
            case 3:
                System.out.println("Você escolheu sair");
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
