public class Departamento {
    String nome;
    String gerente;
    double lucro;

    public void mostraInfo()
    {
        System.out.println("Mostrando informações do departamento: " + nome);
        System.out.println("Gerente: " + gerente);
        System.out.println("Lucro: " + lucro);
    }
}
