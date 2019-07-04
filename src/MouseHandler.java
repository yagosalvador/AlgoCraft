import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextAlignment;

public class MouseHandler implements EventHandler<MouseEvent> {
    private Algocraft juego;
    private Superficie inventario;
    private String str = null;

    public MouseHandler(Algocraft game, Superficie inv){
        inventario = inv;
        juego = game;
    }
    @Override
    public void handle(MouseEvent event) {
        //podria verificarse un doble click o algo asi
        if( event.getButton() == MouseButton.PRIMARY ) {
            int x = (int) (event.getSceneX() / 32);
            int y = (int) (event.getSceneY() / 32);

            if (posicionValidaDeInventario(x, y)) {
                str = obtenerImagenDePosInventario(x, y);
            }

            if (posicionCrear(x, y)) {
                //intenta crear
                juego.jugador().construirHerramienta();
                redibujarRecetario();
                actualizarDibujoInventario(/*juego, inventario*/);
            }
            if (posicionValidaDeRecetario(x, y)) {
                if (str != null) {
                    inventario.dibujarEnPos("res/" + str.toLowerCase() + ".png", x, y);
                    int pos = convertirCoordenadasAPosicion(x, y);
                    juego.jugador().ubicarMaterialEnMesaDeTrabajo(pos, str);
                }
                str = null;
            }
        }
        if( event.getButton() == MouseButton.SECONDARY ){
            int x = (int) (event.getSceneX() / 32);
            int y = (int) (event.getSceneY() / 32);

            if (posicionValidaDeInventario(x, y)) {
                str = obtenerImagenDePosInventario(x, y);
            }

            if (str != null){
                juego.jugador().equiparHerramienta(str);
            }
        }
    }



    public int convertirCoordenadasAPosicion(int x, int y){
        int height = ((int)(inventario.getCanvas().getHeight()/32)) - 3;
        int width = ((int)(inventario.getCanvas().getWidth()/32)) - 3;

        int pos = (x - width) + (3*(y - height));
        return pos;

    }

    public boolean posicionValidaDeInventario(int x, int y){

        if (y != (((int)(inventario.getCanvas().getHeight()/32)) - 1)) {
            return false;
        }
        //juego.jugador().capacidadInventario() deberia ser 11
        if (x < 0 || x >= 11) {
            return false;
        }
        return true;
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

    public String obtenerImagenDePosInventario(int x, int y){
        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        if(x < materialesAlmacenados.length){
            if(juego.jugador().cantidadDeElemento(materialesAlmacenados[x]) > 0) {
                return materialesAlmacenados[x];
            }
        }
        return null;
    }
    public void actualizarDibujoInventario(/*Algocraft juego, Superficie inventario*/){
        /*for(int i = 0; i < 11; i++) {
            inventario.borrarPos(i, (int)(inventario.getCanvas().getHeight()/32)-1);
        }
        for(int i = 0; i < 11; i++) {
            int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
            inventario.dibujarEnPos("res/cantidades.png",i,j-1);
            inventario.dibujarEnPos("res/recuadro.png", i, j);
        }
        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        for (int i = 0; i < materialesAlmacenados.length; i++) {
            String str = "res/";
            str += materialesAlmacenados[i].toLowerCase() + ".png";
            //System.out.println(str);
            int num = juego.jugador().cantidadDeElemento(materialesAlmacenados[i]);
            int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
            inventario.dibujarEnPos("res/cantidades.png",i,j-1);
            inventario.dibujarEnPos(str, i, j);
            inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
            inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
            inventario.getCanvas().getGraphicsContext2D().fillText(String.valueOf(num), i*32+16, j*32-10, 28);
        }*/
        for(int j = 0; j < 11; j++) {
            inventario.borrarPos(j, (int)(inventario.getCanvas().getHeight()/32)-1);
        }
        for(int i = 0; i < 11; i++) {
            inventario.dibujarEnPos("res/recuadro.png", i, (int)(inventario.getCanvas().getHeight()/32)-1);
        }

        String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
        for (int i = 0; i < materialesAlmacenados.length; i++) {
            int cantidad = juego.jugador().getInventario().cantidadDeElemento(materialesAlmacenados[i]);
            if(cantidad == 0 ){
                inventario.borrarPos(i,(int) (inventario.getCanvas().getHeight() / 32) - 1);
                inventario.dibujarEnPos("res/recuadro.png", i, (int)(inventario.getCanvas().getHeight()/32)-1);
            }

            String str = "res/";
            str += materialesAlmacenados[i].toLowerCase() + ".png";
            //System.out.println(str);
            int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
            inventario.dibujarEnPos(str, i, j);
            int num = juego.jugador().cantidadDeElemento(materialesAlmacenados[i]);
            inventario.dibujarEnPos("res/cantidades.png",i,j-1);
            inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
            inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
            inventario.getCanvas().getGraphicsContext2D().fillText(String.valueOf(num), i*32 + 16, j*32 - 10, 28);
        }
    }

    public void redibujarRecetario(){
        int i,j,n1,n2;
        for (i = ((int)(inventario.getCanvas().getWidth()/32))-1, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
            for (j = ((int)(inventario.getCanvas().getHeight()/32))-1, n2 = 0; n2 < 3; j--, n2++) {
                inventario.dibujarEnPos("res/recuadro.png", i, j);
            }
        }
    }

    public boolean posicionCrear(int x, int y){
        int height = ((int)(inventario.getCanvas().getHeight()/32)) - 1;
        int width = ((int)(inventario.getCanvas().getWidth()/32)) - 4;

        if((x == width) && (y == height)) {
            return true;
        }
        return false;
    }
}
