package controla;

import javax.swing.JOptionPane;

import ui.ImprimeMenus;

public class Controlamenu{
	
	ImprimeDialogs imprimeDialogs = new ImprimeDialogs();
	
	public Controlamenu() {
		boolean controlaWhile=true;

		while(controlaWhile) {
			controlaWhile=menuPrincipal();
		}
	}
	public boolean menuPrincipal() {
		int opcao;
		boolean whileControl=true; 
		
		opcao = imprimeDialogs.apresentaDialogcomInputInteiro("1-Criar Personagem\n2-Excluir Personagem\n3-Sair", "TheGame");
		
		switch(opcao) {
		
		case 1:
			String nomePersonagem;
			nomePersonagem = imprimeDialogs.apresentaDialogcomInputString("Digite o seu nome jogador:","CriandoPersonagem");
			menuCriacaoPersonagem();
			break;
			
		case 2:
			break;
		
		case 3:
			whileControl = false;
			break;
		}
		
		return whileControl;
	}
	public void menuCriacaoPersonagem() {
		int opcao;
		
		opcao = imprimeDialogs.apresentaDialogcomInputInteiro("1-Selecionar Classe\n2-Selecionar Arma\n3-Sair", "CriacaoPersonagem");
		
		switch(opcao) {
		
		case 1:
			
			break;
			
		case 2:
			break;
		
		case 3:
			break;
		}
	}
}