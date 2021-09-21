public class MainApp {
    public static void main(String[] args) {
        //Instanciar classe Aluno
        Aluno a1 = new Aluno();
        a1.nota01 = 5.0;
        a1.nota02 = 6.0;
        a1.nota03 = 7.0;
        a1.nota04 = 8.0;
        a1.nome = "Baltazar";
        a1.disciplina = "Java";
        a1.mediaSemRetorno();
        System.out.println(a1.mediaComRetorno());

        Aluno a2 = new Aluno(4.0, 5, 5.5, 7.9, "Maria", "1234", "SI", "Linguagem Java");
        a2.mediaSemRetorno();

    }
}
