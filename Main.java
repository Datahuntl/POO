import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Computador C1 = new Computador();
        Computador C2 = new Computador();
        Computador C3 = new Computador();

        C1.marca = "Positivo";
        C1.preco = 2300;
        C1.sysOp.nome = "Linux Ubuntu";
        C1.sysOp.tipo = 32;
        C1.hardBas.nome = "Pentium Core i3";
        C1.hardBas.capacidade = 2200;
        C1.musb.nome = "Pen-drive";
        C1.musb.capacidade = 16;

        C2.marca = "Acer";
        C2.preco = 5800;
        C2.sysOp.nome = "Windows 8";
        C2.sysOp.tipo = 64;
        C2.hardBas.nome = "Pentium Core i5";
        C2.hardBas.capacidade = 3370;
        C2.musb.nome = "Pen-Drive";
        C2.musb.capacidade = 32;

        C3.marca = "Vaio";
        C3.preco = 1800;
        C3.sysOp.nome = "Windows 10";
        C3.sysOp.tipo = 64;
        C3.hardBas.nome = "Pentium Core i7";
        C3.hardBas.capacidade = 4500;
        C3.musb.nome = "HD Externo";
        C3.musb.capacidade = 1000;

        System.out.println("---BEM VINDO  PC MANIA---");

        System.out.println("Nós estamos com uma promoção imperdível!");

        int entrada;

        do {
            System.out.println("Insira:" + "\n" + "1 - Para conferir a Promoção 1" + "\n" +
                    "2 - Para conferir a Promoção 2" + "\n" + "3 - Para Conferir a Promoção 3" + "\n" +
                    "0 - Para fechar o menu de promoções");
            entrada = sc.nextInt();

            if (entrada == 1) {
                C1.mostraPCConfigs();
            } else if (entrada == 2) {
                C2.mostraPCConfigs();
            } else if (entrada == 3) {
                C3.mostraPCConfigs();
            }

        } while (entrada != 0);

        System.out.println("O que você deseja comprar?");

        float preco = 0;

        do {
            System.out.println("Insira: " + "\n" +
                    "1 - Para adicionar no carrinho o computador da promoção 1" +
                    "\n" + "2 - Para adicionar no carrinho o computador da promoção 3" +
                    "\n" + "3 - Para adicionar no carrinho o computador da promoção 3" +
                    "\n" + "0 - Para fechar o menu de compras");

            if (entrada == 1) {
                Cliente.calculaTotalCompra();
            } else if (entrada == 2) {
                Cliente.calculaTotalCompra();
            } else if (entrada == 3) {
                Cliente.calculaTotalCompra();
            }

        } while (entrada != 0);

        sc.close();
    }
}