public class Cliente {
    private String nome;
    private int idade;
    private double debito;

    public double pagarDebito(double quantia)
    {
        if (quantia > debito) //Quantia maior que debito
        {
            debito = 0;
            return quantia - debito;
        }
        else if (quantia < debito) //Quantia menor que debito
        {
            debito = debito - quantia;
            return debito;
        }
        else // Quantia mesma que debito
        {
            debito = 0;
            return debito;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }
}
