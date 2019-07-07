import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class DirectionHandler implements EventHandler<KeyEvent> {
    private VistaJugador supJugador;
    private Controlador controlador;

    public DirectionHandler(VistaJugador sup, Controlador controlador) {
        supJugador = sup;
        this.controlador = controlador;
    }

    @java.lang.Override
    public void handle(KeyEvent event) {
        Direccion direccion;
        if (event.getCode() == KeyCode.UP) {
            direccion = new DireccionArriba();
        }
        else if (event.getCode() == KeyCode.DOWN) {
            direccion = new DireccionAbajo();
        }
        else if (event.getCode() == KeyCode.RIGHT) {
            direccion = new DireccionDerecha();
        }
        else if (event.getCode() == KeyCode.LEFT) {
            direccion = new DireccionIzquierda();
        }
        else{
            return;
        }
        dibujarMovimientoJugador(direccion);
    }

    public void dibujarMovimientoJugador(Direccion direccion){
        String str = direccion.getClass().getName();
        Posicion pos = controlador.obtenerPosJugador();
        supJugador.borrarPos(pos);
        controlador.moverJugador(direccion);
        pos = controlador.obtenerPosJugador();
        supJugador.dibujarEnPos(str, pos);
    }
}
