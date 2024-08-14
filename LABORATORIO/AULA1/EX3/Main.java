import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int numero;

        Scanner entrada = new Scanner(System.in);

        numero = entrada.nextInt();
        
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
    }
}
