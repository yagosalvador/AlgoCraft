public class Algocraft{
	private Mapa mapa;
	private Jugador jugador;

	public Algocraft(){
		mapa = new Mapa();
		jugador = new Jugador();
		mapa.celda(0,0).ocupar(jugador);
	}
	
	public Jugador jugador(){
		return this.jugador;
	}
	
	public Mapa mapa(){
		return this.mapa;
	}
	public void actualizarPosicionJugador(int x, int y) {
		if(mapa.celda(x, y).ocupada()){
			return;
		}
		mapa.celda(x,y).ocupar(jugador);
		jugador.actualizarPosicion(x,y);
	}
	public void avanzarJugadorAlNorte() {
		this.jugador().avanzarAlNorte();
	}
	public void avanzarJugadorAlSur() {
		this.jugador().avanzarAlSur();
	}
	public void avanzarJugadorAlEste() {
		this.jugador().avanzarAlEste();
	}
	public void avanzarJugadorAlOeste() {
		this.jugador().avanzarAlOeste();
	}

}