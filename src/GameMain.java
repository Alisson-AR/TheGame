
import control.ControlaMusica;
import control.Controlamenu;
import model.Weapon;
// Nomes: Thiago F. Santos, Anderson L. Almeida, Alisson Rosa

public class GameMain {
	public static void main(String[] args) {

		ControlaMusica Musica = new ControlaMusica(System.getProperty("user.dir")+"\\src\\musicTheme\\MusicaTheGame.wav");

		Controlamenu controlamenu = new Controlamenu();
	}
}
