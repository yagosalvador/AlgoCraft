import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static javafx.application.Platform.exit;

public class ActionHandler implements EventHandler<KeyEvent> {
    private Algocraft juego;
    private Superficie supJugador, supMateriales;
    private SoundHandler controladorSonidos = new SoundHandler();

    public ActionHandler(Algocraft algocraft, Superficie jugador, Superficie materiales) {
        juego = algocraft;
        supJugador = jugador;
        supMateriales = materiales;
    }

    public void handle(KeyEvent event) {
        if (event.getCode() == KeyCode.ESCAPE) {
            exit();
        }
        if (event.getCode() == KeyCode.SPACE) {
            Direccion mirandoDireccion = new DireccionAbajo();
            int x = juego.getPosicionJugadorX() + mirandoDireccion.getX();
            int y = juego.getPosicionJugadorY() + mirandoDireccion.getY();
            if (juego.mapa().celda(x, y).ocupada() && juego.jugador().cargaHerramienta()) {
                Material material = (Material) juego.mapa().celda(x,y).contenido();
                if(material != null && juego.jugador().cargaHerramienta()) {
                    juego.jugador().vs(material);
                    //animacion golpe
                    if (!material.roto()) {
                        //controladorSonidos.sonidoGolpe();
                    } else {
                        //controladorSonidos.sonidoRoto();
                        supMateriales.borrarPos(x,y);
                        juego.mapa().celda(x,y).vaciar();
                    }
                }
            }
            else {
                //controladorSonidos.sonidoSwish();
            }
        }
        if (event.getCode() == KeyCode.G) {
            Direccion mirandoDireccion = new DireccionAbajo();
            int x = juego.getPosicionJugadorX() + mirandoDireccion.getX();
            int y = juego.getPosicionJugadorY() + mirandoDireccion.getY();
            if (juego.mapa().celda(x, y).ocupada() && ((Material)juego.mapa().celda(x,y).contenido()).roto()) {
                //guardar material
                supMateriales.borrarPos(x,y);
            }
        }
    }

}
