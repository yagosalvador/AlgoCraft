//Probar cambiando el root a Group, 

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.awt.*;
import java.sql.Time;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static javafx.scene.input.KeyEvent.ANY;
import static javafx.scene.input.KeyEvent.KEY_PRESSED;
import java.io.File;

public class Visual extends Application{
	//private Group root;
	private Algocraft juego;
	private PlayerView PlayerView;
	private double height = 1088;
	private double width = 768;


	public static void main(String[] args){
		Algocraft juego = new Algocraft();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Algocraft juego = new Algocraft();
		int width = juego.mapa().getTamaño() * 32;
		int height = juego.mapa().getTamaño() * 32;
		Superficie suelo = new Superficie(width, height);
		Superficie materiales = new Superficie(width, height);
		Superficie tiles = new Superficie(width, height);
		Superficie jugador = new Superficie(width, height);


		Pane root = new Pane(suelo.getCanvas(), materiales.getCanvas(), tiles.getCanvas(), jugador.getCanvas());
		primaryStage.setTitle("AlgoCraft");
		Scene s = new Scene(root, width, height);
		primaryStage.setScene(s);

		suelo.dibujarSuperficie("res/Pasto.png");
		//tiles.dibujarSuperficie("res/recuadro.png");
		materiales.dibujarEnPos("res/Madera.png", 2, 2);
		int x = juego.getPosicionJugadorX();
		int y = juego.getPosicionJugadorX();
		jugador.dibujarEnPos("res/character1.png", x, y);
		primaryStage.show();


		Madera madera = new Madera();
		Metal metal = new Metal();
		Piedra piedra = new Piedra();
		Diamante diamante = new Diamante();

		for(int i = 0; i < juego.mapa().getTamaño(); i++) {
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

		s.setOnKeyPressed(new EventHandler<KeyEvent>() {
		    public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.UP) {
					Direccion direccion = new DireccionArriba();
					jugador.borrarPos(juego.getPosicionJugadorX(),juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/character1.png",juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
				}
		        if(event.getCode() == KeyCode.DOWN) {
					Direccion direccion = new DireccionAbajo();
					jugador.borrarPos(juego.getPosicionJugadorX(),juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/character1.png",juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
		        }
		        if (event.getCode() == KeyCode.RIGHT) {
		        	Direccion direccion = new DireccionDerecha();
					jugador.borrarPos(juego.getPosicionJugadorX(),juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/character1.png",juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
				}
		        if (event.getCode() == KeyCode.LEFT) {
		        	Direccion direccion = new DireccionIzquierda();
					jugador.borrarPos(juego.getPosicionJugadorX(),juego.getPosicionJugadorY());
					juego.avanzarJugador(direccion);
					jugador.dibujarEnPos("res/character1.png",juego.getPosicionJugadorX(), juego.getPosicionJugadorY());
				}
		        if (event.getCode() == KeyCode.SPACE){
		        	Direccion mirandoDireccion = new DireccionAbajo();
		        	int x = juego.getPosicionJugadorX() + mirandoDireccion.getX();
		        	int y = juego.getPosicionJugadorY() + mirandoDireccion.getY();
		        	if( juego.mapa().celda(x,y).ocupada() ) {
						//juego.jugador().vs(juego.mapa().celda(x,y).contenido());
						//animacion golpe
						Media sound = new Media(new File("res/metal10.wav").toURI().toString());
						MediaPlayer mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
					}
				}
		    }

		});

	}


	/*private void drawStage(Group root){
		setBackground();

		PlayerView = new PlayerView();

	//	root.getChildren().add(new InventaryButtonContainer());
	
	}
	

	private void setBackground(){
		ImageView background = new ImageView();
		background.setImage(new Image("Pasto.png"));
		background.setFitHeight(height);
		background.setFitWidth(width);
		root.getChildren().add(background);
	}
	/*public void moverImagenEnDireccion(Scene s, Canvas lienzo,String str){
		s.setOnKeyPressed(e->{
			if (e.getCode() == KeyCode.RIGHT) {
				limpiarLienzo(lienzo);
				dibujarImagen(lienzo, str,5, 3);
			}
			if (e.getCode() == KeyCode.DOWN) {
				limpiarLienzo(lienzo);
				dibujarImagen(lienzo, str,4, 4);
			}
		});
	}

	public void dibujarImagenAlPresionarBoton(Scene s,Canvas zona,String key,String str,int pos_x, int pos_y){
		s.setOnKeyPressed(e->{
			System.out.println(e.getCode());
			if (e.getCode().toString() == key) {
				dibujarImagen(zona, str,pos_x, pos_y);
			}
		});
	}*/
	//root = new Group();

	//dibujarImagenAlPresionarBoton(s,layer2,"P","piedra.png"); //lo puede tener cada material
	//dibujarImagenAlPresionarBoton(s,layer2,"A","piedra.png");
	//dibujarImagenAlPresionarBoton(s,layer2,"M","piedra.png");
	//moverImagenEnDireccion(s,layer3,"recuadro.png");
	//dibujarImagenAlPresionarBoton(s,layer2,"P","piedra.png",pos_x,pos_y);
	//for(Instant i; (i. < 5) && ;) {
	//	System.out.println("Hola");
	//}

	//drawStage(root);


}