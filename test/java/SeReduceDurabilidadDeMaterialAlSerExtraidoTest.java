// Que hacer con pico fino al romper la piedra en test

import static org.junit.Assert.*;
import org.junit.Test;

public class SeReduceDurabilidadDeMaterialAlSerExtraidoTest{

    @Test
    public void testUsarHachaDeMaderaSobreMaderaReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 8;
        Madera madera = new Madera();
        hacha.extraer(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreMaderaReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 5;
        Madera madera = new Madera();
        hacha.extraer(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreMaderaReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 0;
        Madera madera = new Madera();
        hacha.extraer(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreMaderaNoReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreMaderaNoReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreMaderaNoReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreMaderaNoReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 10;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = madera.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobrePiedraNoReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 30;
        Piedra piedra = new Piedra();
        hacha.extraer(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobrePiedraNoReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 30;
        Piedra piedra = new Piedra();
        hacha.extraer(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobrePiedraNoReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 30;
        Piedra piedra = new Piedra();
        hacha.extraer(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobrePiedraReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 28;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobrePiedraReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 26;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobrePiedraReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 18;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobrePiedraReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 0;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = piedra.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobreMetalNoReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 50;
        Metal metal = new Metal();
        hacha.extraer(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreMetalNoReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 50;
        Metal metal = new Metal();
        hacha.extraer(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreMetalNoReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 50;
        Metal metal = new Metal();
        hacha.extraer(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreMetalNoReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 50;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreMetalReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 46;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreMetalReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 38;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreMetalReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 0;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = metal.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobreDiamanteNoReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        hacha.extraer(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreDiamanteNoReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        hacha.extraer(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreDiamanteNoReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        hacha.extraer(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreDiamanteNoReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreDiamanteNoReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreDiamanteNoReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreDiamanteReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 10;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = diamante.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

}