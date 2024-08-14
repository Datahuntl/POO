
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        double comprimento;
        double largura;

        double area;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor do comprimento: ");
        comprimento = entrada.nextDouble();
        System.out.print("Insira o valor da largura: ");
        largura = entrada.nextDouble();

        area = comprimento * largura;

        System.out.println("Valor da Area: " + (int)area);

        entrada.close();
    }
}
