public class Empresa {
    private String cnpj;
    private String razao;
    private Endereco endereco;
    private Empregado[] empregados;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empregado[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Empregado[] empregados) {
        this.empregados = empregados;
    }

    Empresa(String cnpj, String razao) {
        this.cnpj = cnpj;
        this.razao = razao;
    }

    Empresa(String cnpj, String razao, Endereco endereco) {
        this.cnpj = cnpj;
        this.razao = razao;
        this.endereco = endereco;
    }

    Empresa(String cnpj, String razao, Endereco endereco, Empregado[] empregados) {
        this.cnpj = cnpj;
        this.razao = razao;
        this.endereco = endereco;
        this.empregados = empregados;
    }

    @Override
    public String toString() {
        return "Empresa{" + "cnpj=" + cnpj + ", razao=" + razao + ", endereco=" + endereco + '}';
    }
}
