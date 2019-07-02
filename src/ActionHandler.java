import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.util.Vector;

import static javafx.application.Platform.exit;

public class ActionHandler implements EventHandler<KeyEvent> {
    private Algocraft juego;
    private Superficie supJugador, supMateriales, inventario;
    private SoundHandler controladorSonidos = new SoundHandler();
    private Vector dibujoInventario = new Vector();

    public ActionHandler(Algocraft algocraft, Superficie jugador, Superficie materiales, Superficie inv) {
        juego = algocraft;
        supJugador = jugador;
        supMateriales = materiales;
        inventario = inv;
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
                Material material = (Material) juego.mapa().celda(x, y).contenido();
                if (material != null && juego.jugador().cargaHerramienta()) {
                    juego.jugador().vs(material);
                    //animacion golpe
                    if (!material.roto() || !juego.jugador().cargaHerramienta) {
                        //controladorSonidos.sonidoGolpe();
                    } else {
                        //controladorSonidos.sonidoRoto();
                        supMateriales.borrarPos(x, y);
                    }
                }
            } else {
                //controladorSonidos.sonidoSwish();
            }
        }
        if (event.getCode() == KeyCode.G) {
            Direccion mirandoDireccion = new DireccionAbajo();
            int x = juego.getPosicionJugadorX() + mirandoDireccion.getX();
            int y = juego.getPosicionJugadorY() + mirandoDireccion.getY();
            if (juego.mapa().celda(x, y).ocupada()) {
                Material material = (Material) juego.mapa().celda(x, y).contenido();
                if (material.roto()) {
                    //guardar material
                    supMateriales.borrarPos(x, y);
                    juego.jugador().almacenarElemento((Material) juego.mapa().celda(x, y).contenido());
                    juego.mapa().celda(x, y).vaciar();
                    dibujoInventario.add(material.getClass().getName());
                    String str = ("res/" + material.getClass().getName() + ".png").toLowerCase();
                    actualizarDibujoInventario(juego, inventario);
                }
            }
        }
    }
    public void actualizarDibujoInventario(Algocraft juego, Superficie inventario){
        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        for (int i = 0; i < materialesAlmacenados.length; i++) {
            String str = "res/";
            str += materialesAlmacenados[i].toLowerCase() + ".png";
            //System.out.println(str);
            inventario.dibujarEnPos(str, i, (int) (inventario.getCanvas().getHeight() / 32) - 1);
        }
    }
}
