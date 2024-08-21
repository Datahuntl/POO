public class Main
{
    public static void main(String[] args)
    {
        Disciplina D1 = new Disciplina();
        Disciplina D2 = new Disciplina();
        Professor P1 = new Professor();
        Professor P2 = new Professor();

        Aluno[] alunos = new Aluno[6];

        P1.nome = "Chris careca";
        P2.nome = "Chris com cabelo";

        alunos[0] = new Aluno();
        alunos[0].nome = "Brunilda";
        alunos[0].matricula = 78;
        alunos[0].inteligencia = 12;

        alunos[1] = new Aluno();
        alunos[1].nome = "Hoberto";
        alunos[1].matricula = 14;
        alunos[1].inteligencia = 19;

        alunos[2] = new Aluno();
        alunos[2].nome = "Weverton";
        alunos[2].matricula = 79;
        alunos[2].inteligencia = 6;

        alunos[3] = new Aluno();
        alunos[3].nome = "Paula";
        alunos[3].matricula = 32;
        alunos[3].inteligencia = 20;

        alunos[4] = new Aluno();
        alunos[4].nome = "Joliete";
        alunos[4].matricula = 9;
        alunos[4].inteligencia = 10;

        alunos[5] = new Aluno();
        alunos[5].nome = "Iago";
        alunos[5].matricula = 41;
        alunos[5].inteligencia = 6;

        D1.nome = "Matemática";
        D1.creditos = 6;
        D1.prof = P1;
        D1.aluno[0] = alunos[0];
        D1.aluno[1] = alunos[1];
        D1.aluno[2] = alunos[2];

        D2.nome = "Física";
        D2.creditos = 4;
        D2.prof = P2;
        D2.aluno[0] = alunos[3];
        D2.aluno[1] = alunos[4];
        D2.aluno[2] = alunos[5];

        D1.mostraAlunos();
        D2.mostraAlunos();

    }
}
