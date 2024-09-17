public class Main {
    public static void main(String[] args) {

        Autor A1 = new Autor();
        Autor A2 = new Autor();

        A1.setNome("Gesvaldo");
        A1.setPais("Brasil");
        A2.setNome("Julius");
        A2.setPais("Estados Unidos");

        Cliente C1 = new Cliente();
        Cliente C2 = new Cliente();

        C1.setNome("Toninho");
        C1.setDebito(210.45);
        C1.setIdade(21);
        C2.setNome("Lola");
        C2.setDebito(0);
        C2.setIdade(34);

        Livro L1 = new Livro("1984", 124, "Ficção");
        Livro L2 = new Livro("Laranja Mecânica", 254, "Ficção");
        Livro L3 = new Livro("Admirável Mundo Novo", 54, "Ficção");
        Livro L4 = new Livro("Metrópolis", 569, "Ficção");
        Livro L5 = new Livro("Fahrenheit 451", 210, "Ficção");
        Livro L6 = new Livro("Grognak the Barbarian", 98, "Ação");

        Biblioteca B1 = new Biblioteca("Biblioteca Regional", "Rua dos Marfagafos");

        
    }
}
