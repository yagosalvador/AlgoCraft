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
		inventario.agregarMadera(madera);
		int unaCantidad = inventario.cantidadDeMadera();
		assertEquals(1, unaCantidad);

		//inventario.agregarAlmacenable(madera);
		inventario.agregarMadera(madera);
		unaCantidad = inventario.cantidadDeMadera();
		assertEquals(2, unaCantidad);

		//inventario.agregarAlmacenable(madera);
		inventario.agregarMadera(madera);
		unaCantidad = inventario.cantidadDeMadera();
		assertEquals(3, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePiedraAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Material piedra = new Piedra();
		//inventario.agregarAlmacenable(piedra);
		inventario.agregarPiedra(piedra);
		int unaCantidad = inventario.cantidadDePiedra();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeMetalAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Material metal = new Metal();
		//inventario.agregarAlmacenable(metal);
		inventario.agregarMetal(metal);
		int unaCantidad = inventario.cantidadDeMetal();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeDiamanteAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Material diamante = new Diamante();
		//inventario.agregarAlmacenable(diamante);
		inventario.agregarDiamante(diamante);
		int unaCantidad = inventario.cantidadDeDiamante();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeHachaDeMaderaAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta hacha = new HachaDeMadera();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarHachaDeMadera(hacha);
		int unaCantidad = inventario.cantidadDeHachaDeMadera();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeHachaDePiedraAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta hacha = new HachaDePiedra();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarHachaDePiedra(hacha);
		int unaCantidad = inventario.cantidadDeHachaDePiedra();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDeHachaDeMetalAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta hacha = new HachaDeMetal();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarHachaDeMetal(hacha);
		int unaCantidad = inventario.cantidadDeHachaDeMetal();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoDeMaderaAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoDeMadera();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarPicoDeMadera(pico);
		int unaCantidad = inventario.cantidadDePicoDeMadera();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoDePiedraAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoDePiedra();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarPicoDePiedra(pico);
		int unaCantidad = inventario.cantidadDePicoDePiedra();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoDeMetalAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoDeMetal();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarPicoDeMetal(pico);
		int unaCantidad = inventario.cantidadDePicoDeMetal();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void cantidadGuardadaDePicoFinoAumentaAlGuardarTest(){
		Inventario inventario = new Inventario();
		Herramienta pico = new PicoFino();
		//inventario.agregarAlmacenable(pico);
		inventario.agregarPicoFino(pico);
		int unaCantidad = inventario.cantidadDePicoFino();
		assertEquals(1, unaCantidad);
	}
	@Test
	public void devolverDurabilidadDeHachaDeMaderaEquipableTest(){
		Inventario inventario = new Inventario();
		Herramienta unHacha = new HachaDeMadera();
		Material madera = new Madera();
		//inventario.agregarAlmacenable(hacha);
		inventario.agregarHachaDeMadera(unHacha);
		inventario.durabilidadHachaDeMadera();
		Herramienta hacha = (Herramienta) inventario.usarHachaDeMadera();
		int unaDurabilidad = hacha.durabilidad();
		assertEquals(100, unaDurabilidad);

		hacha.vs(madera);

		hacha = (Herramienta) inventario.usarHachaDeMadera();
		unaDurabilidad = hacha.durabilidad();
		assertEquals(98, unaDurabilidad);

		Herramienta otroHacha = new HachaDeMadera();
		//inventario.agregarAlmacenable(otroHacha);
		inventario.agregarHachaDeMadera(otroHacha);

		unaDurabilidad = hacha.durabilidad();
		assertEquals(98, unaDurabilidad);
	}
}