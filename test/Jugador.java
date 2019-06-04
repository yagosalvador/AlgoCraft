import static org.junit.Assert.*;
import org.junit.Test;

public class TestJugador{

	@Test
	public inicializaciónDelJugadorTest(){
		Jugador jugador = new Jugador();
		int cantidadDeHerramientasEnInventario = jugador.cantidadDeHerramientas();
		assertEquals(cantidadDeHerramientasEnInventario,1);
		Lista listaHerramientas = jugador.obetenerListaHerramientas();

		//Como chequeamos que la herramienta que obtenemos es Hacha de madera? Hmm
	}
}