public class Main {
    public static void main(String[] args) {

        Empresa E1 = new Empresa();
        E1.setNome("AMBEV");
        E1.setFaturamento(25.75F);

        E1.getGerente().setNome("Kleber");
        E1.getGerente().setSalario(4000F);
        E1.getGerente().setCarismatico(true);

        Funcionario F1 = new Funcionario();
        F1.setNome("Hamberson");
        F1.setCargo("Zelador");
        F1.setEnergia(12);
        F1.setSalario(1200);

        Funcionario F2 = new Funcionario();
        F2.setNome("Kleber");
        F2.setCargo("Gerente");
        F2.setEnergia(8);
        F2.setSalario(4000);

        Dependente D1 = new Dependente();
        D1.setNome("Juliana");
        D1.setParentesco("Mãe");

        //Métodos da Empresa
        System.out.println(E1.toString());
        E1.contrataFuncionario(F1);
        E1.contrataFuncionario(F2);
        E1.mostraFuncionarios();
        E1.promoveFuncionario(F1);
        E1.mostraFuncionarios();
        E1.venderProjeto();
        System.out.println(E1.toString());

        //Métodos do Gerente
        System.out.println(E1.getGerente().toString());

        //Métodos do Funcionario
        F2.trabalhar();
        F2.trabalhar();
        F2.trabalhar();
        F2.trabalhar();
        F2.trabalhar();
        F2.addDependente(D1);
        System.out.println(F2.toString());

        //Métodos do Dependente
        System.out.println(D1.toString());

    }
}
