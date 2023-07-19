import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Departamentos deseja cadastrar?");
        int qtdDepartamentos = scanner.nextInt();
        scanner.nextLine();

        Departamento[] departamentos = new Departamento[qtdDepartamentos];

        for (int i = 0; i < qtdDepartamentos; i++) {
            System.out.println("Digite o nome do Departamento " + (i + 1) + ":");
            String nomeDepartamento = scanner.nextLine();

            System.out.println("Digite a sigla do Departamento " + (i + 1) + ":");
            String siglaDepartamento = scanner.nextLine();

            departamentos[i] = new Departamento(nomeDepartamento, siglaDepartamento);
        }

        Curso[] cursos = new Curso[0];
        int qtdCursos = 0;
        for (int i = 0; i < qtdDepartamentos; i++) {
            System.out.println("Quantos cursos deseja cadastrar para o Departamento " + departamentos[i].getNome() + "?");
            qtdCursos = scanner.nextInt();
            scanner.nextLine();

            cursos = new Curso[qtdCursos];

            for (int j = 0; j < qtdCursos; j++) {
                System.out.println("Digite o nome do Curso " + (j + 1) + ":");
                String nomeCurso = scanner.nextLine();

                System.out.println("Digite a sigla do Curso " + (j + 1) + ":");
                String siglaCurso = scanner.nextLine();

                cursos[j] = new Curso(nomeCurso, siglaCurso, departamentos[i]);
            }
        }

        Aluno[] alunos = new Aluno[0];
        int qtdAlunos = 0;
        for (int j = 0; j < qtdCursos; j++) {
            System.out.println("Quantos alunos deseja cadastrar para o Curso " + cursos[j].getNome() + "?");
            qtdAlunos = scanner.nextInt();
            scanner.nextLine();

            alunos = new Aluno[qtdAlunos];

            for (int k = 0; k < qtdAlunos; k++) {
                System.out.println("Digite o nome do Aluno " + (k + 1) + ":");
                String nomeAluno = scanner.nextLine();

                System.out.println("Digite a matrícula do Aluno " + (k + 1) + ":");
                int matriculaAluno = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o ano do Aluno " + (k + 1) + ":");
                int anoAluno = scanner.nextInt();
                scanner.nextLine();

                alunos[k] = new Aluno(nomeAluno, matriculaAluno, anoAluno, cursos[j]);
            }
        }

        for (int i = 0; i < qtdDepartamentos; i++) {
            System.out.println("Departamento " + departamentos[i].getNome() + ":");
            for (int j = 0; j < qtdCursos; j++) {
                if (cursos[j].getDepartamento().getNome().equals(departamentos[i].getNome())) {
                    System.out.println("Curso " + cursos[j].getNome() + ":");
                    for (int k = 0; k < qtdAlunos; k++) {
                        if (alunos[k].getCurso().getNome().equals(cursos[j].getNome())) {
                            System.out.println("Aluno " + alunos[k].getNome() + ":");
                        }
                    }
                }
            }
        }

    }
}
