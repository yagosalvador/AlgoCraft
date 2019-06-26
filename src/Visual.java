//Probar cambiando el root a Group, 

import com.sun.javafx.collections.MappingChange;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.util.Duration;


import static javafx.application.Platform.exit;
import static javafx.scene.input.KeyEvent.ANY;
import static javafx.scene.input.KeyEvent.KEY_PRESSED;
import java.io.File;

public class Visual extends Application {
	//private Group root;
	private Algocraft juego;
	private PlayerView PlayerView;
	private double height = 1088;
	private double width = 768;


	public static void main(String[] args) {
		Algocraft juego = new Algocraft();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Media sound = new Media(new File("res/metal10.wav").toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		Media sound2 = new Media(new File("res/swish_2.wav").toURI().toString());
		MediaPlayer mediaPlayer2 = new MediaPlayer(sound2);
		Algocraft juego = new Algocraft();
		int width = juego.mapa().getTamaño() * 32;
		int height = juego.mapa().getTamaño() * 32;
		Superficie suelo = new Superficie(width, height);
		Superficie materiales = new Superficie(width, height);
		Superficie jugador = new Superficie(width, height);
		Superficie inventario = new Superficie(width, height);

		Group root = new Group(suelo.getCanvas(), materiales.getCanvas(), jugador.getCanvas(), inventario.getCanvas());
		primaryStage.setTitle("AlgoCraft");

		suelo.dibujarSuperficie("res/Pasto.png");

		for (int i = 0, n = 0; i < 20 && n < 11; i++, n++) { //inventario
			inventario.dibujarEnPos("res/recuadro.png", i, 19);
		}
		for (int i = 19, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
			for (int j = 19, n2 = 0; n2 < 3; j--, n2++) {
				inventario.dibujarEnPos("res/recuadro.png", i, j);
			}
		}
		inventario.dibujarEnPos("res/recuadro.png", 16, 19);//boton crear
		inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
		inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
		inventario.getCanvas().getGraphicsContext2D().fillText("Crear", 16 * 32 + 16, 32 * 19 + 16, 28);


		//if (juego.jugador().sacarPrimerHerramienta() != null) {
		inventario.dibujarEnPos("res/64/hachamadera.png", 0, 19);

		inventario.dibujarEnPos("res/64/hachapiedra.png", 1, 19);
		inventario.dibujarEnPos("res/64/hachametal.png", 2, 19);
		inventario.dibujarEnPos("res/picomadera.png", 3, 19);
		inventario.dibujarEnPos("res/picopiedra.png", 4, 19);
		inventario.dibujarEnPos("res/picometal.png", 5, 19);
		inventario.dibujarEnPos("res/picofino.png", 6, 19);
		inventario.dibujarEnPos("res/madera.png", 7, 19);
		inventario.dibujarEnPos("res/metal.png", 8, 19);
		inventario.dibujarEnPos("res/piedra.png", 9, 19);
		inventario.dibujarEnPos("res/diamante.png", 10, 19);


		int x = juego.getPosicionJugadorX();
		int y = juego.getPosicionJugadorX();
		jugador.dibujarEnPos("res/jugadorAbajo.png", x, y);
		primaryStage.show();


		Madera madera = new Madera();
		Metal metal = new Metal();
		Piedra piedra = new Piedra();
		Diamante diamante = new Diamante();

		for (int i = 0; i < juego.mapa().getTamaño(); i++) {
			for (int j = 0; j < juego.mapa().getTamaño(); j++) {
				Celda celda = juego.mapa().celda(i, j);
				if (celda.contenido() != null) {
					if (madera.getClass() == celda.contenido().getClass()) {
						materiales.dibujarEnPos("res/madera.png", i, j);
					}
					if (diamante.getClass() == celda.contenido().getClass()) {
						materiales.dibujarEnPos("res/diamante.png", i, j);
					}
					if (piedra.getClass() == celda.contenido().getClass()) {
						materiales.dibujarEnPos("res/piedra.png", i, j);
					}
					if (metal.getClass() == celda.contenido().getClass()) {
						materiales.dibujarEnPos("res/metal.png", i, j);
					}
				}
			}
		}
		Scene s = new Scene(root, width, height);
		primaryStage.setScene(s);


		s.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.UP) {
					Direccion direccion = new DireccionArriba();
					jugador.borrarPos(juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/jugadorArriba.png", juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
				}
				if (event.getCode() == KeyCode.DOWN) {
					Direccion direccion = new DireccionAbajo();
					jugador.borrarPos(juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/jugadorAbajo.png", juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
				}
				if (event.getCode() == KeyCode.RIGHT) {
					Direccion direccion = new DireccionDerecha();
					jugador.borrarPos(juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/jugadorDer.png", juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
				}
				if (event.getCode() == KeyCode.LEFT) {
					Direccion direccion = new DireccionIzquierda();
					jugador.borrarPos(juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/jugadorIzq.png", juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
				}
				if (event.getCode() == KeyCode.ESCAPE) {
					exit();
				}
				if (event.getCode() == KeyCode.SPACE) {
					Direccion mirandoDireccion = new DireccionAbajo();
					int x = juego.getPosicionJugadorX() + mirandoDireccion.getX();
					int y = juego.getPosicionJugadorY() + mirandoDireccion.getY();
					if (juego.mapa().celda(x, y).ocupada()) {
						Material material = (Material) juego.mapa().celda(x,y).contenido();
						if(material != null) {
							juego.jugador().vs(material);
							System.out.println(material.durabilidad());
							System.out.println(juego.jugador().getHerramientaEquipada()   .durabilidad());
							//animacion golpe
							if (!material.roto()) {
								mediaPlayer.seek(new Duration(0));
								mediaPlayer.play();
							} else {
								mediaPlayer2.seek(new Duration(0));
								mediaPlayer2.play();
								materiales.borrarPos(x,y);
								juego.mapa().celda(x,y).vaciar();
							}
						}
					}
					mediaPlayer2.seek(new Duration(0));
					mediaPlayer2.play();
				}
				if (event.getCode() == KeyCode.G) {
					Direccion mirandoDireccion = new DireccionAbajo();
					int x = juego.getPosicionJugadorX() + mirandoDireccion.getX();
					int y = juego.getPosicionJugadorY() + mirandoDireccion.getY();
					if (juego.mapa().celda(x, y).ocupada() && ((Material)juego.mapa().celda(x,y).contenido()).roto()) {
						//guardar material
						materiales.borrarPos(x,y);
					}
				}
			}

		});
		s.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouse1) {
				int x = (int) (mouse1.getSceneX() / 32);
				int y = (int) (mouse1.getSceneY() / 32);

				if (posicionValidaDeInventario(x, y)) {
					System.out.println("Extraigo item de inventario");
				}
				if (x == 16 && y == 19) {
					System.out.println("Intenta crear");
				}
				x = (int) (mouse1.getSceneX() / 32);
				y = (int) (mouse1.getSceneY() / 32);
				if(posicionValidaDeRecetario(x,y)){
					System.out.println("Intento poner item en mesa");
				}
			}

			public boolean posicionValidaDeInventario(int x, int y) {
				if (y != 19) {
					return false;
				}
				//juego.jugador().capacidadInventario() deberia ser 11
				if (x < 0 || x >= 11) {
					return false;
				}
				return true;
			}


			public boolean posicionValidaDeRecetario(int x, int y) {
				int n = juego.mapa().getTamaño();
				if (y >= n || x >= n) {
					return false;
				}
				if (y < (n - 3) || x < (n - 3)) {
					return false;
				}
				return true;
			}
		});
	}
/*
s.setOnMouseClicked(new EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent mouse2) {
//material = null; //llamar al handler que obtiene material segun las posiciones del inventario
int x = (int) (mouse2.getSceneX() / 32);
int y = (int) (mouse2.getSceneY() / 32);
System.out.println(x);
if (posicionValidaDeRecetario(x, y))
	System.out.println("Hola");
mouse2.consume();
}
});
 */
}