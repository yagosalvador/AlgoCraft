import static org.junit.Assert.*;
import org.junit.Test;

public class DiamanteTest{
    @Test
    public void DiamanteInicializadaConDurabilidadCorrespondienteTest(){
        Material diamante = new Diamante();
        assertEquals(diamante.durabilidad(),100);
    }
}