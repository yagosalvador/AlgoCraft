import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class Superficie extends Canvas {
    Canvas lienzo;

    public Superficie(int width, int height) {
        lienzo = new Canvas(width, height);
    }

    public void dibujarSuperficie(String str) {
        Tile recuadro = new Tile();

        int width = (int) lienzo.getWidth() / recuadro.getWidth();
        int height = (int) lienzo.getHeight() / recuadro.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                recuadro.dibujar(lienzo, str, i, j);
            }
        }
    }

    public void dibujarEnPos(String str, int pos_x, int pos_y){
        Tile recuadro = new Tile();

        recuadro.dibujar(lienzo,str,pos_x,pos_y);

    }

    public void dibujarEnPosAlApretarBoton(){}

    public Canvas getCanvas(){
        return lienzo;
    }
}
