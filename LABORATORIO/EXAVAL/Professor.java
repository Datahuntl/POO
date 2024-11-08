import java.util.HashSet;
import java.util.Set;

public class Professor extends Usuario implements Autenticável{

    private Set<Aluno> lista_alunos = new HashSet<Aluno>();
    public Professor(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    public void addAlunoLista(Aluno a1)
    {

    }

    private void mostraAlunos()
    {

    }

    @Override
    public void acessarSistema()
    {

    }
}
