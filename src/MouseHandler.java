import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MouseHandler implements EventHandler<MouseEvent> {
    @Override
    public void handle(MouseEvent mouse1) {
        //podria verificarse un doble click o algo asi
        /*int x = (int) (mouse1.getSceneX() / 32);
        int y = (int) (mouse1.getSceneY() / 32);

        if (posicionValidaDeInventario(x, y)) {
            if (juego.jugador().getInventario().cantidadDeElemento(inventarioPos.get(x).toString()) > 0) {
                Almacenable item = juego.jugador().getInventario().sacarElemento(inventarioPos.get(x).toString());
                //System.out.println("Agarre: " + item.getClass().toString());
                inventario.dibujarEnPos("res/piedra.png", 0, 0);
            }
        }
        if (x == 16 && y == 19) {
            System.out.println("Intenta crear");
            for (int i = 19, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
                for (int j = 19, n2 = 0; n2 < 3; j--, n2++) {
                    inventario.borrarPos(i, j);
                    inventario.dibujarEnPos("res/recuadro.png", i, j);
                }
            }
            //pone en inventario
        }
        x = (int) (mouse1.getSceneX() / 32);
        y = (int) (mouse1.getSceneY() / 32);
        if (posicionValidaDeRecetario(x, y)) {
            inventario.dibujarEnPos("res/piedra.png", x, y);
        }*/
    }
}
