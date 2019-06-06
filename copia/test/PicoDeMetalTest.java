import static org.junit.Assert.*;
import org.junit.Test;

public class PicoDeMetalTest{
	@Test
	public void picoDeMetalCreadoConDurabilidadYFuerzaCorrespondiente(){
		PicoDeMetal pico = new PicoDeMetal();
		assertEquals(pico.durabilidad(),400);
		assertEquals(pico.fuerza(),10);
	}
}