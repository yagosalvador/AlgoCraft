import static org.junit.Assert.*;
import org.junit.Test;

public class InicializacionDelJuegoTest{
	@Test
	public void InicializacionJuegoTest(){
		// crear algocraft y corroborar lo anterior
		Algocraft juego = new Algocraft();
		
		// corroborar que se crea el jugador en el mapa en la pos 0,0
		Jugador jugTest = new Jugador();
		assertEquals(jugTest.getClass(),juego.jugador().getClass());
		assertEquals(juego.mapa().celda(0,0).contenido(),juego.jugador());
		
		// corroborar que se crean los materiales en el mapa
		
		Diamante diamantetest = new Diamante();
		Piedra piedratest = new Piedra();
		Madera maderatest = new Madera();
		Metal metaltest = new Metal();
		assertEquals(juego.mapa().celda(1,1).contenido(),null);
		assertEquals(juego.mapa().celda(2,2).contenido(),null);
        // assertEquals(juego.mapa().celda(10,10).ocupada(),true);
		// assertEquals(juego.mapa().celda(9,8).ocupada(),true);
		// assertEquals(juego.mapa().celda(1,7).ocupada(),true);
		// assertEquals(juego.mapa().celda(2,5).ocupada(),true);

	}

}