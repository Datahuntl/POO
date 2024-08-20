public class Kart {
    String nome;

    Motor motor;
    
    Piloto piloto;

    public void Motor()
    {
        motor = new Motor();
    }

    public void pular()
    {
        System.out.println("Pulando!");
    }

    public void soltarTurbo()
    {
        System.out.println("Soltando Turbo!!!");
    }

    public void fazerDrift()
    {
        System.out.println("Fazendo drift!!");
    }
}
