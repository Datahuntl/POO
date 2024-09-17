public class Bibliotecario {
    private String nome;
    private int idade;
    private boolean disponivel;

    public void listarLivros(Biblioteca biblioteca)
    {
        for (int i = 0; i < biblioteca.getLivros().length; i++) {
            System.out.println("Título: " + biblioteca.getLivros()[i].getTitulo());
            System.out.println("Número de Páginas: " + biblioteca.getLivros()[i].getnPaginas());
            System.out.println("Categoria: " + biblioteca.getLivros()[i].getCategoria());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getIdade()
    {
        return this.idade;
    }

    public void setDisponivel(boolean disponivel)
    {
        this.disponivel = disponivel;
    }

    public boolean getDisponivel()
    {
        return disponivel;
    }

}
