import java.util.ArrayList;

public class Mapa{
	int n = 20; // dimension del mapa
	private ArrayList<ArrayList<Celda>> capaMateriales = new ArrayList<ArrayList<Celda>>(n);
	private ArrayList<ArrayList<Celda>> celdas = new ArrayList<ArrayList<Celda>>(n);

	public Mapa(){
		//inicializa las celdas
		for(int i=0; i<n;i++){
			ArrayList<Celda> filas = new ArrayList<Celda>();
			celdas.add(filas);
			for(int j=0; j<n;j++){
				filas.add(new Celda());
			}
		}
		//y luego las llena con lo que haga falta
		cargarMateriales();

		//System.out.println(celdas.size());
		// celdas.get(i).get(j) es la celda (i,j)
	}

	public void cargarMateriales() {
		// cargar la capa de materiales
		//se podria hacer a partir de un archivo
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		//por ahora va arbitrario para los tests
		this.agregarMaterial(5,4,madera);
		this.agregarMaterial(6,4,piedra);
		this.agregarMaterial(7,4,metal);
		this.agregarMaterial(8,4,diamante);
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
}