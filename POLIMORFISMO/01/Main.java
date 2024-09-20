public class Main {
    public static void main(String[] args) {

        BrownieNutella BN = new BrownieNutella("Famoso", 13.99, "Nutella");
        BrownieDoceDeLeite BDCL = new BrownieDoceDeLeite("Ataque Cardiaco", 15.99, "Doce de Leite");
        BrownieCafe BC = new BrownieCafe("Energético", 9.99, "Café");

        Comprador C1 = new Comprador("Joaquin", 39.99);
        Comprador C2 = new Comprador("Geovani", 120);

        BN.addCarrinhodeCompras();
        BN.adicionaNutella();
        BN.calculaTotalCompras(BN);
        BN.mostraInfo();

        System.out.println();

        BDCL.addCarrinhodeCompras();
        BDCL.adicionaDoceDeLeite();
        BDCL.calculaTotalCompras(BN);
        BDCL.mostraInfo();

        System.out.println();

        BC.addCarrinhodeCompras();
        BC.adicionaCafe();
        BC.calculaTotalCompras(BN);
        BC.mostraInfo();

        System.out.println();

        C1.efetuarCompra(BN);

        System.out.println();

        C2.efetuarCompra(BC);
    }
}
