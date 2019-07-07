package Modelo;

public class Algocraft{
	private Mapa mapa;
	private Jugador jugador;
	private Posicion posicionJugador;
	private Posicion posicionMirada;

	public Algocraft(int width, int height){
		mapa = new Mapa(width,height);
		jugador = new Jugador();
		posicionJugador = new Posicion( 1, 1);
		posicionMirada = new Posicion(1,2);
		mapa.agregarObjeto(posicionJugador,jugador);
	}

	public Jugador jugador(){
		return this.jugador;
	}

	public Mapa mapa(){
		return this.mapa;
	}

	public void avanzarJugador(Direccion direccion){
		Posicion nuevaPosicion = new Posicion(posicionJugador);
		nuevaPosicion.actualizar(direccion);
		if(mapa.posicionDisponibleParaJugador(nuevaPosicion)) {
			mapa().celda(posicionJugador).vaciar();
			posicionJugador.actualizar(direccion);
			mapa().agregarObjeto(posicionJugador, jugador);
		}
		posicionMirada = new Posicion(posicionJugador);
		posicionMirada.actualizar(direccion);
	}

	public int getPosicionJugadorX(){return posicionJugador.getX();}
	public int getPosicionJugadorY(){return posicionJugador.getY();}
	public Posicion getPosicionMirada(){
		return posicionMirada;
	}
}