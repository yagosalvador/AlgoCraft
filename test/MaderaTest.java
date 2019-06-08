import static org.junit.Assert.*;
import org.junit.Test;

public class MaderaTest{
    @Test
    public void MaderaCreadaConDurabilidadCorrespondienteTest(){
        Material madera = new Madera();
        assertEquals(madera.durabilidad(),10);
    }
}