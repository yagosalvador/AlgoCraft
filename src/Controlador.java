import javafx.scene.control.Control;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controlador {
    private Algocraft juego;
    //private Stage stage;

    public Controlador(Algocraft algocraft) {
        juego = algocraft;
        //stage = st;
    }

    public Posicion obtenerPosJugador(){
        return new Posicion(juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
    }

    public void moverJugador(Direccion dir){
        juego.avanzarJugador(dir);
    }

    /*void String obtenerMaterialDePantalla(){
        stage.getScene().addEventHandler(MouseEvent, );
        public boolean posicionValidaDeInventario(int x, int y) {
            if (y != 19) {
                return false;
            }
            //juego.jugador().capacidadInventario() deberia ser 11
            if (x < 0 || x >= 11) {
                return false;
            }
            return true;
        }


        public boolean posicionValidaDeRecetario(int x, int y) {
            int width = juego.mapa().getWidth();
            int height = juego.mapa().getHeight();
            if (y >= height || x >= width) {
                return false;
            }
            if (y < (height - 3) || x < (width - 3)) {
                return false;
            }
            return true;
        }
    });
    }
*/
}
