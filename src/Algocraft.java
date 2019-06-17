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
	public void actualizarPosicionJugador(int x, int y) {
		if(mapa.celda(x, y).ocupada()){
			return;
		}
		mapa.celda(x,y).ocupar(jugador);
		jugador.actualizarPosicion(x,y);
	}

}