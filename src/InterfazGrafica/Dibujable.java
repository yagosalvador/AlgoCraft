package InterfazGrafica;

import javafx.scene.canvas.Canvas;

public interface Dibujable{
    void dibujar(Canvas lienzo, String str, int pos_x, int pos_y);
    void borrar(Canvas lienzo, int pos_x, int pos_y);
}
