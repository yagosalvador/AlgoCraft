// Que hacer con pico fino al romper la piedra en test

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
/*
    @Test
    public void testMaderaReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 5;
        Madera madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 0;
        Madera madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMaderaNoReduceSuDurabilidadAlExtraerConPicoFino() {
        PicoFino pico = new PicoFino();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraNoReduceSuDurabilidadAlExtraerConHachaDeMadera() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 30;
        Piedra piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraNoReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 30;
        Piedra piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraNoReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 30;
        Piedra piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 28;
        Piedra piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 26;
        Piedra piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 18;
        Piedra piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testPiedraReduceSuDurabilidadAlExtraerConPicoFino() {
        PicoFino pico = new PicoFino();
        int durabilidad = 0;
        Piedra piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConHachaDeMadera() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 50;
        Metal metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 50;
        Metal metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 50;
        Metal metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalNoReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 50;
        Metal metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 46;
        Metal metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 38;
        Metal metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testMetalReduceSuDurabilidadAlExtraerConPicoFino() {
        PicoFino pico = new PicoFino();
        int durabilidad = 0;
        Metal metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConHachaDeMadera() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConHachaDePiedra() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConHachaDeMetal() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConPicoDeMadera() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConPicoDePiedra() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteNoReduceSuDurabilidadAlExtraerConPicoDeMetal() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testDiamanteReduceSuDurabilidadAlExtraerConPicoFino() {
        PicoFino pico = new PicoFino();
        int durabilidad = 80;
        Diamante diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }
*/
}