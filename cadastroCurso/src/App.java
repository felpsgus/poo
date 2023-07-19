import java.util.Scanner;

public class App {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Curso[] cursos = new Curso[4];

        System.out.println("Quantos cursos você gostaria de cadastrar?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Insira as informacoes do curso "+(i+1));
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Professor: ");
            String professor = sc.nextLine();
            System.out.println("Carga Horaria: ");
            int horas = sc.nextInt();
            sc.nextLine();
            System.out.println("Sala: ");
            int sala = sc.nextInt();
            sc.nextLine();
            cursos[i] = new Curso(nome, professor, horas, sala);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(cursos[i].toString());
        }
    }
}
