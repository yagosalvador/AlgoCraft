import static org.junit.Assert.*;
import org.junit.Test;

public class PicoDePiedraTest{
	@Test
	public void picoDePiedraCreadoConDurabilidadYFuerzaCorrespondiente(){
		PicoDePiedra pico = new PicoDePiedra();
		assertEquals(pico.durabilidad(),200);
		assertEquals(pico.fuerza(),5);
	}
}