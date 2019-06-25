public class Algocraft{
	private Mapa mapa;
	private Jugador jugador;
	private Posicion posicionJugador;

	public Algocraft(){
		mapa = new Mapa();
		jugador = new Jugador();
		//mapa.celda(0,0).ocupar(jugador);
		//propuesta: mapa.agregarObjeto(0,0,jugador); (ver Mapa.java)
		mapa.agregarJugador(0,0,jugador);
		posicionJugador = new Posicion(0,0);

	}
	
	public Jugador jugador(){
		return this.jugador;
	}
	
	public Mapa mapa(){
		return this.mapa;
	}

	public void actualizarPosicionJugador(int x, int y) {
		if(mapa.celda(x, y).ocupada()||x>this.mapa().getTamaño()||x<0||y>this.mapa().getTamaño()||y<0){
			return;
		}
		//se desocupa la celda original (el jugador abandona su posicion para ocupar otra
		mapa.celda(posicionJugador.getX(),posicionJugador.getY()).vaciar();
        mapa.agregarObjeto(x,y,jugador);
		posicionJugador = new Posicion(x,y);
	}
	public void avanzarJugador(Direccion direccion){
		actualizarPosicionJugador(posicionJugador.getX() + direccion.getX(), posicionJugador.getY() + direccion.getY());
	}
	public int getPosicionJugadorX(){return posicionJugador.getX();}
	public int getPosicionJugadorY(){return posicionJugador.getY();}
}