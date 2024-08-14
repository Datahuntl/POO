public class Main{
    public static void main(String[] args) {

        Carro C1 = new Carro();
        Carro C2 = new Carro();

        C1.modelo = "Sandero";
        C1.velocidadeMaxima = 150;
        C1.ano = "2013";
        C1.rebaixado = false;

        C1.Caracteristicas();
        C1.Acelerando();
        System.out.print("Tem multas? ");
        if (C1.Multa() == true)
            System.out.println("Sim");
        else
            System.out.println("Não");

        System.out.println();

        C2.modelo = "Gol";
        C2.velocidadeMaxima = 120;
        C2.ano = "2002";
        C2.rebaixado = true;

        C2.Caracteristicas();
        C2.Acelerando();
        System.out.print("Tem multas? ");
        if (C2.Multa() == true)
            System.out.println("Sim");
        else
            System.out.println("Não");

    }
}
