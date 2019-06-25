import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class PlayerView implements Drawable{
	private int positionX;
	private int positionY;
	private double playerScale = 4;
	private Group root;
	ImageView playerImage;

	public PlayerView(Group root){
		this.root = root;
		//Levantar posiciones del mapa.
		positionX = juego.getPosicionJugadorX();
		positionY = juego.getPosicionJugadorY();

		playerImage = new ImageView();
		playerImage.setTransalateX(positionX);
		playerImage.setTransalateY(positionY);
		playerImage.setScaleX(playerScale);
		playerImage.setScaleY(playerScale);

		playerImage.setImage(new Image("wachin.png"));
		root.getChildren().add(playerImage);
	}
	@Override
	public void draw(){
		//Actualizar la posicion con el modelo.
		playerImage.setTransalateX(positionX);
		playerImage.setTransalateY(positionY);
		root.getChildren().remove(playerImage);
		root.getChildren().add(playerImage);
	}
	public void changePlayerSkin(String filename){
		playerImage.setImage(new Image(filename + ".png"));
	}
	public void updateSkin(){
		changePlayerSkin(//Obtener direccion +".png")
	}
}