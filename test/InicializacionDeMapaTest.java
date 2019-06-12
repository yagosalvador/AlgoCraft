import static org.junit.Assert.*;
import org.junit.Test;

public class InicializacionDeMapaTest{
	@Test
	public void creacionDeMapaTest(){
	// 	// Creamos un mapa de 10 x 10 con las siguientes consideraciones:
	// 	// Pos(10,10) = Diamante
	// 	// Pos(9,8) = Piedra
	// 	// Pos(1,7) = Madera
	// 	// Pos(2,5) = Metal
	Mapa mapa = new Mapa();
	Diamante diamantetest = new Diamante();
	Piedra piedratest = new Piedra();
	Madera maderatest = new Madera();
	Metal metaltest = new Metal();
	assertEquals(mapa.celda(1,1).contenido(),null);
	assertEquals(mapa.celda(2,2).contenido(),null);
	assertEquals(mapa.celda(10,10).ocupada(),true);
	assertEquals(mapa.celda(9,8).ocupada(),true);
	assertEquals(mapa.celda(1,7).ocupada(),true);
	assertEquals(mapa.celda(2,5).ocupada(),true);
	}

	@Test
	public void mapa(){
		Mapa mapa = new Mapa();
	}

}