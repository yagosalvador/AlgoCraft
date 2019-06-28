// esta es la clase que controla los eventos
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.util.Duration;



public class SoundHandler{
	private	Media sound = new Media(new File("res/metal10.wav").toURI().toString());
	private	MediaPlayer mediaPlayer = new MediaPlayer(sound);
	private	Media sound2 = new Media(new File("res/swish_2.wav").toURI().toString());
	private	MediaPlayer mediaPlayer2 = new MediaPlayer(sound2);
	private	Media sound3 = new Media(new File("res/roto.mp3").toURI().toString());
	private	MediaPlayer mediaPlayer3 = new MediaPlayer(sound3);

	public void sonidoRoto(){
		mediaPlayer3.seek(new Duration(0));
		mediaPlayer3.play();
	}
	public void sonidoGolpe(){
		mediaPlayer.seek(new Duration(0));
		mediaPlayer.play();
	}
	public void sonidoSwish(){
		mediaPlayer2.seek(new Duration(0));
		mediaPlayer2.play();
	}

}