public class Main {
    public static void main(String[] args) {

        Zumbi Z1 = new Zumbi();
        Zumbi Z2 = new Zumbi();

        Z1.nome = "Jobesvaldo";
        Z1.vida = 25;

        Z2.nome = "Klóvis";
        Z2.vida = 30;

        System.out.println(Z1.mostraVida());
        System.out.println(Z2.mostraVida());

        Z1.transfereVida(Z2, 5);
        System.out.println(Z1.mostraVida());
        System.out.println(Z2.mostraVida());

    }
}
