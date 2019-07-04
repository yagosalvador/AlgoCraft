import static org.junit.Assert.*;
import org.junit.Test;

public class MaterialReduceSuDurabilidadAlSerExtraidoTest{

    @Test
    public void testMaderaReduceSuDurabilidadAlExtraerConHachaDeMadera() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 8;
        Material madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }
    @Test
    public void testMaderaReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 5;
        Material madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 0;
        Material madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 10;
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = 10;
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 10;
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoFino() {
        Herramienta pico = new PicoFino();
        int durabilidad = 10;
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraNoReduceSuDurabilidadAlExtraerConHachaDeMadera() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 30;
        Material piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraNoReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 30;
        Material piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraNoReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 30;
        Material piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 28;
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = 26;
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 18;
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoFino() {
        Herramienta pico = new PicoFino();
        int durabilidad = 10;
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConHachaDeMadera() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 50;
        Material metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 50;
        Material metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 50;
        Material metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 50;
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = 46;
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 38;
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalReduceSuDurabilidadAlExtraerConPicoFino() {
        Herramienta pico = new PicoFino();
        int durabilidad = 30;
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConHachaDeMadera() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 100;
        Material diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 100;
        Material diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 100;
        Material diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 100;
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = 100;
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 100;
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteReduceSuDurabilidadAlExtraerConPicoFino() {
        Herramienta pico = new PicoFino();
        int durabilidad = 80;
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

}