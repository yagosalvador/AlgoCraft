import java.util.ArrayList;

public class Mapa{
	private Celda celdas[][] = new Celda[11][11];

	public Mapa(){
		// Creamos un mapa de 11 x 11 con las siguientes consideraciones:
		// Pos(10,10) = Diamante
		// Pos(9,8) = Piedra
		// Pos(1,7) = Madera
		// Pos(2,5) = Metal
		for(int i=0; i<11; i++){
			for(int j=0; j<11 ; j++){
				celdas[i][j] = new Celda();
			}
		}
		Diamante diamante = new Diamante();
		Piedra piedra = new Piedra();
		Madera madera = new Madera();
		Metal metal = new Metal();
		System.out.println(celdas[10][10].contenido());
		this.celdas[10][10].ocupar(diamante);
		this.celdas[9][8].ocupar(piedra);
		this.celdas[1][7].ocupar(madera);
		this.celdas[2][5].ocupar(metal);
	}
	public Celda celda(int x, int y){
		return this.celdas[x][y];
	}
}