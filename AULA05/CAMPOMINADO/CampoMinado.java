public class CampoMinado {

    int [][] matrizExemplo = new int[5][5];

    public void montaCampo()
    {
        for (int i = 0; i < matrizExemplo.length; i++)
        {
            for (int j = 0; j < matrizExemplo[i].length; j++) {
                matrizExemplo[i][j] = i + j;
            }
        }
    }
    public void mostraCampo()
    {
        for (int i = 0; i < matrizExemplo.length; i++)
        {
            System.out.print("| ");
            for (int j = 0; j < matrizExemplo[i].length; j++) {
                System.out.print("X ");
            }
            System.out.println("|");
        }
    }
}
