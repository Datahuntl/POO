public class Autor {
    private String nome;
    private String pais;

    public void escreverLivro(Livro livro)
    {
        livro.setNomeAutor(nome);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }
    public String getPais()
    {
        return this.pais;
    }

}
