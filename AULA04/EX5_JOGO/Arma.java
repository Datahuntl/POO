public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;


    public void mostraInfoArma()
    {
        System.out.println("Mostrando informações da: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistência: " + resistencia);
        System.out.println("Descrição: " + descricao);
    }
}
