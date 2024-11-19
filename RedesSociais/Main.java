package RedesSociais.Execeptions;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Redes sociais
        Facebook contaFacebook = new Facebook();
        Instagram contaInstagram = new Instagram();

        contaFacebook.senha = "darwin2000";
        contaFacebook.numAmigos = 325;
        contaInstagram.senha = "darwin2000";
        contaInstagram.numAmigos = 35;

        RedeSocial[] redesSociais = { contaFacebook, contaInstagram };

        // Usuário
        Usuario user = new Usuario("Whindersson Nunes", "whindinho@gmail.com", redesSociais);

        try {
            for (RedeSocial redeSocial : user.getRedesSociais()) {
                if (redesSociais == null || redesSociais.length == 0) {
                    throw new UsuarioSemRedesSociaisException();
                }

                redeSocial.postarFoto();
                redeSocial.postarVideo();

                if (redeSocial instanceof VideoConferencia) {
                    ((VideoConferencia) redeSocial).fazStreaming();
                } else {
                    throw new RedeSocialNaoSuportaVideoConferenciaException("A rede social "
                            + redeSocial + " não suporta compartilhamento.");
                }
            }
        } catch (UsuarioSemRedesSociaisException e) {
            System.out.println(e.getMessage());
        } catch (RedeSocialNaoSuportaVideoConferenciaException e) {
            System.out.println(e.getMessage());
        }

    }
}
