public class Zumbi{
    public double vida;
    public String nome;

    public double mostraVida()
    {
        return vida;
    }
    public void transfereVida(Zumbi zumbiAlvo, double quantia)
    {
        zumbiAlvo.vida = zumbiAlvo.vida + quantia;
        vida = vida - quantia;
    }
}
