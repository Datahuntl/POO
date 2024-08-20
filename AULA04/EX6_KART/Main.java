public class Main {
    public static void main(String[] args) {

        Piloto P1 = new Piloto();
        Motor M1 = new Motor();
        Kart K1 = new Kart();

        P1.nome = "Roji";
        P1.vilao = false;
        P1.soltaSuperPoder();

        M1.cilindrada = "500";
        M1.velocidadeMaxima = 180;

        K1.motor = M1;
        K1.nome = "Poderosa";
        K1.fazerDrift();
        K1.pular();
        K1.soltarTurbo();
        K1.piloto = P1;

    }
}
