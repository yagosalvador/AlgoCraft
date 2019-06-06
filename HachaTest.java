import static org.junit.Assert.*;
import org.junit.Test;

public class HachaTest{
  @Test
  public void testDurabilidad() {
    Hacha hacha = new HachaDeMadera();
    int durabilidad = 5;
    hacha.setDurabilidad(durabilidad);
    int durabilidadPrueba = hacha.durabilidad();
    assertEquals(durabilidad,durabilidadPrueba);
  }
  @Test
  public void testFuerza(){
  	Hacha hacha = new HachaDeMadera();
  	int fuerza = 3;
  	int fuerzaHacha = hacha.fuerza();
  	assertEquals(fuerza,fuerzaHacha);
  }
  @Test
  public void testHachaVsMaterial(){  //hacer para hacha vs cada material
  	Hacha hacha = new Hacha();
  	Material material = new Material();
  	int durabilidadHacha = hacha.durabilidad();
  	int durabilidadMaterial = material.durabilidad();
  	int fuerzaHacha = hacha.fuerza();
  	hacha.pelea(material);
  	assertEquals(hacha.durabilidad(),durabilidadHacha - fuerzaHacha);
  	assertEquals(material.durabilidad(),durabilidadMaterial - fuerzaHacha);
  }
}