import static org.junit.Assert.*;
import org.junit.Test;

public class CreacionDeHerramientasTest{
    @Test
    public void CreacionDeHachaDeMaderaTest{
        MesaDeTrabajo mesa = MesaDeTrabajo new;
        Material madera = Madera new;
        mesa.ubicarMaterial(1, madera);
        mesa.ubicarMaterial(2, madera);
        mesa.ubicarMaterial(4, madera);
        mesa.ubicarMaterial(5, madera);
        mesa.ubicarMaterial(8, madera);
        Herramienta hachaConstruida = mesa.construirHerramienta();
        Herramienta unHacha = HachaDeMadera new;

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
    @Test
    public void CreacionDeHachaDePiedraTest{
        MesaDeTrabajo mesa = MesaDeTrabajo new;
        Material madera = Madera new;
        Material piedra = Piedra new;
        mesa.ubicarMaterial(1, piedra);
        mesa.ubicarMaterial(2, piedra);
        mesa.ubicarMaterial(4, piedra);
        mesa.ubicarMaterial(5, madera);
        mesa.ubicarMaterial(8, madera);
        Herramienta hachaConstruida = mesa.construirHerramienta();
        Herramienta unHacha = HachaDeMadera new;

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
    @Test
    public void CreacionDeHachaDeMetalTest{
        MesaDeTrabajo mesa = MesaDeTrabajo new;
        Material madera = Madera new;
        Material metal = Metal new;
        mesa.ubicarMaterial(1, metal);
        mesa.ubicarMaterial(2, metal);
        mesa.ubicarMaterial(4, metal);
        mesa.ubicarMaterial(5, madera);
        mesa.ubicarMaterial(8, madera);
        Herramienta hachaConstruida = mesa.construirHerramienta();
        Herramienta unHacha = HachaDeMadera new;

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
    @Test
    public void CreacionDePicoDeMaderaTest{
        MesaDeTrabajo mesa = MesaDeTrabajo new;
        Material madera = Madera new;
        mesa.ubicarMaterial(1, madera);
        mesa.ubicarMaterial(2, madera);
        mesa.ubicarMaterial(3, madera);
        mesa.ubicarMaterial(5, madera);
        mesa.ubicarMaterial(8, madera);
        Herramienta hachaConstruido = mesa.construirHerramienta();
        Herramienta unPico = PicoDeMadera new;

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
    @Test
    public void CreacionDePicoDePiedraTest{
        MesaDeTrabajo mesa = MesaDeTrabajo new;
        Material madera = Madera new;
        Material piedra = Piedra new;
        mesa.ubicarMaterial(1, piedra);
        mesa.ubicarMaterial(2, piedra);
        mesa.ubicarMaterial(3, piedra);
        mesa.ubicarMaterial(5, madera);
        mesa.ubicarMaterial(8, madera);
        Herramienta picoConstruido = mesa.construirHerramienta();
        Herramienta unPico = PicoDeMadera new;

        bool seConstruyoHacha = unPico.equals(hachaConstruida);
        assertEquals(true , seConstruyoPico);
    }
    @Test
    public void CreacionDePicoDeMetalTest{
        MesaDeTrabajo mesa = MesaDeTrabajo new;
        Material madera = Madera new;
        Material metal = Metal new;
        mesa.ubicarMaterial(1, metal);
        mesa.ubicarMaterial(2, metal);
        mesa.ubicarMaterial(3, metal);
        mesa.ubicarMaterial(5, madera);
        mesa.ubicarMaterial(8, madera);
        Herramienta picoConstruido = mesa.construirHerramienta();
        Herramienta unPico = PicoDeMadera new;

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());;
    }
    @Test
    public void CreacionDePicoFinoTest{
        MesaDeTrabajo mesa = MesaDeTrabajo new;
        Material madera = Madera new;
        Material metal = Metal new;
        mesa.ubicarMaterial(1, metal);
        mesa.ubicarMaterial(2, metal);
        mesa.ubicarMaterial(3, metal);
        mesa.ubicarMaterial(4, piedra);
        mesa.ubicarMaterial(5, madera);
        mesa.ubicarMaterial(8, madera);
        Herramienta picoConstruido = mesa.construirHerramienta();
        Herramienta unPico = PicoDeMadera new;

        assertEquals(unHacha.getClass(), hachaConstruida.getClass());
    }
}