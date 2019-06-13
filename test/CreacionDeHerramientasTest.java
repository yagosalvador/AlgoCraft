import static org.junit.Assert.*;
import org.junit.Test;

public class CreacionDeHerramientasTest{
    @Test
    public void CreacionDeHachaDeMaderaTest(){
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        Material madera = new Madera();
        mesa.ubicarMaterial(0, madera);
        mesa.ubicarMaterial(1, madera);
        mesa.ubicarMaterial(3, madera);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(7, madera);
        Herramienta hachaConstruida;
        hachaConstruida = mesa.construirHerramienta();
        Herramienta unHacha = new HachaDeMadera();

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
    @Test
    public void CreacionDeHachaDePiedraTest(){
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        Material madera = new Madera();
        Material piedra = new Piedra();
        mesa.ubicarMaterial(0, piedra);
        mesa.ubicarMaterial(1, piedra);
        mesa.ubicarMaterial(3, piedra);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(7, madera);
        Herramienta hachaConstruida = mesa.construirHerramienta();
        Herramienta unHacha = new HachaDePiedra();

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
    @Test
    public void CreacionDeHachaDeMetalTest(){
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        Material madera = new Madera();
        Material metal = new Metal();
        mesa.ubicarMaterial(0, metal);
        mesa.ubicarMaterial(1, metal);
        mesa.ubicarMaterial(3, metal);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(7, madera);
        Herramienta hachaConstruida = mesa.construirHerramienta();
        Herramienta unHacha = new HachaDeMetal();

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
    @Test
    public void CreacionDePicoDeMaderaTest(){
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        Material madera = new Madera();
        mesa.ubicarMaterial(0, madera);
        mesa.ubicarMaterial(1, madera);
        mesa.ubicarMaterial(2, madera);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(7, madera);
        Herramienta picoConstruido = mesa.construirHerramienta();
        Herramienta unPico = new PicoDeMadera();

        assertEquals(unPico.getClass(), picoConstruido.getClass());
    }
    @Test
    public void CreacionDePicoDePiedraTest(){
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        Material madera = new Madera();
        Material piedra = new Piedra();
        mesa.ubicarMaterial(0, piedra);
        mesa.ubicarMaterial(1, piedra);
        mesa.ubicarMaterial(2, piedra);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(7, madera);
        Herramienta picoConstruido = mesa.construirHerramienta();
        Herramienta unPico = new PicoDePiedra();

        assertEquals(unPico.getClass(), picoConstruido.getClass());
    }
    @Test
    public void CreacionDePicoDeMetalTest(){
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        Material madera = new Madera();
        Material metal = new Metal();
        mesa.ubicarMaterial(0, metal);
        mesa.ubicarMaterial(1, metal);
        mesa.ubicarMaterial(2, metal);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(7, madera);
        Herramienta picoConstruido = mesa.construirHerramienta();
        Herramienta unPico = new PicoDeMetal();

        assertEquals(unPico.getClass(), picoConstruido.getClass());
    }
    @Test
    public void CreacionDePicoFinoTest(){
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        mesa.ubicarMaterial(0, metal);
        mesa.ubicarMaterial(1, metal);
        mesa.ubicarMaterial(2, metal);
        mesa.ubicarMaterial(3, piedra);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(7, madera);
        Herramienta picoConstruido = mesa.construirHerramienta();
        Herramienta unPico = new PicoFino();

        assertEquals(unPico.getClass(), picoConstruido.getClass());
    }
}