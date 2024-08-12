import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int NumeroAlunos;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Coloque o numero de alunos:");
        NumeroAlunos = entrada.nextInt();

        switch (NumeroAlunos)
        {
            case 10:
                System.out.println("Sala I-16");
                break;
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
        }
    entrada.close();
    }
}
