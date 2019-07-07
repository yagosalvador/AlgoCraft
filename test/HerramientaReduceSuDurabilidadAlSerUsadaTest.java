import static org.junit.Assert.*;

import Modelo.*;
import org.junit.Test;

public class HerramientaReduceSuDurabilidadAlSerUsadaTest{

    @Test
    public void testUsarHachaDeMaderaSobreMaderaReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 98;
        Material madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreMaderaReduceSuDurabilidad() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 195;
        Material madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreMaderaReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 395;
        Material madera = new Madera();
        hacha.vs(madera);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreMaderaReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 98;
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreMaderaReduceSuDurabilidad() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = (int)(200 - (4  * 0.6667));
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreMaderaReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 400;
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreMaderaNoReduceSuDurabilidad() {
        Herramienta pico = new PicoFino();
        int durabilidad = 1000;
        Material madera = new Madera();
        pico.vs(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobrePiedraReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 98;
        Material piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobrePiedraReduceSuDurabilidad() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 195;
        Material piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobrePiedraReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 395;
        Material piedra = new Piedra();
        hacha.vs(piedra);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobrePiedraReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 98;
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }
    @Test
    public void testUsarPicoDePiedraSobrePiedraReduceSuDurabilidad() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = (int)(200 - (4 / 1.5));
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobrePiedraReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 400;
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobrePiedraNoReduceSuDurabilidad() {
        Herramienta pico = new PicoFino();
        int durabilidad = 1000;
        Material piedra = new Piedra();
        pico.vs(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobreMetalReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 98;
        Material metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreMetalReduceSuDurabilidad() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 195;
        Material metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreMetalReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 395;
        Material metal = new Metal();
        hacha.vs(metal);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreMetalReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 98;
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreMetalReduceSuDurabilidad() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = (int)(200 - (4 / 1.5));
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreMetalReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 400;
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreMetalNoReduceSuDurabilidad() {
        Herramienta pico = new PicoFino();
        int durabilidad = 1000;
        Material metal = new Metal();
        pico.vs(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobreDiamanteReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMadera();
        int durabilidad = 98;
        Material diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreDiamanteReduceSuDurabilidad() {
        Herramienta hacha = new HachaDePiedra();
        int durabilidad = 195;
        Material diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreDiamanteReduceSuDurabilidad() {
        Herramienta hacha = new HachaDeMetal();
        int durabilidad = 395;
        Material diamante = new Diamante();
        hacha.vs(diamante);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreDiamanteReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMadera();
        int durabilidad = 98;
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }
    @Test
    public void testUsarPicoDePiedraSobreDiamanteReduceSuDurabilidad() {
        Herramienta pico = new PicoDePiedra();
        int durabilidad = (int)(200 - (4 / 1.5));
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreDiamanteReduceSuDurabilidad() {
        Herramienta pico = new PicoDeMetal();
        int durabilidad = 400;
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreDiamanteReduceSuDurabilidad() {
        Herramienta pico = new PicoFino();
        int durabilidad = 1000;
        Material diamante = new Diamante();
        pico.vs(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }
}