import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.media.MediaView;
public class SonidoHerramienta implements Escuchable{
    private String soundFile;

    public SonidoHerramienta(){
        this.soundFile = "metal10";

    }

    public void reproducirSonido(){
        Node sonido = new MediaView();
        sonido.fireEvent( new SoundEvent(this.soundFile) );
        sonido.fireEvent( new SoundEvent(this.soundFile) );
    }
}