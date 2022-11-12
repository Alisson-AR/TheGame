package control;

import java.io.File;
import javax.sound.sampled.*;

public class ControlaMusica {
    String PathMusica = "Null";
    Clip MusicaGame;

    public ControlaMusica(String caminhoMusicaString) {
        PathMusica = caminhoMusicaString;
        IniciaMusica();
    }

    void IniciaMusica() { 
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(PathMusica).getAbsoluteFile());
            MusicaGame = AudioSystem.getClip();
            MusicaGame.open(audioInputStream);  
            
            FloatControl gainControl = (FloatControl) MusicaGame.getControl(FloatControl.Type.MASTER_GAIN);
            double gain = 0.03;   
            float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
            gainControl.setValue(dB);
            
            MusicaGame.start();
            MusicaGame.loop(Clip.LOOP_CONTINUOUSLY); 
            
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }
    void StopMusica(){
        MusicaGame.stop();
        MusicaGame.close();
    }
}
