import static org.junit.Assert.*;

import Modelo.DesgastePorCantidadDeGolpes;
import org.junit.Test;

public class DesgastePorCantidadDeGolpesTest{
	@Test
	public void seDesgastaYVerificaQueLaDurabilidadQuedeIgualTest(){
		DesgastePorCantidadDeGolpes desgaste = new DesgastePorCantidadDeGolpes(5);
		int durabilidad = 10;
		int fuerza = 5;
		int durabilidadDesgastada = desgaste.desgastar(durabilidad,fuerza);
		assertEquals(durabilidadDesgastada,durabilidad);
	}
	@Test
	public void seDesgastaYVerificaQueDisminuyanLosUsosTest(){
		DesgastePorCantidadDeGolpes desgaste = new DesgastePorCantidadDeGolpes(5);
		int durabilidad = 10;
		int fuerza = 5;
		desgaste.desgastar(durabilidad,fuerza);
		assertEquals(4,desgaste.usosRestantes());
	}
}