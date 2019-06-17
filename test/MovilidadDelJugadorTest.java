import static org.junit.Assert.*;
import org.junit.Test;

public class MovilidadDelJugadorTest{
	@Test
	public void actualizarPosicionJugadorTest() {
		// inicializo juego con jugador en la posicion (0,0)
		Algocraft juego = new Algocraft();
		// actualizo la posicion del jugador
		juego.actualizarPosicionJugador(5,5);
		assertEquals(juego.mapa().celda(5,5).contenido(),juego.jugador());
	}
	
	@Test
	public void jugadorSeMueveAUnaPosicionVaciaTest() {
		Algocraft juego = new Algocraft();
		Diamante diamante = new Diamante();
		juego.actualizarPosicionJugador(9,10);
		juego.jugador().avanzarAlNorte();
		assertEquals(juego.mapa().celda(10,10).contenido(),juego.jugador());
	}
	
	@Test
	public void jugadorSeMueveAUnaPosicionOcupadaTest() {
		Algocraft juego = new Algocraft();
		Diamante diamante = new Diamante();
		juego.actualizarPosicionJugador(9,10);
		juego.mapa().agregarMaterial(10,10,diamante);
		juego.jugador().avanzarAlNorte();
		assertEquals(juego.mapa().celda(9,10).contenido(),juego.jugador());
	}

	@Test
	public void jugadorAvanzaAlNorteTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(0,0);
		juego.jugador().avanzarAlNorte();
		assertEquals(juego.mapa().celda(1,0).contenido(),juego.jugador());
	}
	@Test
	public void jugadorAvanzaAlSurTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(1,0);
		juego.jugador().avanzarAlSur();
		assertEquals(juego.mapa().celda(0,0).contenido(),juego.jugador());
	}
	@Test
	public void jugadorAvanzaAlEsteTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(0,1);
		juego.jugador().avanzarAlEste();
		assertEquals(juego.mapa().celda(0,0).contenido(),juego.jugador());
	}
	@Test
	public void jugadorAvanzaAlOesteTest() {
		Algocraft juego = new Algocraft();
		juego.actualizarPosicionJugador(0,0);
		juego.jugador().avanzarAlOeste();
		assertEquals(juego.mapa().celda(0,1).contenido(),juego.jugador());
	}
}