import static org.junit.Assert.*;

import Modelo.*;
import org.junit.Test;

public class CeldaTest{
	@Test
	public void instanciaCeldaVaciaTest(){
		Celda celda = new Celda();
		boolean ocupada = false;

		assertEquals(ocupada, celda.ocupada());
	}
	@Test
	public void instanciaCeldaOcupadaTest(){
		Material madera = new Madera();
		Celda celda = new Celda(madera);
		boolean ocupada = true;

		assertEquals(ocupada, celda.ocupada());
	}
	@Test
	public void seOcupaCeldaVaciaConAlgunObjetoTest(){
		Material madera = new Madera();
		Celda celda = new Celda();
		boolean ocupada = false;

		assertEquals(ocupada, celda.ocupada());
		celda.ocupar(madera);
		ocupada = true;
		assertEquals(ocupada, celda.ocupada());
	}
	@Test
	public void seOcupaCeldaVaciaConJugadorTest(){
		Jugador jugador = new Jugador();
		Celda celda = new Celda();
		boolean ocupada = false;

		assertEquals(ocupada, celda.ocupada());
		celda.ocupar(jugador);
		ocupada = true;
		assertEquals(ocupada, celda.ocupada());
	}
	@Test
	public void seOcupaUnCasilleroOcupadoTest(){
		Material madera = new Madera();
		Material metal = new Metal();
		Celda celda = new Celda(metal);

		assertEquals(true, celda.ocupada());
		assertEquals(metal,celda.contenido());

		celda.ocupar(madera);

		assertEquals(metal,celda.contenido());
	}
}