package ui;

import javax.swing.JOptionPane;

public class ImprimeDialogs{
	
	public int apresentaDialogcomInputInteiro(String msg, String titulo) {
		String OpcaoMenu;
		OpcaoMenu = JOptionPane.showInputDialog(null,msg,titulo,-1);
		return (Integer.parseInt(OpcaoMenu));
	}
	
	public String apresentaDialogcomInputString(String msg, String titulo) {
		String palavra;
		palavra = JOptionPane.showInputDialog(null,msg,titulo,-1);
		return palavra;
	}
}