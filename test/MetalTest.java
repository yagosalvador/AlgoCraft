import static org.junit.Assert.*;

import Modelo.Material;
import Modelo.Metal;
import org.junit.Test;

public class MetalTest{
    @Test
    public void MetalInicializadaConDurabilidadCorrespondienteTest(){
        Material metal = new Metal();
        assertEquals(metal.durabilidad(),50);
    }
}