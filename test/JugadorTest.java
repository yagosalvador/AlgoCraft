import static org.junit.Assert.*;
import org.junit.Test;

public class JugadorTest{
	@Test
	public void inicializaciónDelJugadorTest(){
		Jugador jugador = new Jugador();
		int cantidadDeHerramientasEnInventario = jugador.capacidadOcupadaInventario();
		assertEquals(cantidadDeHerramientasEnInventario,1);
		//Como chequeamos que la herramienta que obtenemos es Hacha de madera? Hmm
		//Propuesta, suponiendo que obtenerListaHerramientas va llenando listaHerramientas como un vector, no se como pensaron implementarla:
		HachaDeMadera hacha = new HachaDeMadera();

		assertEquals(hacha.getClass(),jugador.sacarPrimerHerramienta().getClass());

		//pregunta, habria que chequear las demas cosas que se deberian inicializar con el jugador, como el inventario por ejemplo?
		// RTA: Para mi esta mal el objeto creado arriba no es el mismo objeto que en el inventario
	}
}