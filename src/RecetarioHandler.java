import javafx.geometry.VPos;
import javafx.scene.text.TextAlignment;

public class RecetarioHandler {
    private Algocraft juego;
    private Superficie inventario;

    public RecetarioHandler(Algocraft unJuego, Superficie supInventario){
        juego = unJuego;
        inventario = supInventario;
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
