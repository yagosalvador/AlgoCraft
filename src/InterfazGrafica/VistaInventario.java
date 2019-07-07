package InterfazGrafica;

import Modelo.Algocraft;
import Modelo.Posicion;
import javafx.geometry.VPos;
import javafx.scene.text.TextAlignment;
import javafx.scene.canvas.Canvas;

public class VistaInventario {
    private Algocraft juego;
    private Superficie inventario;

    public VistaInventario(Algocraft unJuego, Superficie inventario){
        juego = unJuego;
        this.inventario = inventario;
    }
    public Superficie sup() {
        return inventario;
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

    public void dibujarMesaDeTrabajo(){
        int i,j,n1,n2;
        for (i = ((int)(inventario.getCanvas().getWidth()/32))-1, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
            for (j = ((int)(inventario.getCanvas().getHeight()/32))-1, n2 = 0; n2 < 3; j--, n2++) {
                inventario.dibujarEnPos("res/recuadro.png", new Posicion(i, j));
            }
        }
        j = ((int)(inventario.getCanvas().getHeight()/32))-1;
        inventario.dibujarEnPos("res/recuadro.png", new Posicion(i, j));//boton crear
        inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
        inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
        inventario.getCanvas().getGraphicsContext2D().fillText("Crear", i*32 +16, j*32+16, 28);
    }

    public boolean posicionValidaDeRecetario(int x, int y){
        int height = ((int)(inventario.getCanvas().getHeight()/32)) - 1;
        int width = ((int)(inventario.getCanvas().getWidth()/32)) - 1;

        if (y > height || x > width) {
            return false;
        }
        if (y < (height - 2) || x < (width - 2)) {
            return false;
        }
        return true;
    }

    public void redibujarRecetario(){
        int i,j,n1,n2;
        for (i = ((int)(inventario.getCanvas().getWidth()/32))-1, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
            for (j = ((int)(inventario.getCanvas().getHeight()/32))-1, n2 = 0; n2 < 3; j--, n2++) {
                inventario.dibujarEnPos("res/recuadro.png", new Posicion(i, j));
            }
        }
    }
}
