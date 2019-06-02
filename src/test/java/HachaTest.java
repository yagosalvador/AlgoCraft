import static org.junit.Assert.*;
import org.junit.Test;

public class HachaTest{
  @Test
  public void testDurabilidad() {
    Hacha hacha = new Hacha();
    int durabilidad = 5;
    hacha.setDurabilidad(durabilidad);
    int durabilidadPrueba = hacha.durabilidad();
    assertEquals(durabilidad,durabilidadPrueba);
  }
}