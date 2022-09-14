package control;

import model.Player;
import model.Weapon;

public class ControlaPersonagem {

    private Player jogador1 = new Player();

    public ControlaPersonagem() {
        // jogador1.setName("Angel");
    }

    public void setName(String nome) {
        jogador1.setName(nome);
    }

    public void setWeapon(Weapon arma) {
        jogador1.setWeapon(arma);
    }

    public Player getPlayer() {
        return this.jogador1;
    }

}
