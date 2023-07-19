public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor[] compositores;

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getTipo() {
        return tipo;
    }

    public Compositor[] getCompositor() {
        return compositores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCompositor(Compositor[] compositores) {
        this.compositores = compositores;
    }

    Musica(String nome, int ano, String tipo) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
    }

    Musica(String nome, int ano, String tipo, Compositor[] compositores) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositores = compositores;
    }
}
