import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Mapa {
	private int width;
	private int height;
	private Map<Posicion, Celda> celdas = new HashMap<>();
	private Map<Posicion, Material> materialesEnMapa = new HashMap<>();

	public Mapa(int maxWidth, int maxHeight) {
		width = maxWidth;
		height = maxHeight;
		//inicializa las celdas
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				this.celdas.put(new Posicion(i,j), new Celda());
			}
		}

		armarMapaDeMateriales();
		cargarMateriales();
	}

	private void cargarMateriales() {
		Iterator it = materialesEnMapa.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();

			if(this.celdas.containsKey((Posicion)pair.getKey())) {
				this.agregarObjeto((Posicion) pair.getKey(), pair.getValue());
			}
			else{
				System.out.println("No encuentra Key.");
			}
		}
	}

	public Celda celda(Posicion posicion) {
		return this.celdas.get(posicion);
	}

	public void agregarObjeto(Posicion posicion, Object aColocar) {
		celda(posicion).ocupar(aColocar);
	}

	public boolean posicionDisponibleParaJugador(Posicion posicion) {
		boolean esOcupable = true;

		if (this.celda(posicion).ocupada())
			esOcupable = false;
		if (posicion.getX() >= this.getWidth() || posicion.getX() < 0 || posicion.getY() >= this.getHeight() || posicion.getY() < 0)
			esOcupable = false;
		return esOcupable;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	private void armarMapaDeMateriales(){
		materialesEnMapa.put( new Posicion(4,4), new Madera());
		materialesEnMapa.put( new Posicion(4,5), new Madera());
		materialesEnMapa.put( new Posicion(4,6), new Madera());
		materialesEnMapa.put( new Posicion(4,7), new Madera());
		materialesEnMapa.put( new Posicion(4,8), new Madera());
		materialesEnMapa.put( new Posicion(4,9), new Madera());
		materialesEnMapa.put( new Posicion(4,10), new Madera());
		materialesEnMapa.put( new Posicion(4,11), new Madera());
		materialesEnMapa.put( new Posicion(4,12), new Madera());
		materialesEnMapa.put( new Posicion(4,13), new Madera());
		materialesEnMapa.put( new Posicion(5,4), new Madera());
		materialesEnMapa.put( new Posicion(5,5), new Madera());
		materialesEnMapa.put( new Posicion(5,6), new Madera());
		materialesEnMapa.put( new Posicion(5,7), new Madera());
		materialesEnMapa.put( new Posicion(5,8), new Madera());
		materialesEnMapa.put( new Posicion(5,9), new Madera());
		materialesEnMapa.put( new Posicion(5,10), new Madera());
		materialesEnMapa.put( new Posicion(5,11), new Madera());
		materialesEnMapa.put( new Posicion(5,12), new Madera());
		materialesEnMapa.put( new Posicion(5,13), new Madera());

		materialesEnMapa.put( new Posicion(6,4), new Piedra());
		materialesEnMapa.put( new Posicion(6,5), new Piedra());
		materialesEnMapa.put( new Posicion(6,6), new Piedra());
		materialesEnMapa.put( new Posicion(6,7), new Piedra());
		materialesEnMapa.put( new Posicion(6,8), new Piedra());
		materialesEnMapa.put( new Posicion(6,9), new Piedra());
		materialesEnMapa.put( new Posicion(6,10), new Piedra());
		materialesEnMapa.put( new Posicion(6,11), new Piedra());
		materialesEnMapa.put( new Posicion(6,12), new Piedra());
		materialesEnMapa.put( new Posicion(6,13), new Piedra());
		materialesEnMapa.put( new Posicion(7,4), new Piedra());
		materialesEnMapa.put( new Posicion(7,5), new Piedra());
		materialesEnMapa.put( new Posicion(7,6), new Piedra());
		materialesEnMapa.put( new Posicion(7,7), new Piedra());
		materialesEnMapa.put( new Posicion(7,8), new Piedra());
		materialesEnMapa.put( new Posicion(7,9), new Piedra());
		materialesEnMapa.put( new Posicion(7,10), new Piedra());
		materialesEnMapa.put( new Posicion(7,11), new Piedra());
		materialesEnMapa.put( new Posicion(7,12), new Piedra());
		materialesEnMapa.put( new Posicion(7,13), new Piedra());

		materialesEnMapa.put( new Posicion(8,4), new Metal());
		materialesEnMapa.put( new Posicion(8,5), new Metal());
		materialesEnMapa.put( new Posicion(8,6), new Metal());
		materialesEnMapa.put( new Posicion(8,7), new Metal());
		materialesEnMapa.put( new Posicion(8,8), new Metal());
		materialesEnMapa.put( new Posicion(8,9), new Metal());
		materialesEnMapa.put( new Posicion(8,10), new Metal());
		materialesEnMapa.put( new Posicion(8,11), new Metal());
		materialesEnMapa.put( new Posicion(8,12), new Metal());
		materialesEnMapa.put( new Posicion(8,13), new Metal());
		materialesEnMapa.put( new Posicion(9,4), new Metal());
		materialesEnMapa.put( new Posicion(9,5), new Metal());
		materialesEnMapa.put( new Posicion(9,6), new Metal());
		materialesEnMapa.put( new Posicion(9,7), new Metal());
		materialesEnMapa.put( new Posicion(9,8), new Metal());
		materialesEnMapa.put( new Posicion(9,9), new Metal());
		materialesEnMapa.put( new Posicion(9,10), new Metal());
		materialesEnMapa.put( new Posicion(9,11), new Metal());
		materialesEnMapa.put( new Posicion(9,12), new Metal());
		materialesEnMapa.put( new Posicion(9,13), new Metal());

		materialesEnMapa.put( new Posicion(10,4), new Diamante());
		materialesEnMapa.put( new Posicion(10,5), new Diamante());
		materialesEnMapa.put( new Posicion(11,4), new Diamante());
		materialesEnMapa.put( new Posicion(11,5), new Diamante());
	}
}