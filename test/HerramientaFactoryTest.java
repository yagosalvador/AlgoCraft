import Modelo.Madera;
import Modelo.Material;
import Modelo.NoObject;
import org.junit.Test;

public class HerramientaFactoryTest {
    @Test
    public void CreacionDeHachaDeMaderaTest() {
        //HerramientaFactory factory = new HerramientaFactory();
        Material madera = new Madera();
        Material noObject = new NoObject();
        //Modelo.Receta recetaHachaDeMadera = new Modelo.Receta( madera, madera, noObject, madera, madera, noObject, noObject, madera, noObject);
       // Modelo.Herramienta herramienta = factory.construirHerramienta(recetaHachaDeMadera);
       // assertEquals(true, herramienta instanceof Modelo.HachaDeMadera);
    }
/*
    @Test
    public void CreacionDeHachaDePiedraTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Modelo.Material madera = new Modelo.Madera();
        Modelo.Material piedra = new Modelo.Piedra();
        Modelo.Material noObject = new Modelo.NoObject();
        Modelo.Receta recetaHachaDePiedra = new Modelo.Receta( piedra, piedra, noObject, piedra, madera, noObject, noObject, madera, noObject);
        Modelo.Herramienta herramienta = factory.construirHerramienta(recetaHachaDePiedra);
        assertEquals(true, herramienta instanceof Modelo.HachaDePiedra);
    }

    @Test
    public void CreacionDeHachaDeMetalTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Modelo.Material madera = new Modelo.Madera();
        Modelo.Material metal = new Modelo.Metal();
        Modelo.Material noObject = new Modelo.NoObject();
        Modelo.Receta recetaHachaDeMetal = new Modelo.Receta( metal, metal, noObject, metal, madera, noObject, noObject, madera, noObject);
        Modelo.Herramienta herramienta = factory.construirHerramienta(recetaHachaDeMetal);
        assertEquals(true, herramienta instanceof Modelo.HachaDeMetal);
    }

    @Test
    public void CreacionDePicoDeMaderaTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Modelo.Material madera = new Modelo.Madera();
        Modelo.Material noObject = new Modelo.NoObject();
        Modelo.Receta recetaPicoDeMadera = new Modelo.Receta( madera, madera, madera, noObject, madera, noObject, noObject, madera, noObject);
        Modelo.Herramienta herramienta = factory.construirHerramienta(recetaPicoDeMadera);
        assertEquals(true, herramienta instanceof Modelo.PicoDeMadera);
    }

    @Test
    public void CreacionDePicoDeMetalTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Modelo.Material madera = new Modelo.Madera();
        Modelo.Material metal = new Modelo.Metal();
        Modelo.Material noObject = new Modelo.NoObject();
        Modelo.Receta recetaPicoDeMetal = new Modelo.Receta( metal, metal, metal, noObject, madera, noObject, noObject, madera, noObject);
        Modelo.Herramienta herramienta = factory.construirHerramienta(recetaPicoDeMetal);
        assertEquals(true, herramienta instanceof Modelo.PicoDeMetal);
    }

    @Test
    public void CreacionDePicoDePiedraTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Modelo.Material madera = new Modelo.Madera();
        Modelo.Material piedra = new Modelo.Piedra();
        Modelo.Material noObject = new Modelo.NoObject();
        Modelo.Receta recetaPicoDePiedra = new Modelo.Receta( piedra, piedra, piedra, noObject, madera, noObject, noObject, madera, noObject);
        Modelo.Herramienta herramienta = factory.construirHerramienta(recetaPicoDePiedra);
        assertEquals(true, herramienta instanceof Modelo.PicoDePiedra);
    }

    @Test
    public void CreacionDePicoFinoTest() {
        HerramientaFactory factory = new HerramientaFactory();
        Modelo.Material madera = new Modelo.Madera();
        Modelo.Material piedra = new Modelo.Piedra();
        Modelo.Material metal = new Modelo.Metal();
        Modelo.Material noObject = new Modelo.NoObject();
        Modelo.Receta recetaPicoFino = new Modelo.Receta( metal, metal, metal, piedra, madera, noObject, noObject, madera, noObject);
        Modelo.Herramienta herramienta = factory.construirHerramienta(recetaPicoFino);
        assertEquals(true, herramienta instanceof Modelo.PicoFino);
    }
*/
}