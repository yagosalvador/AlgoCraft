import static org.junit.Assert.*;
import org.junit.Test;

public class HachaDeMaderaTest{
	@Test
	public void hachaDeMaderaCreadoConDurabilidadYFuerzaCorrespondienteTest(){
		HachaDeMadera hacha = new HachaDeMadera();
		assertEquals(hacha.durabilidad(),100);
		assertEquals(hacha.fuerza(),2);
	}
}