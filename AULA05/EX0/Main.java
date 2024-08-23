public class Main {
    public static void main(String[] args) {

    Cantina C1 = new Cantina();

    Salgado S1 = new Salgado();
    Salgado S2 = new Salgado();
    Salgado S3 = new Salgado();

    S1.nome = "Coxinha";
    S2.nome = "Joelho";
    S3.nome = "Bolinha de Queijo";

    C1.nome = "Xiko's Lanche";

    C1.mostraInfo();

    C1.addSalgado(S1);

    C1.mostraInfo();

    C1.addSalgado(S2);

    C1.mostraInfo();

    C1.addSalgado(S3);

    C1.mostraInfo();

    }
}
