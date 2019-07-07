import Modelo.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InicializacionDelJuegoTest{
	@Test
	public void JuegoInicializaConJugadorEnPosicionInicialTest() {
		Algocraft juego = new Algocraft(20, 20);

		// corroborar que se crea el jugador en el mapa en la pos 0,0
		Jugador jugTest = new Jugador();
		assertEquals(jugTest.getClass(), juego.jugador().getClass());
		assertEquals(juego.mapa().celda(new Posicion(1, 1)).contenido(), juego.jugador());
	}
	@Test
	public void JuegoInicializaConMaterialesEnPosicionInicialTest() {
		Algocraft juego = new Algocraft(20, 20);
		// corroborar que se crean los materiales en el mapa
		
		Material diamante = new Diamante();
		Material piedra = new Piedra();
		Material madera = new Madera();
		Material metal = new Metal();
		//chequea el contenido de celdas sin material
		assertEquals(null, juego.mapa().celda(new Posicion(2,2)).contenido());
		//chequea el contenido de celdas con material
		assertEquals(madera.getClass(), juego.mapa().celda(new Posicion(4,4)).contenido().getClass());
		assertEquals(piedra.getClass(), juego.mapa().celda(new Posicion(6,4)).contenido().getClass());
		assertEquals(metal.getClass(), juego.mapa().celda(new Posicion(8,4)).contenido().getClass());
		assertEquals(diamante.getClass(), juego.mapa().celda(new Posicion(10,4)).contenido().getClass());
        //verifica el estado de celdas con y sin material
		assertEquals(true, juego.mapa().celda(new Posicion(5,4)).ocupada());
		assertEquals(true, juego.mapa().celda(new Posicion(6,4)).ocupada());
		assertEquals(true, juego.mapa().celda(new Posicion(7,4)).ocupada());
		assertEquals(true, juego.mapa().celda(new Posicion(8,4)).ocupada());
		assertEquals(true, juego.mapa().celda(new Posicion(8,5)).ocupada());
		assertEquals(false, juego.mapa().celda(new Posicion(3,6)).ocupada());


	}

}