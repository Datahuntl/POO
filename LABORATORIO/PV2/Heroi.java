import java.util.ArrayList;
import java.util.List;

public class Heroi extends Personagem implements Combater{

    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem)
    {
        personagem.armas.clear();
        System.out.println(nome + " usando especial . . .");
    }
}
