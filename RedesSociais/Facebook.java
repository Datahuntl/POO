package RedesSociais.Execeptions;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void Compartilhar() {
        System.out.println("Compartilhando no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando Foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando Video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando Comentario no Facebook");
    }

}
