public class App {
	public static void main(String[] args) throws Exception {
		Aluno aluno = new Aluno("Felipe Augusto");
		Curso curso = new Curso("ADS", "Analise e Desenvolvimento de Sistemas");
		aluno.matricular(123, curso, 2021);

		System.out.println(aluno.toString());

		aluno.setCurso("SI", "Sistemas de Informacao");
		aluno.setAno(2022);

		System.out.println(aluno.toString());
	}
}
