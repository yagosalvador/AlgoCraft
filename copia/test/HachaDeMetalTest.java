import static org.junit.Assert.*;
import org.junit.Test;

public class HachaDeMetalTest{
	@Test
	public void hachaDeMetalCreadoConDurabilidadYFuerzaCorrespondiente(){
		HachaDeMetal hacha = new HachaDeMetal();
		assertEquals(hacha.durabilidad(),400);
		assertEquals(hacha.fuerza(),10);
	}
}