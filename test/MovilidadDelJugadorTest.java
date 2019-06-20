import static org.junit.Assert.*;
import org.junit.Test;

public class MovilidadDelJugadorTest{
	@Test
	public void actualizarPosicionJugadorTest() {
		// inicializo juego con jugador en la posicion (0,0)
		Algocraft juego = new Algocraft();
		// actualizo la posicion del jugador
		juego.actualizarPosicionJugador(5,6);
		assertEquals(juego.mapa().celda(5,6).contenido(),juego.jugador());
		assertEquals(juego.jugador().getUbicacion_x(),5);
		assertEquals(juego.jugador().getUbicacion_y(),6);
		juego.actualizarPosicionJugador(3,9);
		assertEquals(juego.mapa().celda(3,9).contenido(),juego.jugador());
		assertEquals(juego.jugador().getUbicacion_x(),3);
		assertEquals(juego.jugador().getUbicacion_y(),9);
		assertEquals(juego.mapa().celda(5,6).contenido(),null);

	}

	@Test
	public void jugadorSeMueveAUnaPosicionVaciaTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(9,10);
		assertEquals(juego.mapa().celda(9,10).contenido(),juego.jugador());
	}
	
	@Test
	public void jugadorSeMueveAUnaPosicionOcupadaTest() {
		Algocraft juego = new Algocraft();
		Diamante diamante = new Diamante();
		juego.actualizarPosicionJugador(9,10);
		juego.mapa().agregarMaterial(10,10,diamante);
		juego.actualizarPosicionJugador(10,10);
		assertEquals(juego.mapa().celda(9,10).contenido(),juego.jugador());
		assertEquals(juego.mapa().celda(10,10).contenido(),diamante);
	}
	@Test
	public void jugadorAvanzaArribaTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(5,7);
		Direccion nuevaposicion = new DireccionArriba();
		juego.avanzarJugador(nuevaposicion);
		assertEquals(juego.mapa().celda(5,6).contenido(),juego.jugador());
		assertEquals(juego.mapa().celda(5,7).contenido(),null);
	}

	@Test
	public void jugadorAvanzaAbajoTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(5,7);
		Direccion nuevaposicion = new DireccionAbajo();
		juego.avanzarJugador(nuevaposicion);
		assertEquals(juego.mapa().celda(5,8).contenido(),juego.jugador());
		assertEquals(juego.mapa().celda(5,7).contenido(),null);
	}

	@Test
	public void jugadorAvanzaIzquierdaTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(5,7);
		Direccion nuevaposicion = new DireccionIzquierda();
		juego.avanzarJugador(nuevaposicion);
		assertEquals(juego.mapa().celda(4,7).contenido(),juego.jugador());
		assertEquals(juego.mapa().celda(5,7).contenido(),null);
	}

	@Test
	public void jugadorAvanzaDerechaTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(5,7);
		Direccion nuevaposicion = new DireccionDerecha();
		juego.avanzarJugador(nuevaposicion);
		assertEquals(juego.mapa().celda(6,7).contenido(),juego.jugador());
		assertEquals(juego.mapa().celda(5,7).contenido(),null);
	}
}