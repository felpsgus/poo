public class Produto {
    private static int contador = 0;
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    Produto() {
        this.codigo = contador++;
    }

    Produto(String nome) {
        this.codigo = contador++;
        this.nome = nome;
    }

    Produto(String nome, int quantidade) {
        this.codigo = contador++;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto(String nome, int quantidade, String tipo, double valor) {
        this.codigo = contador++;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return;
        }

        System.out.println("Não há estoque o suficiente");
    }
    
    public void comprar(int quantidade, double valor) {
        this.quantidade += quantidade;
        this.valor = valor;
    }

    public void comprar(int quantidade) {
        this.quantidade += quantidade;
    }

    public String toString() {
        return "Código: " + codigo + "\nNome: " + nome + "\nQuantidade: " + quantidade + "\nTipo: " + tipo + "\nValor: " + valor;
    }

    public boolean igual(Produto produto) {
        return this.nome.equals(produto.nome) && this.tipo.equals(produto.tipo);
    }

    public  void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }
}
