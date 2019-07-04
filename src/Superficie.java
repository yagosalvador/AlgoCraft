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

    public void dibujarEnPos(String str, int pos_x, int pos_y){
        Tile recuadro = new Tile();

        recuadro.dibujar(lienzo,str,pos_x,pos_y);

    }

    public void dibujarAlmacenableEnPos(String str, int pos_x, int pos_y,int cantidad){
        Tile recuadro = new Tile();
        borrarPos(pos_x, pos_y);
//        lienzo.getGraphicsContext2D().strokeText(String.valueOf(cantidad),pos_x,pos_y);
        this.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
        this.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
        this.getCanvas().getGraphicsContext2D().fillText(String.valueOf(cantidad), pos_x*32 +16, pos_y*32+16, 28);
        recuadro.dibujar(lienzo,str,pos_x,pos_y);

    }

    public void borrarPos(int pos_x, int pos_y){
        GraphicsContext gc = lienzo.getGraphicsContext2D();
        gc.clearRect(pos_x*32,pos_y*32,32,32);
    }

    //public void dibujarEnPosAlApretarBoton(){}

    public Canvas getCanvas(){
        return lienzo;
    }
}
