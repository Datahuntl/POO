import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario implements Autenticável{
    private List<Double> notas = new ArrayList<Double>();
    private double media;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    private void fazerMatricula()
    {

    }

    public void fazerProva(double nota)
    {
        notas.add(nota);
    }

    public double calcularMedia()
    {
        for (int i = 0; i < 1; i++) {
            media = notas.get(i);
        }
        
        return media;
    }

    @Override
    public void acessarSistema()
    {

    }
}
