public class Pessoa {
    private String nome;
    private double salario;
    private int numero_dependentes;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumero_dependentes() {
        return numero_dependentes;
    }

    public void setNumero_dependentes(int numero_dependentes) {
        this.numero_dependentes = numero_dependentes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    Pessoa(String nome, double salario, int numero_dependentes, int idade){
        this.nome = nome;
        this.salario = salario;
        this.numero_dependentes = numero_dependentes;
        this.idade = idade;
    }

    public double calculaImposto(double salario){
        double imposto;
        if(idade >=65){
            imposto = 0;
            return imposto;
        }


        else {
            if (salario <= 1787.77) {
                imposto = 0;
                return imposto;


            } else if (salario >= 1787.78 && salario <= 2679.29) {
                if(numero_dependentes > 0) {
                    imposto = (salario * 0.075 - 134.08) - 179.71 * numero_dependentes;
                    if(imposto < 0){
                        imposto = 0;
                    }
                }
                else{
                    imposto = salario * 0.075 - 134.08;
                }
                return imposto;


            } else if (salario >= 2679.30 && salario <= 3572.43) {
                if(numero_dependentes > 0){
                    imposto = (salario * 0.15 - 335.03) - 179.71 * numero_dependentes;
                    if(imposto < 0){
                        imposto = 0;
                    }
                }else{
                    imposto = salario * 0.15 - 335.03;
                }
                return imposto;


            } else if (salario >= 3572.44 && salario <= 4463.81) {
                if(numero_dependentes > 0){
                    imposto = (salario * 0.225 - 602.96) - 179.71 * numero_dependentes;
                    if(imposto < 0){
                        imposto = 0;
                    }
                }
                else {
                    imposto = salario * 0.225 - 602.96;
                }
                return imposto;

            } else {
                if(numero_dependentes > 0){
                    imposto = (salario * 0.275 - 826.15) - 179.71 * numero_dependentes;
                    if(imposto < 0){
                        imposto = 0;
                    }
                }
                else {
                    imposto = salario * 0.275 - 826.15;
                }
                return imposto;
            }
        }

    }
}
