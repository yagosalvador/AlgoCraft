import static org.junit.Assert.*;
import org.junit.Test;

public class MovilidadDelJugadorTest{
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
}