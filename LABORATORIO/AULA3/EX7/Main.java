public class Main
{
    public static void main(String[] args)
    {
        Carro[] carros = new Carro[4];

        carros[0] = new Carro();
        carros[1] = new Carro();
        carros[2] = new Carro();
        carros[3] = new Carro();

        carros[0].modelo = "Onyx";
        carros[0].ano = "2002/1";
        carros[0].velocidadeMaxima = 130;
        carros[0].rebaixado = false;

        carros[1].modelo = "Uno";
        carros[1].ano = "2015/2";
        carros[1].velocidadeMaxima = 110;
        carros[1].rebaixado = false;

        carros[2].modelo = "Honda City";
        carros[2].ano = "2012/2";
        carros[2].velocidadeMaxima = 140;
        carros[2].rebaixado = true;

        carros[3].modelo = "Eco Sport";
        carros[3].ano = "2014/1";
        carros[3].velocidadeMaxima = 125;
        carros[3].rebaixado = false;

        carros[0].Caracteristicas();
        carros[0].Acelerando();
        System.out.println("Tem multa? " + carros[0].Multa());

        carros[1].Caracteristicas();
        carros[1].Acelerando();
        System.out.println("Tem multa? " + carros[1].Multa());

        carros[2].Caracteristicas();
        carros[2].Acelerando();
        System.out.println("Tem multa? " + carros[2].Multa());

        carros[3].Caracteristicas();
        carros[3].Acelerando();
        System.out.println("Tem multa? " + carros[3].Multa());
    }
}
