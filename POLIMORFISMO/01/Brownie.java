public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;
    public Brownie(String nome, double preco, String sabor)
    {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }
    public void addCarrinhodeCompras()
    {
        System.out.println("Adicionando o Brownie ao carrinho");
    }

    public void calculaTotalCompras(Brownie brownie)
    {
        System.out.println("Total é: " + brownie.preco);
    }

    public void mostraInfo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }

}
