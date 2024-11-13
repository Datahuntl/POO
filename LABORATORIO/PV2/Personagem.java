import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected List<Arma> armas = new ArrayList<>();

    public Personagem(String nome, int vida)
    {
        this.nome = nome;
        this.vida = vida;
    }

    public void addArma(Arma arma)
    {
        armas.add(arma);
    }

    public void  mostrarArmas()
    {
        for (int i = 0; i < 2; i++)
        {
            System.out.println(armas.get(i).toString());
        }
    }

    public void atacar(int posicao, Personagem personagem)
    {
        try{
            armas.get(posicao);
        } catch(ArmaPosicaoErrada e)
        {
            e.printStackTrace();
        }
        if(armas.get(posicao).getDurabilidade() <= 0)
        {
            throw new ArmaQuebradaException("Arma está quebrada.");
        } else if (personagem.vida <= 0)
        {
            System.out.println("Personagem derrotado.");
        } else if (personagem.vida > 0 & armas.get(posicao).getDurabilidade() > 0)
        {
            armas.get(posicao).setDurabilidade(0);
            personagem.vida = personagem.vida - armas.get(posicao).getDano();
        }
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                '}';
    }
}
