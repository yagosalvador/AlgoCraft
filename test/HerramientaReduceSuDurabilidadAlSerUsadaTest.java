import static org.junit.Assert.*;
import org.junit.Test;

public class HerramientaReduceSuDurabilidadAlSerUsadaTest{

    @Test
    public void testUsarHachaDeMaderaSobreMaderaReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 98;
        Madera madera = new Madera();
        hacha.extraer(madera);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreMaderaReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 195;
        Madera madera = new Madera();
        hacha.extraer(madera);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreMaderaReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 390;
        Madera madera = new Madera();
        hacha.extraer(madera);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreMaderaReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 98;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreMaderaReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 196;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreMaderaReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 388;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreMaderaNoReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 1000;
        Madera madera = new Madera();
        pico.extraer(madera);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobrePiedraReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 98;
        Piedra piedra = new Piedra();
        hacha.extraer(piedra);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobrePiedraReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 195;
        Piedra piedra = new Piedra();
        hacha.extraer(piedra);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobrePiedraReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 390;
        Piedra piedra = new Piedra();
        hacha.extraer(piedra);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobrePiedraReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 98;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobrePiedraReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 196;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobrePiedraReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 388;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobrePiedraNoReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 1000;
        Piedra piedra = new Piedra();
        pico.extraer(piedra);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobreMetalReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 98;
        Metal metal = new Metal();
        hacha.extraer(metal);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreMetalReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 195;
        Metal metal = new Metal();
        hacha.extraer(metal);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreMetalReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 390;
        Metal metal = new Metal();
        hacha.extraer(metal);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreMetalReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 98;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreMetalReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 196;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreMetalReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 388;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreMetalNoReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 1000;
        Metal metal = new Metal();
        pico.extraer(metal);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMaderaSobreDiamanteReduceSuDurabilidad() {
        HachaDeMadera hacha = new HachaDeMadera();
        int durabilidad = 98;
        Diamante diamante = new Diamante();
        hacha.extraer(diamante);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDePiedraSobreDiamanteReduceSuDurabilidad() {
        HachaDePiedra hacha = new HachaDePiedra();
        int durabilidad = 195;
        Diamante diamante = new Diamante();
        hacha.extraer(diamante);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarHachaDeMetalSobreDiamanteReduceSuDurabilidad() {
        HachaDeMetal hacha = new HachaDeMetal();
        int durabilidad = 390;
        Diamante diamante = new Diamante();
        hacha.extraer(diamante);
        int durabilidadPrueba = hacha.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMaderaSobreDiamanteReduceSuDurabilidad() {
        PicoDeMadera pico = new PicoDeMadera();
        int durabilidad = 98;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDePiedraSobreDiamanteReduceSuDurabilidad() {
        PicoDePiedra pico = new PicoDePiedra();
        int durabilidad = 196;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoDeMetalSobreDiamanteReduceSuDurabilidad() {
        PicoDeMetal pico = new PicoDeMetal();
        int durabilidad = 388;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

    @Test
    public void testUsarPicoFinoSobreDiamanteReduceSuDurabilidad() {
        PicoFino pico = new PicoFino();
        int durabilidad = 100;
        Diamante diamante = new Diamante();
        pico.extraer(diamante);
        int durabilidadPrueba = pico.durabilidad();
        assertEquals(durabilidad,durabilidadPrueba);
    }

}