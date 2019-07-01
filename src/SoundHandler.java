import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.util.Duration;
import java.util.HashMap;
import java.util.Map;
import javafx.event.EventHandler;

public class SoundHandler implements EventHandler<SoundEvent> {
	@Override
	public void handle(SoundEvent event){
		System.out.println("asd");
		System.out.println(event.getFile());

		Media sound = new Media(new File("res/" + event.getFile() +".wav").toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.seek(new Duration(0));
		mediaPlayer.play();
	}
}