import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.util.Vector;

import static javafx.application.Platform.exit;

public class ActionHandler implements EventHandler<KeyEvent> {
    private Algocraft juego;
    private Superficie supJugador, supMateriales, inventario;
    private EscuchadorEventosJuego escuchadorEventos;
    private Vector dibujoInventario = new Vector();

    public ActionHandler(Algocraft algocraft, EscuchadorEventosJuego escuchador,
                         Superficie jugador, Superficie materiales, Superficie inv) {
        juego = algocraft;
        supJugador = jugador;
        supMateriales = materiales;
        inventario = inv;
        escuchadorEventos = escuchador;
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
                    //animacion golpe
                    if (!material.roto() || !juego.jugador().cargaHerramienta) {
                        juego.jugador().vs(material);
                        escuchadorEventos.golpearHerramienta();
                    } else if(material.roto()){
                        escuchadorEventos.roto();
                        supMateriales.borrarPos(x, y);
                        String str = material.getClass().getName().toLowerCase()+"Material.png";
                        System.out.println(str); //imprime maderaMaterial.png
                        supMateriales.dibujarEnPos(str, x, y);
                    }
                }
            } else {
                escuchadorEventos.errarAtaque();
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
                    actualizarDibujoInventario(juego, supMateriales);
                }
            }
        }
    }
    public void actualizarDibujoInventario(Algocraft juego, Superficie supMateriales){

        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        for (int i = 0; i < materialesAlmacenados.length; i++) {
            String str = "res/";
            str += materialesAlmacenados[i].toLowerCase() + ".png";
            int cantidad = juego.jugador().getInventario().cantidadDeElemento(materialesAlmacenados[i]);
            supMateriales.dibujarAlmacenableEnPos(str, i, (int) (supMateriales.getCanvas().getHeight() / 32) - 1, cantidad);

        }
    }
}
