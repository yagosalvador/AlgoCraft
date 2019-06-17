import java.util.ArrayList;

public class Mapa{
	int n = 20; // dimension del mapa
	private ArrayList<ArrayList<Celdas>> capaMateriales = new ArrayList<ArrayList<Celdas>>(n);
	private ArrayList<ArrayList<Celdas>> celdas = new ArrayList<ArrayList<Celdas>>(n);

	public Mapa(){
		for(int i; i<20; i++){
			celdas.add(new ArrayList<ArrayList<Celdas>>(n));
		}


	}
	//esto esta dando problemas cuando se quiere llamar a los metodos de la celda desde afuera y no puedo identificar el problema
	public Celda celda(int x, int y){
		return this.celdas[x][y];
	}
	
}