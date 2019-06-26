import static org.junit.Assert.*;
import org.junit.Test;

public class QueueAlmacenableTest{
	@Test
	public void cantidadGuardadaDeAlmacenableAumentaAlGuardar(){
		QueueAlmacenable q = new QueueAlmacenable();
		Material madera = new Madera();

		q.agregarElemento(madera);
		int unTamaño = q.size();

		assertEquals(1, unTamaño);
	}
	@Test
	public void queueDevuelveDurabilidadDeUnHacha(){
		QueueAlmacenable q = new QueueAlmacenable();
		Herramienta hacha = new HachaDeMadera();

		q.agregarElemento(hacha);
		int unaDurabilidad = q.devolverDurabilidad();

		assertEquals(100, unaDurabilidad);
	}

	@Test
	public void queueDevuelveDurabilidadDelHachaUsable(){
		QueueAlmacenable q = new QueueAlmacenable();
		Herramienta hacha = new HachaDeMadera();
		Herramienta otroHacha = new HachaDeMadera();
		Material madera = new Madera();

		q.agregarElemento(hacha);
		q.agregarElemento(otroHacha);
		int unaDurabilidad = q.devolverDurabilidad();
		assertEquals(100, unaDurabilidad);

		Herramienta testHacha = (Herramienta) q.usarElemento();
		testHacha.vs(madera);
		
		unaDurabilidad = q.devolverDurabilidad();
		assertEquals(98, unaDurabilidad);
	}
}