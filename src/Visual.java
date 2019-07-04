//Probar cambiando el root a Group, 

import com.sun.javafx.collections.MappingChange;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Vector;
import static javafx.application.Platform.exit;
import static javafx.scene.input.KeyEvent.ANY;
import static javafx.scene.input.KeyEvent.KEY_PRESSED;
import java.io.File;
import java.util.Set;


public class Visual extends Application {
	//private Group root;
	private Algocraft juego;


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Instanciar ventana del juego
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		int width = ((int) (primaryScreenBounds.getWidth() / 32)) * 32;
		int height = ((int) (primaryScreenBounds.getHeight() / 32) - 1) * 32;
		primaryStage.setTitle("AlgoCraft");
		primaryStage.setHeight(height);
		primaryStage.setWidth(width);

		//Posicion pos = controlador.obtenerPosJugador();
		//System.out.println(pos.getX()+" "+pos.getY());

		// arrancar juego
		Algocraft juego = new Algocraft(width / 32, (height / 32) - 3);

		//controlador
		Controlador controlador = new Controlador(juego);

		// crear objetos dibujables
		Superficie suelo = new Superficie(width, height);
		Superficie materiales = new Superficie(width, height);
		Superficie jugador = new Superficie(width, height);
		Superficie inventario = new Superficie(width, height);

		Group root = new Group(suelo.getCanvas(), materiales.getCanvas(), jugador.getCanvas(), inventario.getCanvas());
		root.autoSizeChildrenProperty();
		suelo.dibujarSuperficie("res/Pasto.png");

		//dibujar inventario
		//Vector inventarioPos = new Vector();
		dibujarInventario(inventario, juego);
		dibujarMesaDeTrabajo(inventario);

		// dibujar Jugador
		int x = juego.getPosicionJugadorX();
		int y = juego.getPosicionJugadorX();
		jugador.dibujarEnPos("res/jugadorAbajo.png", x, y);
		primaryStage.show();

		Scene s = new Scene(root, width, height);
		primaryStage.setScene(s);

		// cargar materiales
		cargarMateriales(materiales, juego.mapa());

		//Eventos posibles
		EscuchadorEventosJuego soundHandler = new SoundHandler();
		DirectionHandler dirHandler = new DirectionHandler(jugador, controlador);
		ActionHandler actionHandler = new ActionHandler(juego, soundHandler, jugador, materiales, inventario);
		MouseHandler mouseHandler = new MouseHandler(juego, inventario);

		s.addEventHandler(KEY_PRESSED, dirHandler);
		s.addEventHandler(KEY_PRESSED, actionHandler);
		s.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
	}
	private void cargarMateriales(Superficie materiales, Mapa mapa) {

		for (int i = 0; i < mapa.getWidth(); i++) {
			for (int j = 0; j < mapa.getHeight(); j++) {
				String str = "res/";
				Celda celda = mapa.celda(i, j);
				if (celda.contenido() != null) {
					str = str + celda.contenido().getClass().getName() + ".png";
					str = str.toLowerCase();
					materiales.dibujarEnPos(str, i, j);
				}
			}
		}
	}
	private void dibujarInventario(Superficie inventario, Algocraft juego){
		for(int i = 0; i < 11; i++) {
			int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
			inventario.dibujarEnPos("res/cantidades.png",i,j-1);
			inventario.dibujarEnPos("res/recuadro.png", i, j);
		}
		//if(juego.jugador().getInventario().size() != 0) {
			String[] materialesAlmacenados = juego.jugador().getInventario().getElementosAlmacenados();
			for (int i = 0; i < materialesAlmacenados.length; i++) {
				String str = "res/";
				str += materialesAlmacenados[i].toLowerCase() + ".png";
				int j = (int) (inventario.getCanvas().getHeight() / 32) - 1;
				inventario.dibujarEnPos(str, i, j);
				int num = juego.jugador().cantidadDeElemento(materialesAlmacenados[i]);
				inventario.dibujarEnPos("res/cantidades.png",i,j-1);
				inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
				inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
				inventario.getCanvas().getGraphicsContext2D().fillText(String.valueOf(num), i*32 + 16, j*32 - 10, 28);
		//	}
		}
	}

	private void dibujarMesaDeTrabajo(Superficie inventario){
		int i,j,n1,n2;
		for (i = ((int)(inventario.getCanvas().getWidth()/32))-1, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
			for (j = ((int)(inventario.getCanvas().getHeight()/32))-1, n2 = 0; n2 < 3; j--, n2++) {
				inventario.dibujarEnPos("res/recuadro.png", i, j);
			}
		}
		j = ((int)(inventario.getCanvas().getHeight()/32))-1;
		inventario.dibujarEnPos("res/recuadro.png", i, j);//boton crear
		inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
		inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
		inventario.getCanvas().getGraphicsContext2D().fillText("Crear", i*32 +16, j*32+16, 28);
	}

}