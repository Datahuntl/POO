package RedesSociais.Execeptions;

public class Instagram extends RedeSocial implements Compartilhamento {

    @Override
    public void Compartilhar() {
        System.out.println("Compartilhando no Instagram");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando Foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando Video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando Comentario no Instagram");
    }
}
