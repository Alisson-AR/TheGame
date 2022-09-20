package control;

import ui.ImprimeDialogs;

import model.Classe;
import model.Life;
import model.Player;

public class ControlaClasse {
    ImprimeDialogs imprimeDialogs = new ImprimeDialogs();

    Life lifeSoldier = new Life(80);
    Life lifeGuerreiro = new Life(100);
    Life lifeArqueiro = new Life(70);
    Life lifeMago = new Life(60);
    Life lifeElfo = new Life(65);

    Classe classe1 = new Classe("SOLDIER", lifeSoldier);
    Classe classe2 = new Classe("GUERREIRO", lifeGuerreiro);
    Classe classe3 = new Classe("ARQUEIRO", lifeArqueiro);
    Classe classe4 = new Classe("MAGO", lifeMago);
    Classe classe5 = new Classe("ELFO", lifeElfo);

    public ControlaClasse() {

    }

    public void selecionaClasse(int opcaoClasse, Player jogador) {
        switch (opcaoClasse) {
            case 1:
                jogador.setClasse(classe1);
                break;
            case 2:
                jogador.setClasse(classe2);
                break;
            case 3:
                jogador.setClasse(classe3);
                break;
            case 4:
                jogador.setClasse(classe4);
                break;
            case 5:
                jogador.setClasse(classe5);
                break;
            default:
                System.out.printf(
                        "Nenhuma classe foi escolhida, escolha alguma classe válida");
                break;
        }
        jogador.setLife(jogador.getClasse().getLife());
    }
}