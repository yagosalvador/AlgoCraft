import static org.junit.Assert.*;
import org.junit.Test;

public class PicoFinoTest{
	@Test
	public void picoFinoCreadoConDurabilidadYFuerzaCorrespondiente(){
		PicoFino pico = new PicoFino();
		assertEquals(pico.durabilidad(),1000);
		assertEquals(pico.fuerza(),20);
	}
}