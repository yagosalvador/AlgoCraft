import static org.junit.Assert.*;
import org.junit.Test;

public class HachaDeMaderaTest{
	@Test
	public void hachaDeMaderaCreadoConDurabilidadYFuerzaCorrespondienteTest(){
		HachaDeMadera hacha = new HachaDeMadera();
		assertEquals(hacha.durabilidad(),100);
		assertEquals(hacha.fuerza(),2);
	}
	@Test
	public void hachaDeMaderaDevuelveSuRecetaCorrectamente(){
		Material madera = new Madera();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, madera);
		receta.ubicarMaterial(1, madera);
		receta.ubicarMaterial(3, madera);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		Receta otraReceta = new Receta();
		boolean equals = receta.equals(HachaDeMadera.getReceta());
		assertEquals(equals, true);
	}
}