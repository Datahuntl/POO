public class Main {
    public static void main(String[] args) {

        Personagem P1 = new Personagem();
        Personagem P2 = new Personagem();

        Arma A1 = new Arma();
        Arma A2 = new Arma();

        P1.nome = "Bruneisvaldo";
        P1.pontos = 15;
        P1.arma = A1;
        P2.nome = "Klobis";
        P2.pontos = 5;
        P2.arma = A2;

        A1.nome = "Excalibur";
        A1.poder = 30;
        A1.resistencia = 15;
        A1.descricao = "Uma arma tirada de uma pedra...";
        A2.nome = "Arco";
        A2.poder = 20;
        A2.resistencia = 10;
        A2.descricao = "Um arco simples...";

    }
}
