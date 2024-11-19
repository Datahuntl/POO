package RedesSociais.Execeptions;

public class UsuarioSemRedesSociaisException extends Exception {
    public UsuarioSemRedesSociaisException() {
        super("O usuário deve estar conectado a pelo menos uma rede social.");
    }
}
