public class Empresa {
    private String nome;
    private float faturamento;
    private Funcionario[] funcionarios = new Funcionario[2];
    private Gerente gerente;

    public Empresa()
    {
        gerente = new Gerente();
    }

    public void contrataFuncionario(Funcionario funcionario)
    {
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == null)
            {
                funcionarios[i] = funcionario;
                break;
            }
        }
    }

    public void promoveFuncionario(Funcionario funcionario)
    {
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == funcionario)
            {
                funcionario.setSalario((float) (funcionario.getSalario() + 100.25));
            }
        }
    }

    public void mostraFuncionarios()
    {
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null)
            {
                System.out.println("Nome: " + funcionarios[i].getNome());
                System.out.println("Salário: " + funcionarios[i].getSalario());
            }
        }
    }

    public float venderProjeto()
    {
        if(gerente.isCarismatico())
        {
            faturamento = (float) (faturamento + 15.725);
            return faturamento;
        }
        else
        {
            return faturamento;
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", faturamento=" + faturamento +
                ", gerente=" + gerente.getNome() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
