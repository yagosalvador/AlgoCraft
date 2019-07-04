import static org.junit.Assert.*;
import org.junit.Test;

public class InicializacionDelJuegoTest{
	@Test
	public void InicializacionJuegoTest(){
		// crear algocraft y corroborar lo anterior
		Algocraft juego = new Algocraft(20,20);
		
		// corroborar que se crea el jugador en el mapa en la pos 0,0
		Jugador jugTest = new Jugador();
		assertEquals(jugTest.getClass(),juego.jugador().getClass());
		assertEquals(juego.mapa().celda(0,0).contenido(),juego.jugador());
		
		// corroborar que se crean los materiales en el mapa
		
		Diamante diamantetest = new Diamante();
		Piedra piedratest = new Piedra();
		Madera maderatest = new Madera();
		Metal metaltest = new Metal();
		//chequea el contenido de celdas sin material
		assertEquals(juego.mapa().celda(1,1).contenido(),null);
		assertEquals(juego.mapa().celda(2,2).contenido(),null);
		//chequea el contenido de celdas con material
		assertEquals(juego.mapa().celda(5,4).contenido().getClass(),maderatest.getClass());
		assertEquals(juego.mapa().celda(6,4).contenido().getClass(),piedratest.getClass());
		assertEquals(juego.mapa().celda(7,4).contenido().getClass(),metaltest.getClass());
		assertEquals(juego.mapa().celda(8,4).contenido().getClass(),diamantetest.getClass());
        //verifica el estado de celdas con y sin material
		assertEquals(juego.mapa().celda(5,4).ocupada(),true);
		assertEquals(juego.mapa().celda(6,4).ocupada(),true);
		assertEquals(juego.mapa().celda(7,4).ocupada(),true);
		assertEquals(juego.mapa().celda(8,4).ocupada(),true);
		assertEquals(juego.mapa().celda(8,5).ocupada(),false);
		assertEquals(juego.mapa().celda(3,6).ocupada(),false);


	}

}