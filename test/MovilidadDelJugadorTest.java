import static org.junit.Assert.*;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

public class MovilidadDelJugadorTest{
	@Test
	public void unaPosicionVaciaEstaDisplonibleTest(){
		Algocraft juego = new Algocraft(20,20);
		Posicion unaPosicion = new Posicion(0,5);
		Boolean disponible = juego.mapa().posicionDisponibleParaJugador(unaPosicion);
		assertEquals(true, disponible);
		juego.mapa().agregarObjeto(unaPosicion, new Madera());
		disponible = juego.mapa().posicionDisponibleParaJugador(unaPosicion);
		assertEquals(false, disponible);
	}
	@Test
	public void jugadorSeMueveAUnaPosicionOcupadaTest() {
		Algocraft juego = new Algocraft(20, 20);
		Diamante diamante = new Diamante();
		juego.mapa().agregarObjeto(new Posicion(2,1),diamante);
		Direccion nuevaDireccion = new DireccionDerecha();
		juego.avanzarJugador(nuevaDireccion);
		assertEquals(juego.mapa().celda(new Posicion(1,1)).contenido(),juego.jugador());
		assertEquals(juego.mapa().celda(new Posicion(2,1)).contenido(),diamante);
	}
	@Test
	public void jugadorAvanzaArribaTest() {
		Algocraft juego = new Algocraft(20, 20);
		Direccion nuevaPosicion = new DireccionArriba();
		juego.avanzarJugador(nuevaPosicion);
		assertEquals(juego.jugador(), juego.mapa().celda(new Posicion(1,0)).contenido());

		assertEquals(null, juego.mapa().celda(new Posicion(1,1)).contenido());
	}

	@Test
	public void jugadorAvanzaAbajoTest() {
		Algocraft juego = new Algocraft(20, 20);
		Direccion nuevaPosicion = new DireccionAbajo();
		juego.avanzarJugador(nuevaPosicion);
		assertEquals(juego.jugador(), juego.mapa().celda(new Posicion(1,2)).contenido());

		assertEquals(null, juego.mapa().celda(new Posicion(1,1)).contenido());
	}

	@Test
	public void jugadorAvanzaIzquierdaTest() {
		Algocraft juego = new Algocraft(20, 20);
		Direccion nuevaPosicion = new DireccionIzquierda();
		juego.avanzarJugador(nuevaPosicion);
		assertEquals(juego.jugador(), juego.mapa().celda(new Posicion(0,1)).contenido());
		assertEquals(null, juego.mapa().celda(new Posicion(1,1)).contenido());
	}

	@Test
	public void jugadorAvanzaDerechaTest() {
		Algocraft juego = new Algocraft(20, 20);
		Direccion nuevaPosicion = new DireccionDerecha();
		juego.avanzarJugador(nuevaPosicion);
		assertEquals(juego.jugador(), juego.mapa().celda(new Posicion(2,1)).contenido());
		assertEquals(null, juego.mapa().celda(new Posicion(1,1)).contenido());
	}
}