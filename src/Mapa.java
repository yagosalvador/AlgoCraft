import java.util.ArrayList;

public class Mapa{
	int width;
	int height;
	private ArrayList<ArrayList<Celda>> celdas = new ArrayList<ArrayList<Celda>>();
	public Mapa(){
		width = 20;
		height = 20;
		for(int i=0; i < width;i++){
			ArrayList<Celda> filas = new ArrayList<Celda>();
			celdas.add(filas);
			for(int j=0; j < height;j++){
				filas.add(new Celda());
			}
		}
		cargarMateriales();
	}

	public Mapa(int w, int h){
		width = w;
		height = h;
		//inicializa las celdas
		for(int i=0; i < width;i++){
			ArrayList<Celda> filas = new ArrayList<Celda>();
			celdas.add(filas);
			for(int j=0; j < height;j++){
				filas.add(new Celda());
			}
		}
		cargarMateriales();
	}

	public void cargarMateriales() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		this.agregarObjeto(5,4,madera);
		this.agregarObjeto(6,4,piedra);
		this.agregarObjeto(7,4,metal);
		this.agregarObjeto(8,4,diamante);
		return;
	}
	public Celda celda(int x, int y) {
		return celdas.get(x).get(y);
	}
	public void agregarMaterial(int x, int y,Material material) {
		celdas.get(x).get(y).ocupar(material);
	}
	//este metodo haria lo mismo que agregarMaterial pero con el jugador, me parece redundante y podriamos usar un metodo agregarEntidad que admita Object en vez de Material o Jugador
	public void agregarJugador(int x, int y, Jugador jugador){
		celdas.get(x).get(y).ocupar(jugador);
	}
	//propuesta:
    public void agregarObjeto(int x, int y, Object aColocar){
        celdas.get(x).get(y).ocupar(aColocar);
    }

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}
}