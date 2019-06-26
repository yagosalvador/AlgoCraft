import static org.junit.Assert.*;
import org.junit.Test;

public class InventarioTest{
	@Test
	public void inventarioInicializaConOnceElementosCargados(){
		Inventario inventario = new Inventario();
		assertEquals(11, inventario.size());
	}
	@Test
	public void cantidadGuardadaDeMaderaAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Material madera = new Madera();
		
		//inventario.agregarAlmacenable(madera);
		inventario.agregarElemento(madera);
		int unaCantidad = inventario.cantidadDeElemento("class Madera");
		assertEquals(1, unaCantidad);

		//inventario.agregarAlmacenable(madera);
		inventario.agregarElemento(madera);
		unaCantidad = inventario.cantidadDeElemento("class Madera");
		assertEquals(2, unaCantidad);

		//inventario.agregarAlmacenable(madera);
		inventario.agregarElemento(madera);
		unaCantidad = inventario.cantidadDeElemento("class Madera");
		assertEquals(3, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePiedraAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Material piedra = new Piedra();
		//inventario.agregarAlmacenable(piedra);
		inventario.agregarElemento(piedra);
		int unaCantidad = inventario.cantidadDeElemento("class Piedra");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeMetalAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Material metal = new Metal();
		//inventario.agregarAlmacenable(metal);
		inventario.agregarElemento(metal);
		int unaCantidad = inventario.cantidadDeElemento("class Metal");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeDiamanteAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Material diamante = new Diamante();
		//inventario.agregarAlmacenable(diamante);
		inventario.agregarElemento(diamante);
		int unaCantidad = inventario.cantidadDeElemento("class Diamante");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeHachaDeMaderaAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta hacha = new HachaDeMadera();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarElemento(hacha);
		int unaCantidad = inventario.cantidadDeElemento("class HachaDeMadera");
		assertEquals(1, unaCantidad);
	}
	
	@Test
	public void cantidadGuardadaDeHachaDePiedraAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta hacha = new HachaDePiedra();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarElemento(hacha);
		int unaCantidad = inventario.cantidadDeElemento("class HachaDePiedra");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeHachaDeMetalAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta hacha = new HachaDeMetal();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarElemento(hacha);
		int unaCantidad = inventario.cantidadDeElemento("class HachaDeMetal");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoDeMaderaAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoDeMadera();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarElemento(pico);
		int unaCantidad = inventario.cantidadDeElemento("class PicoDeMadera");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoDePiedraAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoDePiedra();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarElemento(pico);
		int unaCantidad = inventario.cantidadDeElemento("class PicoDePiedra");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoDeMetalAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoDeMetal();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarElemento(pico);
		int unaCantidad = inventario.cantidadDeElemento("class PicoDeMetal");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoFinoAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoFino();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarElemento(pico);
		int unaCantidad = inventario.cantidadDeElemento("class PicoFino");
		assertEquals(1, unaCantidad);
	}
	@Test
	public void devolverDurabilidadDeHachaDeMaderaEquipableTest(){
		Inventario inventario = new Inventario();
		Herramienta unHacha = new HachaDeMadera();
		Material madera = new Madera();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarElemento(unHacha);
		inventario.durabilidadDeElemento("class HachaDeMadera");
		Herramienta hacha = (Herramienta) inventario.usarElemento("class HachaDeMadera");
		int unaDurabilidad = hacha.durabilidad();
		assertEquals(100, unaDurabilidad);

		hacha.vs(madera);

		hacha = (Herramienta) inventario.usarElemento("class HachaDeMadera");
		unaDurabilidad = hacha.durabilidad();
		assertEquals(98, unaDurabilidad);

		Herramienta otroHacha = new HachaDeMadera();
		//inventario.agregarAlmacenable(otroHacha);
		inventario.agregarElemento(otroHacha);

		unaDurabilidad = hacha.durabilidad();
		assertEquals(98, unaDurabilidad);
	}
}