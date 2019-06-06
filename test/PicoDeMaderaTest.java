import static org.junit.Assert.*;
import org.junit.Test;

public class PicoDeMaderaTest{
	@Test
	public void picoDeMaderaCreadoConDurabilidadYFuerzaCorrespondiente(){
		PicoDeMadera pico = new PicoDeMadera();
		assertEquals(pico.durabilidad(),100);
		assertEquals(pico.fuerza(),2);
	}
	@Test
	public void picoDeMaderaDisminuyeDurabilidadAlUsarse(){
		PicoDeMadera pico = new PicoDeMadera();
		pico.desgastar();
		int durabilidadEsperada = 100;
		assertEquals(98,pico.durabilidad());
	}
}