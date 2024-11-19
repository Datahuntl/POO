package RedesSociais.Execeptions;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void Compartilhar() {
        System.out.println("Compartilhando no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando Foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando Video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando Comentario no GooglePlus");
    }

}
