public class Dependente {
    private String nome;
    private String parentesco;

    @Override
    public String toString() {
        return "Dependente{" +
                "nome='" + nome + '\'' +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
