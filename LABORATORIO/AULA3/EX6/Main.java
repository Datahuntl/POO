public class Main {
    public static void main(String[] args) {

        Empresa E1 = new Empresa();
        Empresa E2 = new Empresa();

        E1.nome = "General Motors";
        E1.numeroFuncionarios = 500;
        E1.valorMercado = 7800.40;
        E1.dep.nome = "QA";
        E1.dep.gerente = "Chris com Cabelo";
        E1.dep.lucro = 180.35;

        E2.nome = "EMBRAER";
        E2.numeroFuncionarios = 170;
        E2.valorMercado = 3250;
        E2.dep.nome = "QA";
        E2.dep.gerente = "Hoberto";
        E2.dep.lucro = 45;

        E1.aumentaValor();
        System.out.println();
        E2.aumentaValor();

        System.out.println();

        E1.dep.mostraInfo();
        System.out.println();
        E2.dep.mostraInfo();

    }
}
