public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe()
    {
        System.out.println("Adicionando Café...");
    }

    @Override
    public void addCarrinhodeCompras() {
        System.out.println("Adicionando o Brownie de Café ao carrinho");
    }
}
