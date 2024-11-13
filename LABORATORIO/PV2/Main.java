public class Main {
    public static void main(String[] args) {

        Heroi H = new Heroi("James Bond", 125);
        Vilao V = new Vilao("Gru", 75);

        Arma A1 = new Arma("Golden Gun", 100, 25);
        Arma A2 = new Arma("Excalibur", 50, 200);
        Arma A3 = new Arma("Arma de Gelo", 25, 125);
        Arma A4 = new Arma("Arma de Peido", 75, 80);

        H.addArma(A1);
        H.addArma(A2);
        H.mostrarArmas();

        V.addArma(A3);
        V.addArma(A4);
        V.mostrarArmas();

        System.out.println(V.toString());
        System.out.println(H.toString());

        H.atacar(0,V);

        System.out.println(V.toString());
        System.out.println(H.toString());

        H.atacar(1,V);

        System.out.println(V.toString());
        System.out.println(H.toString());

        H.usarEspecial(V);
        V.usarEspecial(H);

        System.out.println(V.toString());
        System.out.println(H.toString());

        H.atacar(1, V);

    }
}
