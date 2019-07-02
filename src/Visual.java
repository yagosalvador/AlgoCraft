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
		//controlador.dibujarInventario(suelo,inventario,inventarioPos,width,height);

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
		DirectionHandler dirHandler = new DirectionHandler(jugador, controlador);
		ActionHandler actionHandler = new ActionHandler(juego, jugador, materiales, inventario);
		//MouseHandler mouseHandler = new MouseHandler();

		s.addEventHandler(KEY_PRESSED, dirHandler);
		s.addEventHandler(KEY_PRESSED, actionHandler);
		//s.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
	}
	private void cargarMateriales(Superficie materiales, Mapa mapa) {
		String str = "res/";

		for (int i = 0; i < mapa.getWidth(); i++) {
			for (int j = 0; j < mapa.getHeight(); j++) {
				str = "res/";
				Celda celda = mapa.celda(i, j);
				if (celda.contenido() != null) {
					str = str + celda.contenido().getClass().getName() + ".png";
					str = str.toLowerCase();
					materiales.dibujarEnPos(str, i, j);
				}
			}
		}
	}

}