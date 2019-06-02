import static org.junit.Assert.*;
import org.junit.Test;

public class HachaTest{
  @Test
  public void testDurabilidad() {
    Hacha hacha = new Hacha();
    hacha.setDurabilidad(5);
    int durabilidadPrueba = hacha.durabilidad();
    assertEquals(5,durabilidadPrueba);
  }
}