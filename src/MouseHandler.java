import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextAlignment;

import java.security.InvalidAlgorithmParameterException;

public class MouseHandler implements EventHandler<MouseEvent> {
    private Algocraft juego;
    //private Superficie inventario;
    private String str = null;
    private InventarioHandler inventario;
    private RecetarioHandler recetario;
    public MouseHandler(Algocraft game, InventarioHandler inv, RecetarioHandler recetarioHandler){
        inventario = inv;
        juego = game;
        recetario = recetarioHandler;
    }
    @Override
    public void handle(MouseEvent event) {
        //podria verificarse un doble click o algo asi
        if( event.getButton() == MouseButton.PRIMARY ) {
            int x = (int) (event.getSceneX() / 32);
            int y = (int) (event.getSceneY() / 32);

            if (inventario.posicionValidaDeInventario(x, y)) {
                str = inventario.obtenerImagenDePosInventario(x, y);
            }
            if (inventario.posicionCrear(x, y)) {
                //intenta crear
                juego.jugador().construirHerramienta();
                recetario.redibujarRecetario();
                inventario.actualizarDibujo(/*juego, inventario*/);
            }
            if (recetario.posicionValidaDeRecetario(x, y)) {
                if (str != null) {
                    inventario.dibujarEnPos("res/" + str.toLowerCase() + ".png", new Posicion(x, y));
                    int pos = inventario.convertirCoordenadasAPosicion(x, y);
                    juego.jugador().ubicarMaterialEnMesaDeTrabajo(pos, str);
                }
                str = null;
            }
        }
        if( event.getButton() == MouseButton.SECONDARY ){
            int x = (int) (event.getSceneX() / 32);
            int y = (int) (event.getSceneY() / 32);

            if (inventario.posicionValidaDeInventario(x, y)) {
                str = inventario.obtenerImagenDePosInventario(x, y);
            }

            if (str != null){
                juego.jugador().equiparHerramienta(str);
            }
        }
    }







}
