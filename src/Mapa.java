import java.util.ArrayList;

public class Mapa{
	int n = 20; // dimension del mapa
	private ArrayList<ArrayList<Celda>> capaMateriales = new ArrayList<ArrayList<Celda>>(n);
	private ArrayList<ArrayList<Celda>> celdas = new ArrayList<ArrayList<Celda>>(n);

	public Mapa(){
		for(int i=0; i<n;i++){
			ArrayList<Celda> filas = new ArrayList<Celda>();
			celdas.add(filas);
			for(int j=0; j<n;j++){
				filas.add(new Celda());
			}
		}

		//System.out.println(celdas.size());
		// celdas.get(i).get(j) es la celda (i,j)
	}

	public void cargarMateriales() {
		// cargar la capa de materiales
		//se podria hacer a partir de un archivo
		return;
	}
	public Celda celda(int x, int y) {
		return celdas.get(x).get(y);
	}
	public void agregarMaterial(int x, int y,Material material) {
		celdas.get(x).get(y).ocupar(material);
	}
}