public class Carro {

    String modelo;
    int velocidadeMaxima;
    String ano;
    boolean rebaixado;

    public void Acelerando()
    {
        System.out.println("Acelerando até " + velocidadeMaxima + " km/h!!!!");
    }

    public void Caracteristicas()
    {
        System.out.println("Imprimindo as caracteristicas do carro");
        System.out.println("--------------------------------------------");
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Velocidade Maxima: " + velocidadeMaxima);
        System.out.println("Ano do Carro: " + ano);
        System.out.println("É rebaixado: " + rebaixado);
        System.out.println("--------------------------------------------");
    }

    public boolean Multa()
    {
        if(rebaixado == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
