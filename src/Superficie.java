import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.text.TextAlignment;

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

    public void dibujarEnPos(String str, Posicion posicion){
        Tile recuadro = new Tile();
        int pos_x = posicion.getX();
        int pos_y = posicion.getY();
        recuadro.borrar(lienzo,pos_x,pos_y);
        recuadro.dibujar(lienzo,str,pos_x,pos_y);

    }

    public void borrarPos(Posicion posicion){
        int pos_x = posicion.getX();
        int pos_y = posicion.getY();
        GraphicsContext gc = lienzo.getGraphicsContext2D();
        gc.clearRect(pos_x*32,pos_y*32,32,32);
    }

    //public void dibujarEnPosAlApretarBoton(){}

    public Canvas getCanvas(){
        return lienzo;
    }
}
