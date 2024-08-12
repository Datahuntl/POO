import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int NumAdivinha;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Adivinhe o Numero: ");
        NumAdivinha = entrada.nextInt();

        Random rand = new Random();

        int NumAleatorio = rand.nextInt(10) + 1;

        while(NumAdivinha != NumAleatorio)
        {
            System.out.println("Errou! O numero era: " + NumAleatorio);

            NumAleatorio = rand.nextInt(10) + 1;

            System.out.print("Adivinhe o Numero: ");
            NumAdivinha = entrada.nextInt();
        }

        System.out.println("Acertou! O numero era: " + NumAleatorio);
        
        entrada.close();

    }
}
