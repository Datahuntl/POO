package RedesSociais.Execeptions;

public class Twitter extends RedeSocial implements Compartilhamento {

    @Override
    public void Compartilhar() {
        System.out.println("Compartilhando no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando Foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando Video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando Comentario no Twitter");
    }

}
