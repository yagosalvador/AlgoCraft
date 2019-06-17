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
	mapa.agregarMaterial(10, 10, diamantetest);
	mapa.agregarMaterial(9, 8, piedratest);
	mapa.agregarMaterial(1, 7, maderatest);
	mapa.agregarMaterial(2, 5, metaltest);
	assertEquals(mapa.celda(1,1).contenido(),null);
	assertEquals(mapa.celda(2,2).contenido(),null);
	assertEquals(mapa.celda(10,10).ocupada(),true);
	assertEquals(mapa.celda(9,8).ocupada(),true);
	assertEquals(mapa.celda(1,7).ocupada(),true);
	assertEquals(mapa.celda(2,5).ocupada(),true);
}

@Test
public void InicializacionDelJugadorEnMapa(){
	Mapa mapa = new Mapa();
	// El jugador se crea en el (0,0)
	Jugador jugTest = new Jugador();
	mapa.celda(0,0).ocupar(jugTest);
	assertEquals(mapa.celda(0,0).contenido(),jugTest);
	
	}
}