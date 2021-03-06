package Controlador;

import InterfazGrafica.VistaInventario;
import InterfazGrafica.VistaMateriales;
import Modelo.Algocraft;
import Modelo.Material;
import Modelo.Posicion;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import static javafx.application.Platform.exit;

public class ActionHandler implements EventHandler<KeyEvent> {
    private Algocraft juego;
    private VistaMateriales materiales;
    private EscuchadorEventosJuego escuchadorEventos;
    private VistaInventario inventario;

    public ActionHandler(Algocraft algocraft, EscuchadorEventosJuego escuchador,
                         VistaMateriales materiales, VistaInventario inventario) {
        juego = algocraft;
        this.materiales = materiales;
        this.inventario = inventario;
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
                        materiales.borrarPos(posAux);
                        String str = "res/"+material.getClass().getSimpleName().toLowerCase()+"Material.png";
                        materiales.dibujarEnPos(str, posAux);
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
                    materiales.borrarPos(posAux);
                    juego.jugador().almacenarElemento((Material)juego.mapa().celda(posAux).contenido());
                    juego.mapa().celda(posAux).vaciar();
                    String str = ("res/" + material.getClass().getSimpleName() + ".png").toLowerCase();
                    inventario.actualizarDibujo();
                }
            }
        }
    }
}
