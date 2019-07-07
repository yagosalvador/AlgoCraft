import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class MouseHandler implements EventHandler<MouseEvent> {
    private Algocraft juego;
    private String str = null;
    private VistaInventario inventario;
    public MouseHandler(Algocraft juego, VistaInventario inv){
        inventario = inv;
        this.juego = juego;
    }
    @Override
    public void handle(MouseEvent event) {
        if( event.getButton() == MouseButton.PRIMARY ) {
            int x = (int) (event.getSceneX() / 32);
            int y = (int) (event.getSceneY() / 32);

            if (inventario.posicionValidaDeInventario(x, y)) {
                str = inventario.obtenerImagenDePosInventario(x, y);
            }
            if (inventario.posicionCrear(x, y)) {
                //intenta crear
                juego.jugador().construirHerramienta();
                inventario.actualizarDibujo();
                inventario.redibujarRecetario();
            }
            if (inventario.posicionValidaDeRecetario(x, y)) {
                if (str != null) {
                    inventario.dibujarEnPos("res/" + str.toLowerCase() + ".png", new Posicion(x, y));
                    int pos = inventario.convertirCoordenadasAPosicion(x, y);
                    juego.jugador().ubicarMaterialEnMesaDeTrabajo(pos, str);
                    inventario.actualizarDibujo();
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
