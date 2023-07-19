public class Compositor {
    private String nome;
    private String nacionalidade;
    private Musica[] musicas;

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    Compositor(String nome, String nacionalidade, Musica[] musicas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.musicas = musicas;
    }
}
