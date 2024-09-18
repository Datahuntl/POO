public class Funcionario {
    private String nome;
    private float salario;
    private String cargo;
    private int energia;
    private Dependente dependente;

    public void trabalhar()
    {
        if(energia > 0)
        {
            System.out.println("Funcionario " + nome + " trabalhando...");
            energia = energia - 2;
        }
        else
        {
            descansar();
        }
    }

    private void descansar()
    {
        System.out.println("Funcionario " + nome + " descansando...");
        energia = energia + 10;
    }

    public void addDependente(Dependente dependente)
    {
        this.dependente = dependente;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", energia=" + energia +
                ", dependente=" + dependente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
}
