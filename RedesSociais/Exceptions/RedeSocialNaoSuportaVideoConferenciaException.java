package RedesSociais.Execeptions;

public class RedeSocialNaoSuportaVideoConferenciaException extends RuntimeException {
    public RedeSocialNaoSuportaVideoConferenciaException(String mensagem) {
        super(mensagem);
    }
}
