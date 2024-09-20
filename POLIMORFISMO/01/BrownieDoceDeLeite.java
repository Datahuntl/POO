public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite()
    {
        System.out.println("Adicionando Doce De Leite...");
    }

    @Override
    public void addCarrinhodeCompras() {
        System.out.println("Adicionando o Brownie de Doce de Leite ao carrinho");
    }
}
