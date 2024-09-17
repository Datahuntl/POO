public class Livro {
    private String titulo;
    private int nPaginas;
    private String categoria;
    private String nomeAutor;

    public Livro(String titulo, int nPaginas, String categoria)
    {
        this.titulo = titulo;
        this.nPaginas = nPaginas;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setNomeAutor(String nomeAutor)
    {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeAutor()
    {
        return this.nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public String getCategoria() {
        return categoria;
    }
}
