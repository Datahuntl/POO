public class Main {
    public static void main(String[] args) {
        
        Mago gandalf = new Mago();
        Guerreiro connan = new Guerreiro();
        Assasino kenway = new Assasino();

        gandalf.nome = "Gandalf the Grey";
        gandalf.vida = 10;
        gandalf.poder = 75;
        gandalf.energia = 30;
        
        connan.nome = "Connan the Barbarian";
        connan.vida = 120;
        connan.poder = 25;
        connan.energia = 50;
        connan.arma.nome = "Excalibur";
        connan.arma.dano = 10;

        kenway.nome = "Pirate Kenway";
        kenway.vida = 45;
        kenway.poder = 35;
        kenway.energia = 70;
        kenway.arma.nome = "Hidden Blade";
        kenway.arma.dano = 5;

        System.out.println("Mago:");
        System.out.println(gandalf.nome + " Vida:" + gandalf.vida + " Poder:" + gandalf.poder + " Energia:" + gandalf.energia);
        gandalf.usarHabilidade();

        System.out.println("Guerreiro:");
        System.out.println(connan.nome + " Vida:" + connan.vida + " Poder:" + connan.poder + " Energia:" + connan.energia);
        connan.usarHabilidade();
        connan.atacar(kenway);

        System.out.println("Assasino:");
        System.out.println(kenway.nome + " Vida:" + kenway.vida + " Poder:" + kenway.poder + " Energia:" + kenway.energia);
        kenway.usarHabilidade();
        kenway.atacar(connan);
    }
}
