public class Guerreiro extends Personagem implements LutarComArmas {

    Arma arma;
    
    @Override
    public void atacar(Personagem personagem) {
        {
            System.out.println("Atacando personagem " + personagem.nome);
            System.out.println("Foi retirado " + arma.dano);
            System.out.println("Ele está com " + personagem.vida + " de vida");

            personagem.vida = personagem.vida - arma.dano;
        }
        
    }

}
