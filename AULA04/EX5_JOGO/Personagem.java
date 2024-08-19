public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    public void usarArma()
    {
        System.out.println("Usando arma " + arma.nome);
    }

    public void tomarDano()
    {
        System.out.println("Tomando dano");
    }
}
