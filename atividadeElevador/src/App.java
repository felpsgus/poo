import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elevadores deseja criar?");
        int qtdElevadores = sc.nextInt();
        Elevador[] elevadores = new Elevador[qtdElevadores];

        for (int i = 0; i < qtdElevadores; i++) {
            System.out.println("Qual a capacidade do elevador " + (i + 1) + "?");
            double capacidade = sc.nextDouble();
            System.out.println("Qual o total de andares do prédio " + (i + 1) + "?");
            int totalAndares = sc.nextInt();
            System.out.println("Qual a situação do elevador " + (i + 1) + "?");
            int situacao = sc.nextInt();
            elevadores[i] = new Elevador(capacidade, totalAndares, situacao);
        }

        System.out.println("Qual elevador deseja utilizar?");
        int elevador = sc.nextInt();
        System.out.println("Qual ação deseja realizar?");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Subir");
        System.out.println("4 - Descer");
        int acao = sc.nextInt();

        switch (acao) {
            case 1:
                elevadores[elevador - 1].ligar();
                break;
            case 2:
                elevadores[elevador - 1].desligar();
                break;
            case 3:
                System.out.println("Quantos andares deseja subir?");
                int andarSubir = sc.nextInt();
                elevadores[elevador - 1].subir(andarSubir);
                break;
            case 4:
                System.out.println("Quantos andares deseja descer?");
                int andarDescer = sc.nextInt();
                elevadores[elevador - 1].descer(andarDescer);
                break;
            default:
                System.out.println("Ação inválida.");
        }
    }
}
