import static org.junit.Assert.*;
import org.junit.Test;

public class TestJugador{

	@Test
	public inicializaciónDelJugadorTest(){
		Jugador jugador = new Jugador();
		int cantidadDeHerramientasEnInventario = jugador.cantidadDeHerramientas();
		assertEquals(cantidadDeHerramientasEnInventario,1);
		Lista listaHerramientas = jugador.obtenerListaHerramientas();

		//Como chequeamos que la herramienta que obtenemos es Hacha de madera? Hmm
		//Propuesta, suponiendo que obtenerListaHerramientas va llenando listaHerramientas como un vector, no se como pensaron implementarla:
		HachaDeMadera hacha = new HachaDeMadera();
		assertEquals(hacha,listaHerramientas[1]);
		//pregunta, habria que chequear las demas cosas que se deberian inicializar con el jugador, como el inventario por ejemplo?
	}
}