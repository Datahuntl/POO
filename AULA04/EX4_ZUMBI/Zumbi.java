public class Zumbi{
    public double vida;
    public String nome;

    public double mostraVida()
    {
        return vida;
    }
    public boolean transfereVida(Zumbi zumbiAlvo, double quantia)
    {
        if(vida >= quantia) {
            zumbiAlvo.vida = zumbiAlvo.vida + quantia;
            vida = vida - quantia;
            return true;
        }
        else {
            return false;
        }

    }
}
