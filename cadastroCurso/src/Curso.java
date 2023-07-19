public class Curso {
    private String nome;
    private String professor;
    private int horas;
    private int sala;

    public String getNome(){
        return this.nome;
    }

    public String getProfessor(){
        return this.professor;
    }

    public int getHoras(){
        return this.horas;
    }

    public int getSala(){
        return this.sala;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setProfessor(String professor){
        this.professor = professor;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

    public void setSala(int sala){
        this.sala = sala;
    }

    Curso(String nome, String professor, int horas, int sala){
        this.nome = nome;
        this.horas = horas;
        this.professor = professor;
        this.sala = sala;
    }

    public String toString(){
        return "Curso: "+this.nome+" | Professor(a): "+this.professor+" | Carga Horaria: "+this.horas+" | Sala: "+this.sala;
    }

}