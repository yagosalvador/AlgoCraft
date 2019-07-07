import static org.junit.Assert.*;

import Modelo.*;
import org.junit.Test;

public class JugadorTest{
	@Test
	public void inicializaciónDelJugadorTest(){
		Jugador jugador = new Jugador();

		int cantidadDeHachasDeMaderaEnInventario = jugador.cantidadDeElemento("Modelo.HachaDeMadera");
		assertEquals(cantidadDeHachasDeMaderaEnInventario,1);
		HachaDeMadera hacha = new HachaDeMadera();
		HachaDeMadera unHacha = new HachaDeMadera();
		unHacha = (HachaDeMadera) jugador.sacarElemento("Modelo.HachaDeMadera");
		boolean equal = hacha.equals( unHacha );
		assertEquals( true , equal );
	}
	@Test
	public void ponerUnMaterialEnMesaYNoConstruirLoDevuelveAlInventarioTest(){
		Jugador jugador = new Jugador();
		Almacenable madera = new Madera();
		jugador.almacenarElemento(madera);

		assertEquals(1, jugador.cantidadDeElemento("Modelo.Madera"));

		jugador.ubicarMaterialEnMesaDeTrabajo(0, "Modelo.Madera");
		assertEquals(0, jugador.cantidadDeElemento("Modelo.Madera"));
		
		jugador.construirHerramienta();
		assertEquals(1, jugador.cantidadDeElemento("Modelo.Madera"));

	}
	@Test
	public void ponerUnMaterialEnMesaYConstruirloNoDevuelveAlInventarioTest(){
		Jugador jugador = new Jugador();
		Almacenable madera1 = new Madera();
		Almacenable madera2 = new Madera();
		Almacenable madera3 = new Madera();
		Almacenable madera4 = new Madera();
		Almacenable madera5 = new Madera();

		jugador.almacenarElemento(madera1);
		jugador.almacenarElemento(madera2);
		jugador.almacenarElemento(madera3);
		jugador.almacenarElemento(madera4);
		jugador.almacenarElemento(madera5);
		assertEquals(5, jugador.cantidadDeElemento("Modelo.Madera"));

		assertEquals(1, jugador.cantidadDeElemento("Modelo.HachaDeMadera"));


		jugador.ubicarMaterialEnMesaDeTrabajo(0, "Modelo.Madera");
		jugador.ubicarMaterialEnMesaDeTrabajo(1, "Modelo.Madera");
		jugador.ubicarMaterialEnMesaDeTrabajo(3, "Modelo.Madera");
		jugador.ubicarMaterialEnMesaDeTrabajo(4, "Modelo.Madera");
		jugador.ubicarMaterialEnMesaDeTrabajo(7, "Modelo.Madera");
		jugador.construirHerramienta();
		assertEquals(2, jugador.cantidadDeElemento("Modelo.HachaDeMadera"));
		
		assertEquals(0, jugador.cantidadDeElemento("Modelo.Madera"));
	}
	@Test
	public void reemplazarEnMesaDeTrabajoUnMaterialLoDevuelveTest(){
		Jugador jugador = new Jugador();
		Almacenable madera = new Madera();
		Almacenable piedra = new Piedra();


		jugador.almacenarElemento(madera);
		jugador.almacenarElemento(piedra);
		assertEquals(1, jugador.cantidadDeElemento("Modelo.Madera"));
		assertEquals(1, jugador.cantidadDeElemento("Modelo.Piedra"));

		jugador.ubicarMaterialEnMesaDeTrabajo(0, "Modelo.Madera");
		assertEquals(0, jugador.cantidadDeElemento("Modelo.Madera"));
		assertEquals(1, jugador.cantidadDeElemento("Modelo.Piedra"));

		jugador.ubicarMaterialEnMesaDeTrabajo(0, "Modelo.Piedra");
		assertEquals(1, jugador.cantidadDeElemento("Modelo.Madera"));
		assertEquals(0, jugador.cantidadDeElemento("Modelo.Piedra"));
	}
}