import javafx.scene.Node;
import javafx.scene.media.MediaView;


public class SonidoMaterial implements Escuchable{
    private String soundFile;

    public SonidoMaterial(){
        this.soundFile = "roto";
    }

    public void reproducirSonido(){
        Node sonido = new MediaView();
        sonido.fireEvent( new SoundEvent(this.soundFile) );
    }
}

