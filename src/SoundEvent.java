import javafx.event.Event;
import javafx.event.EventType;

public class SoundEvent extends Event{
    public static final EventType<SoundEvent> EVENTO_SONIDO = new EventType<>(Event.ANY, "EVENTO_SONIDO");
    String file;

    public SoundEvent(String fileName){

        super(EVENTO_SONIDO);
        this.file = fileName;
    }
    public String getFile(){
        return this.file;
    }
}

