public class Elevador {
    static int idElevador = 0;
    int id;
    double capacidade;
    int totalAndares;
    int situacao; // 0 - desligado, 1 - ligado
    int andarAtual = 0;

    public double getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public int getTotalAndares() {
        return this.totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getSituacao() {
        return this.situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }


    Elevador(double capacidade, int totalAndares, int situacao) {
        this.id = idElevador++;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.situacao = situacao;
    }

    public void ligar() {
        this.situacao = 1;
    }

    public void desligar() {
        this.situacao = 0;
    }

    public void subir(int andar) {
        if (this.situacao == 1) {
            if (this.andarAtual + andar <= this.totalAndares) {
                this.andarAtual += andar;
            } else {
                System.out.println("Não é possível subir mais que o total de andares.");
            }
        } else {
            System.out.println("O elevador está desligado.");
        }
    }

    public void descer(int andar) {
        if (this.situacao == 1) {
            if (this.andarAtual - andar >= 0) {
                this.andarAtual -= andar;
            } else {
                System.out.println("Não é possível descer mais que o total de andares.");
            }
        } else {
            System.out.println("O elevador está desligado.");
        }
    }
}
