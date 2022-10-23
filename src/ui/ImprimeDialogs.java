package ui;

import javax.swing.JOptionPane;

public class ImprimeDialogs {

	public int apresentaDialogcomInputInteiro(String msg, String titulo) {
		String OpcaoMenu;
		OpcaoMenu = JOptionPane.showInputDialog(null, msg, titulo, -1);
		return (Integer.parseInt(OpcaoMenu));
	}

	public String apresentaDialogcomInputString(String msg, String titulo) {
		String palavra;
		palavra = JOptionPane.showInputDialog(null, msg, titulo, -1);
		return palavra;
	}

	public void apresentaDialogError(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
	}

	public void apresentaDialogWarning(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.WARNING_MESSAGE);
	}

	public void apresentaDialogInformation(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
}