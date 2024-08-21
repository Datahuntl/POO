public class Disciplina {
    String nome;
    int creditos;
    Professor prof;
    Aluno[] aluno = new Aluno[3];

    public void mostraAlunos() {
        for (int i = 0; i < aluno.length; i++)
        {
            System.out.println("Nome: " + aluno[i].nome);
            System.out.println("Matricula: " + aluno[i].matricula);
            System.out.println("Inteligencia: " + aluno[i].inteligencia);
            System.out.println();
        }
    }
}
