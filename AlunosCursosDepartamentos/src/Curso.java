public class Curso {
    private String nome;
    private String sigla;
    private Departamento departamento;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    Curso(String nome, String sigla, Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", sigla=" + sigla + ", departamento=" + departamento + '}';
    }
}
