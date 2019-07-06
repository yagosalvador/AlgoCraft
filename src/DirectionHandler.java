import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static javafx.application.Platform.exit;

public class DirectionHandler implements EventHandler<KeyEvent> {
    private Superficie supJugador;
    //private Algocraft juego;
    private Controlador controlador;
    //SONIDOS
    SoundHandler controladorSonidos = new SoundHandler();

    public DirectionHandler(Superficie sup, Controlador contr) {
        supJugador = sup;
        //juego = algocraft;
        controlador = contr;
    }

    @java.lang.Override
    public void handle(KeyEvent event) {
        Direccion direccion = new DireccionNula();
        if (event.getCode() == KeyCode.UP) {
            direccion = new DireccionArriba();
        }
        if (event.getCode() == KeyCode.DOWN) {
            direccion = new DireccionAbajo();
        }
        if (event.getCode() == KeyCode.RIGHT) {
            direccion = new DireccionDerecha();
        }
        if (event.getCode() == KeyCode.LEFT) {
            direccion = new DireccionIzquierda();
        }
        dibujarMovimientoJugador(direccion);
    }

    public void dibujarMovimientoJugador(Direccion direccion){
        String str = "res/jugador";
        str += direccion.getClass().getName();
        str += ".png";
        if(direccion.getClass().getName() != "DireccionNula") {
            Posicion pos = controlador.obtenerPosJugador();
            supJugador.borrarPos(pos);
            controlador.moverJugador(direccion);
            pos = controlador.obtenerPosJugador();
            supJugador.dibujarEnPos(str, pos);
        }
    }
}
