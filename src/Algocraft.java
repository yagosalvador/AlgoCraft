public class Algocraft{
	private Mapa mapa;
	private Jugador jugador;
	private Posicion posicionJugador;
	private EscuchadorEventosJuego escuchadorDeEventos;

	public Algocraft(){
		mapa = new Mapa();
		jugador = new Jugador();
		mapa.agregarJugador(0,0,jugador);
		posicionJugador = new Posicion(0,0);
	}

	public Algocraft(int width, int height){
		mapa = new Mapa(width,height);
		jugador = new Jugador();
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
		if(mapa.celda(x, y).ocupada()){
			return;
		}
		mapa.celda(posicionJugador.getX(),posicionJugador.getY()).vaciar();
        mapa.agregarObjeto(x,y,jugador);
		posicionJugador = new Posicion(x,y);
	}
	public void avanzarJugador(Direccion direccion){
		int x = posicionJugador.getX() + direccion.getX();
		int y = posicionJugador.getY() + direccion.getY();
		if (x >= this.mapa().getWidth() || x < 0 || y >= this.mapa().getHeight() || y < 0)
			return;
		actualizarPosicionJugador(x, y);
	}
	public int getPosicionJugadorX(){return posicionJugador.getX();}
	public int getPosicionJugadorY(){return posicionJugador.getY();}

	public void añadirEscuchadorEventosJuego(EscuchadorEventosJuego escuchador){
		this.escuchadorDeEventos = escuchador;
		jugador.añadirEscuchadorEventosJuego(escuchador);
		//mapa.añadirEscuchadorEventosJuego();
	}
}