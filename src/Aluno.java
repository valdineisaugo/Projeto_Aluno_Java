import java.util.Date;

public class Aluno {
    //Atributos da classe
    double nota01;
    double nota02;
    double nota03;
    double nota04;
    String nome;
    String matricula;
    String turma;
    String disciplina;
    //Construtor da classe
    public Aluno() {//Construtor padrão
        System.out.println("Objeto aluno criado em: " + new Date());
    }

    public Aluno(double nota01, double nota02, double nota03, double nota04, String nome, String matricula, String turma, String disciplina) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.disciplina = disciplina;
    }

    //Métodos da classe
    //Cálculo da média
    public void mediaSemRetorno() {
        double media = (this.nota01 + this.nota02 + this.nota03 + this.nota04) / 4;
        System.out.println("A média do aluno " + this.nome + " é: " + media);
    }
    public double mediaComRetorno(){
        return (this.nota01 + this.nota02 + this.nota03 + this.nota04) / 4;
    }






}
