public class Cliente {
    String nome;
    long cpf;
    Computador computador;

    float calculaTotalCompra() {
        return computador.preco;
    }
}
