
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TocarSom {
    
    String nome;
    Clip clip;
    public TocarSom(String caminho){
        this.nome = caminho;
    }
    
    public void tocarSom() {
        java.net.URL urlAudio = getClass().getResource((nome));
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(urlAudio);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }
        catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
        clip.start();
        clip.loop(0);
    }
    public void pararSom(){
        clip.stop();
    }
}
