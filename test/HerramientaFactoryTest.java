import static org.junit.Assert.*;
import org.junit.Test;

public class HerramientaFactoryTest {
    @Test
    public void CreacionDeHachaDeMaderaTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material noObject = new NoObject();
        Receta recetaHachaDeMadera = new Receta( madera, madera, noObject, madera, madera, noObject, noObject, madera, noObject);
        Herramienta herramienta = factory.construirHerramienta(recetaHachaDeMadera);
        assertEquals(true, herramienta instanceof HachaDeMadera);
    }

    @Test
    public void CreacionDeHachaDePiedraTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material noObject = new NoObject();
        Receta recetaHachaDePiedra = new Receta( piedra, piedra, noObject, piedra, madera, noObject, noObject, madera, noObject);
        Herramienta herramienta = factory.construirHerramienta(recetaHachaDePiedra);
        assertEquals(true, herramienta instanceof HachaDePiedra);
    }

    @Test
    public void CreacionDeHachaDeMetalTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material metal = new Metal();
        Material noObject = new NoObject();
        Receta recetaHachaDeMetal = new Receta( metal, metal, noObject, metal, madera, noObject, noObject, madera, noObject);
        Herramienta herramienta = factory.construirHerramienta(recetaHachaDeMetal);
        assertEquals(true, herramienta instanceof HachaDeMetal);
    }

    @Test
    public void CreacionDePicoDeMaderaTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material noObject = new NoObject();
        Receta recetaPicoDeMadera = new Receta( madera, madera, madera, noObject, madera, noObject, noObject, madera, noObject);
        Herramienta herramienta = factory.construirHerramienta(recetaPicoDeMadera);
        assertEquals(true, herramienta instanceof PicoDeMadera);
    }

    @Test
    public void CreacionDePicoDeMetalTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material metal = new Metal();
        Material noObject = new NoObject();
        Receta recetaPicoDeMetal = new Receta( metal, metal, metal, noObject, madera, noObject, noObject, madera, noObject);
        Herramienta herramienta = factory.construirHerramienta(recetaPicoDeMetal);
        assertEquals(true, herramienta instanceof PicoDeMetal);
    }

    @Test
    public void CreacionDePicoDePiedraTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material noObject = new NoObject();
        Receta recetaPicoDePiedra = new Receta( piedra, piedra, piedra, noObject, madera, noObject, noObject, madera, noObject);
        Herramienta herramienta = factory.construirHerramienta(recetaPicoDePiedra);
        assertEquals(true, herramienta instanceof PicoDePiedra);
    }

    @Test
    public void CreacionDePicoFinoTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Material noObject = new NoObject();
        Receta recetaPicoFino = new Receta( metal, metal, metal, piedra, madera, noObject, noObject, madera, noObject);
        Herramienta herramienta = factory.construirHerramienta(recetaPicoFino);
        assertEquals(true, herramienta instanceof PicoFino);
    }
}