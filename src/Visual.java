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
	public void start(Stage primaryStage){
/*
		Superficie suelo = new Superficie(1088,768);
		Superficie materiales = new Superficie(1088,768);
		Superficie tiles = new Superficie(1088,768);
*/		

		Pane root = new Pane(suelo.getCanvas(),materiales.getCanvas(),tiles.getCanvas());
		primaryStage.setTitle("AlgoCraft");
		Scene s = new Scene(root,1088,768);
		primaryStage.setScene(s);

		suelo.dibujarSuperficie("Pasto.png");
		suelo.dibujarEnPos("Casa.png",10,10);
		tiles.dibujarSuperficie("recuadro.png");
		materiales.dibujarEnPos("Madera.png",2,2);

		//root = new Group();







		//dibujarImagenAlPresionarBoton(s,layer2,"P","piedra.png"); //lo puede tener cada material
		//dibujarImagenAlPresionarBoton(s,layer2,"A","piedra.png");
		//dibujarImagenAlPresionarBoton(s,layer2,"M","piedra.png");
		//moverImagenEnDireccion(s,layer3,"recuadro.png");
		//dibujarImagenAlPresionarBoton(s,layer2,"P","piedra.png",pos_x,pos_y);
		//for(Instant i; (i. < 5) && ;) {
		//	System.out.println("Hola");
		//}

		drawStage(root);

		root.setOnKeyPressed(new EventHandler<KeyEvent>() {
		    public void handle(KeyEvent event) {
		        if(event.getCode() == KeyCode.UP) {
		        	Direccion direccion = new DireccionArriba();
		        	juego.avanzarJugador(direccion);
		        }
		        if( event.getCode() == KeyCode.DOWN) {
		        	Direccion direccion = new DireccionAbajo();
		        	juego.avanzarJugador(direccion);
		        }
		        if (event.getCode() == KeyCode.RIGHT) {
		        	Direccion direccion = new DireccionDerecha();
		        	juego.avanzarJugador(direccion);
		        }
		        if (event.getCode() == KeyCode.LEFT) {
		        	Direccion direccion = new DireccionIzquierda();
		        	juego.avanzarJugador(direccion);
		        } 
		        event.consume();
		    }
			
		});
		

		primaryStage.show();


	}


	private void drawStage(Group root){
		setBackground();

		PlayerView = new PlayerView();

	//	root.getChildren().add(new InventaryButtonContainer());
	
	}
	

	private void setBackground(){
		ImageView background = new ImageView();
		background.setImage(new Image("Pasto.png"));
		background.setFitHeight(height);
		background.setFitWidth(width)
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

}