package InterfazGrafica;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Tile implements Dibujable {
    int width=32;
    int height=32;

    @Override
    public void dibujar(Canvas lienzo, String str, int pos_x, int pos_y) {
        GraphicsContext gc = lienzo.getGraphicsContext2D();
        String s = "file:";
        s +=str;
        Image foto = new Image(s);
        int x = width * pos_x;
        int y = height * pos_y;
        gc.drawImage(foto, x, y);
    }
    @Override
    public void borrar(Canvas lienzo, int pos_x, int pos_y){
        GraphicsContext gc = lienzo.getGraphicsContext2D();
        gc.clearRect(pos_x,pos_y,width,height);
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
