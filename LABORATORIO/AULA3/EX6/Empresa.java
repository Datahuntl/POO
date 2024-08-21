public class Empresa {
    String nome;
    double valorMercado;
    int numeroFuncionarios;

    Departamento dep;

    public Empresa()
    {
        dep = new Departamento();
    }

    public void aumentaValor()
    {
        System.out.println("Aumentando valor de mercado da empresa " + nome);
    }
}
