import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.text.TextAlignment;
import javafx.scene.canvas.Canvas;

public class InventarioHandler {
    private Algocraft juego;
    private Superficie inventario;

    public InventarioHandler(Algocraft unJuego, Superficie supInventario){
        juego = unJuego;
        inventario = supInventario;
    }


    public void dibujarEnPos(String str, Posicion posicion){
        inventario.dibujarEnPos(str, posicion);
    }

    public Canvas getCanvas(){
        return inventario.getCanvas();
    }
    public void actualizarDibujo() {
        for (int j = 0; j < 11; j++) {
            inventario.borrarPos(new Posicion(j, (int) (inventario.getCanvas().getHeight() / 32) - 1));
        }
        for (int i = 0; i < 11; i++) {
            inventario.dibujarEnPos("res/recuadro.png", new Posicion(i, (int) (inventario.getCanvas().getHeight() / 32) - 1));
        }

        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        for (int i = 0; i < materialesAlmacenados.length; i++) {
            int cantidad = juego.jugador().getInventario().cantidadDeElemento(materialesAlmacenados[i]);
            if (cantidad == 0) {
                inventario.borrarPos(new Posicion(i, (int) (inventario.getCanvas().getHeight() / 32) - 1));
                inventario.dibujarEnPos("res/recuadro.png", new Posicion(i, (int) (inventario.getCanvas().getHeight() / 32) - 1));
            }

            String str = "res/";
            str += materialesAlmacenados[i].toLowerCase() + ".png";
            //System.out.println(str);
            int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
            inventario.dibujarEnPos(str, new Posicion(i, j));
            int num = juego.jugador().cantidadDeElemento(materialesAlmacenados[i]);
            inventario.dibujarEnPos("res/cantidades.png", new Posicion(i, j - 1));
            inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
            inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
            inventario.getCanvas().getGraphicsContext2D().fillText(String.valueOf(num), i * 32 + 16, j * 32 - 10, 28);
        }
    }

    public void dibujarInventario(){
        for(int i = 0; i < 11; i++) {
            int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
            inventario.dibujarEnPos("res/cantidades.png",new Posicion(i,j-1));
            inventario.dibujarEnPos("res/recuadro.png", new Posicion(i, j));
        }
        //if(juego.jugador().getInventario().size() != 0) {
        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        for (int i = 0; i < materialesAlmacenados.length; i++) {
            String str = "res/";
            str += materialesAlmacenados[i].toLowerCase() + ".png";
            int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
            inventario.dibujarEnPos(str, new Posicion(i, j));
            int num = juego.jugador().cantidadDeElemento(materialesAlmacenados[i]);
            inventario.dibujarEnPos("res/cantidades.png",new Posicion(i,j-1));
            inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
            inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
            inventario.getCanvas().getGraphicsContext2D().fillText(String.valueOf(num), i*32 + 16, j*32 - 10, 28);
            //	}
        }
    }

    public int convertirCoordenadasAPosicion(int x, int y){
        int height = ((int)(inventario.getCanvas().getHeight()/32)) - 3;
        int width = ((int)(inventario.getCanvas().getWidth()/32)) - 3;

        int pos = (x - width) + (3*(y - height));
        return pos;

    }

    public String obtenerImagenDePosInventario(int x, int y){
        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        if(x < materialesAlmacenados.length){
            if(juego.jugador().cantidadDeElemento(materialesAlmacenados[x]) > 0) {
                return materialesAlmacenados[x];
            }
        }
        return null;
    }

    public boolean posicionCrear(int x, int y){
        int height = ((int)(inventario.getCanvas().getHeight()/32)) - 1;
        int width = ((int)(inventario.getCanvas().getWidth()/32)) - 4;

        if((x == width) && (y == height)) {
            return true;
        }
        return false;
    }
    public boolean posicionValidaDeInventario(int x, int y){

        if (y != (((int)(inventario.getCanvas().getHeight()/32)) - 1)) {
            return false;
        }
        if (x < 0 || x >= 11) {
            return false;
        }
        return true;
    }
}
