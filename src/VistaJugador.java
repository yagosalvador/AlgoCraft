import javafx.scene.canvas.Canvas;

public class VistaJugador {
    private Superficie jugador;
    VistaJugador(int x, int y){
        jugador = new Superficie(Visual.width, Visual.height);
        dibujarEnPos("DireccionAbajo", new Posicion(x, y));
    }
    public void dibujarEnPos(String direccion, Posicion pos){
        String str = "res/jugador";
        str += direccion;
        str += ".png";

        jugador.dibujarEnPos(str,pos);
    }
    public void borrarPos(Posicion posicion){
        jugador.borrarPos(posicion);
    }

    public Superficie sup() {
        return jugador;
    }
    public Canvas getCanvas(){
        return jugador.getCanvas();
    }

}
