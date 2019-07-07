package InterfazGrafica;

import Modelo.Material;
import Modelo.Posicion;
import javafx.scene.canvas.Canvas;

public class VistaMateriales {
    private Superficie materiales;
    VistaMateriales(){
        materiales = new Superficie(Visual.width, Visual.height);
    }

    public void dibujarMaterial(Posicion posicion, Material material){
        String str = "res/" + material.getClass().getSimpleName() + ".png";
        str = str.toLowerCase();
        materiales.dibujarEnPos(str, posicion);
    }

    public void borrarPos(Posicion posicion){
        materiales.borrarPos(posicion);
    }
    public void dibujarEnPos(String str, Posicion posicion){
        materiales.dibujarEnPos(str, posicion);
    }
    public Superficie sup() {
        return materiales;
    }
    public Canvas getCanvas(){
        return materiales.getCanvas();
    }

}
