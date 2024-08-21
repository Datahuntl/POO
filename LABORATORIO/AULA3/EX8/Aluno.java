public class Aluno {
    String nome;
    int matricula;
    int inteligencia;

    public void estudar()
    {
        System.out.println("Aluno " + nome + " estudando...");
        inteligencia = inteligencia + 1;
        System.out.println("Inteligencia de " + nome + " aumentada para: " + inteligencia);
    }
}
