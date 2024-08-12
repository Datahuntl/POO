import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int Num;
        int NumAleatorio;

        do
        {
            NumAleatorio = rand.nextInt(10) + 1;
            System.out.println(NumAleatorio);

            System.out.print("Adivinhe o Número: ");
            Num = entrada.nextInt();

            if(Num < NumAleatorio)
            {
                System.out.println("Errou!");
                System.out.println("O Número digitado foi menor que o digitado...");
            }
            if(Num > NumAleatorio)
            {
                System.out.println("Errou!");
                System.out.println("O Número digitado foi maior que o digitado...");
            }

        }
        while(Num != NumAleatorio);

        System.out.println("Acertou!");

    }
}
