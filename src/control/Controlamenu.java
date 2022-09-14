package control;

import ui.ImprimeDialogs;

public class Controlamenu {

	ImprimeDialogs imprimeDialogs = new ImprimeDialogs();
	ControlaPersonagem controlePersonagem = new ControlaPersonagem();
	ControlaClasse controleClasse = new ControlaClasse();
	ControlaArma controleArma = new ControlaArma();

	public Controlamenu() {
		boolean controlaWhile = true;

		while (controlaWhile) {
			controlaWhile = menuPrincipal();
		}
	}

	public boolean menuPrincipal() {
		int opcao;
		boolean whileControl = true;

		opcao = imprimeDialogs.apresentaDialogcomInputInteiro("1-Criar Personagem\n2-Sair",
				"TheGame");

		switch (opcao) {

			case 1:
				String nomePersonagem;
				nomePersonagem = imprimeDialogs.apresentaDialogcomInputString("Digite o seu nome jogador:",
						"CriandoPersonagem");
				controlePersonagem.setName(nomePersonagem);
				menuCriacaoPersonagem();
				break;

			case 2:
				whileControl = false;
				break;
		}

		return whileControl;
	}

	public void menuCriacaoPersonagem() {
		int opcao;
		int opcao2;

		opcao = imprimeDialogs.apresentaDialogcomInputInteiro(
				"1-Selecionar Classe\n2-Selecionar Arma\n3-Selecionar Skill\n4-Sair",
				"CriacaoPersonagem");

		switch (opcao) {

			case 1:
				opcao2 = imprimeDialogs.apresentaDialogcomInputInteiro(
						"1-Soldier \n2-Guerreiro \n3-Arqueiro \n4-Mago \n5-Elfo \n6-Sair",
						"Escolha Classe");
				controleClasse.selecionaClasse(opcao2, controlePersonagem.getPlayer());
				break;

			case 2:
				controleArma.SelecionaArma(controlePersonagem.getPlayer());
				menuCriacaoPersonagem();
				break;

			case 3:
				break;

			case 4:
			System.out.printf("Saindo da Criacao Personagem");
				break;
		}
	}

}