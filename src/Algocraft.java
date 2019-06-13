public class Algocraft{
	private Mapa mapa;
	private Jugador jugador;

	public Algocraft(){
		mapa = new Mapa();
		jugador = new Jugador();

		mapa.celda(0,0).ocupar(jugador);
	}

	public Jugador jugador(){
		return jugador;
	}

	public Mapa mapa(){
		return mapa;
	}
	public static void main(String[] args) {
		System.out.println("Iniciando Algocraft - Bienvenido");
	}

}