import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        String nome;

        Scanner entrada = new Scanner(System.in);

        do {
            
            System.out.print("Insira o seu nome: ");

            nome = entrada.nextLine();

            System.out.print("Nome: " + nome);

            System.out.println();

            System.out.print("Alterado para: " + nome.toUpperCase());
            
            System.out.println();

        } while (nome.compareTo("sair") != 0);


    }
}
