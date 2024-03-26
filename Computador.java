public class Computador {

    String marca;
    float preco;
    MemoriaUSB musb;
    SistemaOperacional sysOp;
    HardwareBasico hardBas;
    Cliente clientes[];

    public Computador() {
        sysOp = new SistemaOperacional();
        hardBas = new HardwareBasico();
    }

    void mostraPCConfigs() {
        System.out.println("---INFOMARÇÕES DO COMPUTADOR---");
        System.out.println("Marca: " + this.marca + "\n" +
                "Preço: " + this.preco + "\n" +
                "Sistema Operacional: " + sysOp.nome + " " + sysOp.tipo + "\n" +
                "Hardware Basico: " + hardBas.nome + " com capadidade de: " + hardBas.capacidade);
    }

    void addMemoriaUSB(MemoriaUSB musb) {

    }
}