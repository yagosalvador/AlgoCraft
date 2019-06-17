import java.util.ArrayList;

public class Mapa{
	int n = 20; // dimension del mapa
	private ArrayList<ArrayList<Celda>> capaMateriales = new ArrayList<ArrayList<Celda>>(n);
	private ArrayList<ArrayList<Celda>> celdas = new ArrayList<ArrayList<Celda>>(n);

	public Mapa(){
		for(int i=0; i<n; i++){
			celdas.set(i,new ArrayList<Celda>()); 
		}
		// celdas.get(i).get(j) es la celda (i,j)
	}
	public void cargarMateriales() {
		// cargar la capa de materiales
		return;
	}
	public Celda celda(int x, int y) {
		return celdas.get(x).get(y);
	}
}