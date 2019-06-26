import static org.junit.Assert.*;
import org.junit.Test;

public class JugadorTest{
	@Test
	public void inicializaciónDelJugadorTest(){
		Jugador jugador = new Jugador();

		int cantidadDeHachasDeMaderaEnInventario = jugador.verCantidadDeHachaDeMadera();
		assertEquals(cantidadDeHachasDeMaderaEnInventario,1);
		HachaDeMadera hacha = new HachaDeMadera();
		HachaDeMadera unHacha = new HachaDeMadera();
		unHacha = (HachaDeMadera) jugador.sacarHachaDeMadera();
		boolean equal = hacha.equals( unHacha );
		assertEquals( true , equal );
	}
}