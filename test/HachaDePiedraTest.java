import static org.junit.Assert.*;

import Modelo.HachaDePiedra;
import org.junit.Test;

public class HachaDePiedraTest{
	@Test
	public void hachaDePiedraCreadaConDurabilidadYFuerzaCorrespondiente(){
		HachaDePiedra hacha = new HachaDePiedra();
		assertEquals(hacha.durabilidad(),200);
		assertEquals(hacha.fuerza(),5);
	}
}