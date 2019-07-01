//Probar cambiando el root a Group, 

import com.sun.javafx.collections.MappingChange;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
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
import java.util.logging.Handler;

public class Visual extends Application {
	//private Group root;
	private Algocraft juego;
	private PlayerView PlayerView;
	private SoundHandler soundPlayer;

	public static void main(String[] args) {
		Algocraft juego = new Algocraft();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		// Instanciar ventana del juego
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		int width = ((int)(primaryScreenBounds.getWidth()/32))*32;
		int height = ((int) (primaryScreenBounds.getHeight()/32)-1)*32;
		primaryStage.setTitle("AlgoCraft");
		primaryStage.setHeight(height);
		primaryStage.setWidth(width);

		// arrancar juego
		Algocraft juego = new Algocraft(width/32,(height/32)-3);

		// crear objetos dibujables
		Superficie suelo = new Superficie(width, height);
		Superficie materiales = new Superficie(width, height);
		Superficie jugador = new Superficie(width, height);
		Superficie inventario = new Superficie(width, height);

		Group root = new Group(suelo.getCanvas(), materiales.getCanvas(), jugador.getCanvas(), inventario.getCanvas());

		suelo.dibujarSuperficie("res/Pasto.png");
		

		//dibujar inventario
		Vector inventarioPos = new Vector();
		dibujarInventario(suelo,inventario,inventarioPos,width,height);

		// dibujar Jugador
		int x = juego.getPosicionJugadorX();
		int y = juego.getPosicionJugadorX();
		jugador.dibujarEnPos("res/jugadorAbajo.png", x, y);
		primaryStage.show();

		// cargar materiales
		cargarMateriales(materiales, juego);
/*
			Madera madera = new Madera();
			Metal metal = new Metal();
			Piedra piedra = new Piedra();
			Diamante diamante = new Diamante();

			for (int i = 0; i < juego.mapa().getWidth(); i++) {
				for (int j = 0; j < juego.mapa().getHeight(); j++) {
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
		*/




		Scene s = new Scene(root, width, height);
		primaryStage.setScene(s);



		root.addEventFilter( SoundEvent.EVENTO_SONIDO,	new SoundHandler());

		root.addEventHandler( SoundEvent.EVENTO_SONIDO, new SoundHandler());

		//Eventos posibles
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
					if (juego.mapa().celda(x, y).ocupada() && juego.jugador().cargaHerramienta()) {
						Material material = (Material) juego.mapa().celda(x,y).contenido();
						if(material != null && juego.jugador().cargaHerramienta()) {
							juego.jugador().vs(material);
							//animacion golpe
							if (!material.roto()) {
								//controladorSonidos.sonidoGolpe();
							} else {
								//controladorSonidos.sonidoRoto();
								materiales.borrarPos(x,y);
								juego.mapa().celda(x,y).vaciar();
							}
						}
					}
					else {
						//controladorSonidos.sonidoSwish();
					}
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
				//podria verificarse un doble click o algo asi
				int x = (int) (mouse1.getSceneX() / 32);
				int y = (int) (mouse1.getSceneY() / 32);

				if (posicionValidaDeInventario(x, y)) {
					if(juego.jugador().getInventario().cantidadDeElemento(inventarioPos.get(x).toString()) > 0) {
						Almacenable item = juego.jugador().getInventario().sacarElemento(inventarioPos.get(x).toString());
						//System.out.println("Agarre: " + item.getClass().toString());
						inventario.dibujarEnPos("res/piedra.png", 0,0);
					}
				}
				if (x == 16 && y == 19) {
					System.out.println("Intenta crear");
					for (int i = 19, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
						for (int j = 19, n2 = 0; n2 < 3; j--, n2++) {
							inventario.borrarPos(i,j);
							inventario.dibujarEnPos("res/recuadro.png", i, j);
						}
					}
					//pone en inventario
				}
				x = (int) (mouse1.getSceneX() / 32);
				y = (int) (mouse1.getSceneY() / 32);
				if(posicionValidaDeRecetario(x,y)){
					inventario.dibujarEnPos("res/piedra.png",x,y);
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
				int width = juego.mapa().getWidth();
				int height = juego.mapa().getHeight();
				if (y >= height || x >= width) {
					return false;
				}
				if (y < (height - 3) || x < (width - 3)) {
					return false;
				}
				return true;
			}
		});
	}

	private void dibujarInventario(Superficie suelo, Superficie inventario, Vector inventarioPos, int width, int height) {
		inventarioPos.add("class Piedra");
		inventarioPos.add("class Madera");
		inventarioPos.add("class Metal");
		inventarioPos.add("class Diamante");
		inventarioPos.add("class HachaDePiedra");
		inventarioPos.add("class HachaDeMadera");
		inventarioPos.add("class HachaDeMetal");
		inventarioPos.add("class PicoDeMadera");
		inventarioPos.add("class PicoDeMetal");
		inventarioPos.add("class PicoDePiedra");
		inventarioPos.add("class PicoFino");

		for (int i = 0, n = 0; i < (width/32)-1 && n < inventarioPos.size(); i++, n++) { //inventario
			inventario.dibujarEnPos("res/recuadro.png", i, (height/32)-1);
		}
		for (int i = (width/32)-1, n1 = 0; n1 < 3; i--, n1++) { //mesa de trabajo
			for (int j = (height/32)-1, n2 = 0; n2 < 3; j--, n2++) {
				inventario.dibujarEnPos("res/recuadro.png", i, j);
			}
		}

		for (int i = (width/32)-1; i >= 0; i--) {
			for (int j = (height/32)-1, n = 0; j >= 0 && n < 3; j--, n++) {
				if (n != 2)
					suelo.dibujarEnPos("res/agua.png", i, j);
				else {
					suelo.dibujarEnPos("res/limite.png", i, j);
				}
			}
		}
		//inventario.dibujarEnPos("res/recuadro.png", 0, 0);

		inventario.dibujarEnPos("res/recuadro.png", (width/32)-4, (height/32)-1);//boton crear
		inventario.getCanvas().getGraphicsContext2D().setTextBaseline(VPos.CENTER);
		inventario.getCanvas().getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
		inventario.getCanvas().getGraphicsContext2D().fillText("Crear", ((width/32)-4)*32 + 16, height - 16, 28);


		//if (juego.jugador().sacarPrimerHerramienta() != null) {
		inventario.dibujarEnPos("res/piedra.png", 0, height/32 - 1);
		inventario.dibujarEnPos("res/64/hachapiedra.png", 1, height/32 - 1);
		inventario.dibujarEnPos("res/64/hachametal.png", 2, height/32 - 1);
		inventario.dibujarEnPos("res/picomadera.png", 3, height/32 - 1);
		inventario.dibujarEnPos("res/picopiedra.png", 4, height/32 - 1);
		inventario.dibujarEnPos("res/picometal.png", 5, height/32 - 1);
		inventario.dibujarEnPos("res/picofino.png", 6, height/32 - 1);
		inventario.dibujarEnPos("res/madera.png", 7, height/32 - 1);
		inventario.dibujarEnPos("res/metal.png", 8, height/32 - 1);
		inventario.dibujarEnPos("res/piedra.png", 9, height/32 - 1);
		inventario.dibujarEnPos("res/diamante.png", 10, height/32 - 1);
		
	}
	private void cargarMateriales(Superficie materiales, Algocraft juego) {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Piedra piedra = new Piedra();
		Diamante diamante = new Diamante();

		for (int i = 0; i < juego.mapa().getWidth(); i++) {
			for (int j = 0; j < juego.mapa().getHeight(); j++) {
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
	}
}