import static org.junit.Assert.*;

import Modelo.*;
import org.junit.Test;


public class InicializacionDeMapaTest{
	@Test
	public void creacionDeMapaTest(){
	Mapa mapa = new Mapa(20,20);
	Diamante diamantetest = new Diamante();
	Piedra piedratest = new Piedra();
	Madera maderatest = new Madera();
	Metal metaltest = new Metal();
	mapa.agregarObjeto(new Posicion(10, 10), diamantetest);
	mapa.agregarObjeto(new Posicion(9, 15), piedratest);
	mapa.agregarObjeto(new Posicion(1, 7), maderatest);
	mapa.agregarObjeto(new Posicion(2, 5), metaltest);
	assertEquals(mapa.celda(new Posicion(1,1)).contenido(),null);
	assertEquals(mapa.celda(new Posicion(2,2)).contenido(),null);
	assertEquals(mapa.celda(new Posicion(10,10)).ocupada(),true);
	assertEquals(mapa.celda(new Posicion(9,8)).ocupada(),true);
	assertEquals(mapa.celda(new Posicion(1,7)).ocupada(),true);
	assertEquals(mapa.celda(new Posicion(2,5)).ocupada(),true);
}

@Test
public void InicializacionDelJugadorEnMapa(){
	Mapa mapa = new Mapa(20,20);
	// El jugador se crea en el (0,0)
	Jugador jugTest = new Jugador();
	mapa.agregarObjeto(new Posicion(1,1), jugTest);
	assertEquals(mapa.celda(new Posicion(1,1)).contenido(),jugTest);
	
	}
}