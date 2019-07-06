import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import static javafx.application.Platform.exit;

public class ActionHandler implements EventHandler<KeyEvent> {
    private Algocraft juego;
    private Superficie supMateriales;
    private EscuchadorEventosJuego escuchadorEventos;
    private InventarioHandler inventario;

    public ActionHandler(Algocraft algocraft, EscuchadorEventosJuego escuchador,
                         Superficie materiales, InventarioHandler inventarioHandler) {
        juego = algocraft;
        supMateriales = materiales;
        inventario = inventarioHandler;
        escuchadorEventos = escuchador;
    }

    public void handle(KeyEvent event) {
        if (event.getCode() == KeyCode.ESCAPE) {
            exit();
        }
        if (event.getCode() == KeyCode.SPACE) {
            Posicion posAux = juego.getPosicionMirada();
            if (juego.mapa().celda(posAux).ocupada()) {
                Material material = (Material) juego.mapa().celda(posAux).contenido();
                if (material != null) {
                    //animacion golpe
                    if (!material.roto()) {
                        juego.jugador().vs(material);
                        escuchadorEventos.golpearHerramienta();
                        if(!juego.jugador().cargaHerramienta){
                            inventario.actualizarDibujo();
                        }
                    } else {
                        escuchadorEventos.roto();
                        supMateriales.borrarPos(posAux);
                        String str = "res/"+material.getClass().getName().toLowerCase()+"Material.png";
                        supMateriales.dibujarEnPos(str, posAux);
                    }
                }
            } else {
                escuchadorEventos.errarAtaque();
            }
        }
        if (event.getCode() == KeyCode.G) {
            Posicion posAux = juego.getPosicionMirada();
            if (juego.mapa().celda(posAux).ocupada()) {
                Material material = (Material) juego.mapa().celda(posAux).contenido();
                if (material.roto()) {
                    //guardar material
                    supMateriales.borrarPos(posAux);
                    juego.jugador().almacenarElemento((Material)juego.mapa().celda(posAux).contenido());
                    juego.mapa().celda(posAux).vaciar();
                    String str = ("res/" + material.getClass().getName() + ".png").toLowerCase();
                    inventario.actualizarDibujo();
                }
            }
        }
    }
}
