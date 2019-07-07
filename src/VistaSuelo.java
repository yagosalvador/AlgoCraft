import javafx.scene.canvas.Canvas;

public class VistaSuelo {
    private Superficie suelo;
    VistaSuelo(){
        suelo = new Superficie(Visual.width, Visual.height);
    }

    public void dibujarSuperficie(){
        suelo.dibujarSuperficie("res/Pasto.png");
    }
    public Superficie sup() {
        return suelo;
    }
    public Canvas getCanvas(){
        return suelo.getCanvas();
    }

}
