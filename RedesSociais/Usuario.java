package RedesSociais.Execeptions;

import java.util.Set;
import java.util.HashSet;

public class Usuario {

    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais = new HashSet<>();

    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        for (RedeSocial redeSocial : redesSociais) {
            this.redesSociais.add(redeSocial);
        }
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RedeSocial> getRedesSociais() {
        return redesSociais;
    }
}
