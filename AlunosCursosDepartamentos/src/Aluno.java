public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getAno() {
        return ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    Aluno(String nome, int matricula, int ano) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
    }

    Aluno(String nome, int matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", ano=" + ano + ", curso=" + curso + '}';
    }
}
