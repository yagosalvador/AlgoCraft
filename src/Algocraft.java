public class Algocraft{
	private Mapa mapa;
	private Jugador jugador;

	public Algocraft(){
		mapa = new Mapa();
		jugador = new Jugador();
		//mapa.celda(0,0).ocupar(jugador);
		//propuesta: mapa.agregarObjeto(0,0,jugador); (ver Mapa.java)
		mapa.agregarJugador(0,0,jugador);

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
		mapa.celda(jugador.getUbicacion_x(),jugador.getUbicacion_y()).vaciar();
        mapa.agregarObjeto(x,y,jugador);
		jugador.actualizarPosicion(x,y);
	}
	public void avanzarJugador(Direccion direccion){
		actualizarPosicionJugador(jugador.getUbicacion_x() + direccion.getX(), jugador.getUbicacion_y() + direccion.getY());
	}
}