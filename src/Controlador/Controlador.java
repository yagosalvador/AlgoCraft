package Controlador;

import InterfazGrafica.VistaMateriales;
import Modelo.*;

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

    public void cargarMateriales(VistaMateriales materiales) {
        Posicion posicion = new Posicion(0,0);
        Mapa mapa = juego.mapa();

        for (int i = 0; i < mapa.getWidth(); i++) {
            for (int j = 0; j < mapa.getHeight(); j++) {
                posicion.actualizar(i,j);
                Celda celda = mapa.celda(posicion);
                if (celda.contenido() != null && celda.contenido() instanceof Material) {
                    materiales.dibujarMaterial(posicion, (Material) celda.contenido());
                }
            }
        }
    }
}
