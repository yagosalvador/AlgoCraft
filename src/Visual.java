import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import static javafx.scene.input.KeyEvent.KEY_PRESSED;


public class Visual extends Application {
	public static int width;
	public static int height;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Instanciar ventana del juego
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		width = ((int) (primaryScreenBounds.getWidth() / 32)) * 32;
		height = ((int) (primaryScreenBounds.getHeight() / 32) - 1) * 32;
		primaryStage.setTitle("AlgoCraft");
		primaryStage.setHeight(height);
		primaryStage.setWidth(width);

		// arrancar juego
		Algocraft juego = new Algocraft(width / 32, (height / 32) - 3);

		//controlador
		Controlador controlador = new Controlador(juego);
		Superficie supInventario = new Superficie(width,height);
		// crear objetos dibujables
		VistaSuelo suelo = new VistaSuelo();
		VistaJugador jugador = new VistaJugador(juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
		VistaInventario inventario = new VistaInventario(juego,supInventario);
		VistaMateriales materiales = new VistaMateriales();

		Group root = new Group(suelo.getCanvas(), materiales.getCanvas(), jugador.getCanvas(), inventario.getCanvas());
		root.autoSizeChildrenProperty();
		suelo.dibujarSuperficie();

		//Eventos posibles
		EscuchadorEventosJuego soundHandler = new SoundHandler();
		DirectionHandler dirHandler = new DirectionHandler(jugador, controlador);
		ActionHandler actionHandler = new ActionHandler(juego, soundHandler, materiales, inventario);
		MouseHandler mouseHandler = new MouseHandler(juego, inventario );
		//dibujar inventario
		inventario.dibujarMesaDeTrabajo();
		inventario.dibujarInventario();

		primaryStage.show();

		Scene s = new Scene(root, width, height);
		primaryStage.setScene(s);

		// cargar materiales
		controlador.cargarMateriales(materiales);

		s.addEventHandler(KEY_PRESSED, dirHandler);
		s.addEventHandler(KEY_PRESSED, actionHandler);
		s.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
	}
}