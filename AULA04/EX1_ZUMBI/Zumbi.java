public class Zumbi {

    String nome;
    double vida;
    double forca;
    public void Atacar()
    {
        System.out.println("Atacando...");
    }
    public void Comer()
    {
        System.out.println("Comendo cerebro...");
    }
    public void Info()
    {
        System.out.println("Informações do comedor de cerebro:");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força " + forca);
    }
}
