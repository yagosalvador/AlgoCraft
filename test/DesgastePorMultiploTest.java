import static org.junit.Assert.*;
import org.junit.Test;

public class DesgastePorMultiploTest{
	@Test
	public void desgastePorMultiploDe2Test(){
		DesgastePorMultiplo desgaste = new DesgastePorMultiplo(2);
		int durabilidad = 10;
		int fuerza = 2;
		int durabilidadDesgastada = desgaste.desgastar(durabilidad,fuerza);

		assertEquals(durabilidadDesgastada,6);
	}
}