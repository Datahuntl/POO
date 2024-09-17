public class Biblioteca {
    private String nome;
    private String bairro;

    private Livro livros[];
    private Bibliotecario bib;

    public Biblioteca(String nome, String bairro)
    {
        this.nome = nome;
        this.bairro = bairro;
        bib = new Bibliotecario();
    }

    public void emprestarLivro(Bibliotecario b1, Cliente c1, Livro l1)
    {
        if(b1.getDisponivel() & c1.getDebito()==0 & confereLivro(l1))
        {
            removerLivro(l1);
            System.out.println("Livro emprestado.");
        }
        else
        {
            System.out.println("Livro não emprestado");
        }
    }

    private boolean confereLivro(Livro livro)
    {
        for (int i = 0; i < livros.length; i++)
        {
            if(livros[i] == livro)
            {
                return true;
            }
        }
        return false;
    }

    public void removerLivro(Livro livro)
    {
        for (int i = 0; i < livros.length; i++)
        {
            if(livros[i] == livro)
            {
                livros[i] = null;
                System.out.println("Livro " + livro + " removido da biblioteca");
            }
        }
        System.out.println("Livro " + livro + " não foi encontrado na biblioteca");
    }

    public void addLivro(Livro livro)
    {
        for (int i = 0; i < livros.length; i++)
        {
            if(livros[i] == null)
            {
                livros[i] = livro;
                System.out.println("Livro " + livro + " adicionado da biblioteca");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Livro[] getLivros() {
        return livros;
    }
}
