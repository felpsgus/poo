public class App {
    public static void main(String[] args) throws Exception {

        Aluno aluno = new Aluno("Felipe Augusto");
        aluno.matricular(123, "ADS", 2021);

        System.out.println(aluno.toString());

        aluno.setCurso("SI");
        aluno.setAno(2022);

        System.out.println(aluno.toString());
    }
}
