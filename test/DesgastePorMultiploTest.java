import static org.junit.Assert.*;

import Modelo.DesgastePorMultiplo;
import org.junit.Test;

public class DesgastePorMultiploTest{
	@Test
	public void DesgastePorMultiploDe2Test(){
		DesgastePorMultiplo desgaste = new DesgastePorMultiplo(2);
		int durabilidad = 10;
		int fuerza = 2;
		int durabilidadDesgastada = desgaste.desgastar(durabilidad,fuerza);

		assertEquals(durabilidadDesgastada,6);
	}
	@Test
	public void DesgastePorMultiploFraccionarioTest(){
		DesgastePorMultiplo desgaste = new DesgastePorMultiplo(0.6666);
		int durabilidad = 10;
		int fuerza = 2;
		int durabilidadDesgastada = desgaste.desgastar(durabilidad,fuerza);

		assertEquals(8,durabilidadDesgastada);
	}
	@Test
	public void DesgastePorMultiploNuloTest(){
		DesgastePorMultiplo desgaste = new DesgastePorMultiplo(0);
		int durabilidad = 10;
		int fuerza = 2;
		int durabilidadDesgastada = desgaste.desgastar(durabilidad,fuerza);

		assertEquals(10,durabilidadDesgastada);
	}
	@Test
	public void DesgastePorNumeroNegativoDevuelveExcepcionTest(){
		DesgastePorMultiplo desgaste = new DesgastePorMultiplo(-1);

	}
}