public class Empregado {
    private String nome;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    Empregado(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }
}
