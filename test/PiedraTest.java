import static org.junit.Assert.*;
import org.junit.Test;

public class PiedraTest{
    @Test
    public void PiedraInicializadaConDurabilidadCorrespondienteTest(){
        Material piedra = new Piedra();
        assertEquals(piedra.durabilidad(),30);
    }
}