import static org.junit.Assert.*;
import org.junit.Test;

public class RecetaTest{
    @Test
    public void DosRecetasIgualesSeComparanTest(){
        Material madera = new Madera();
        Material otraMadera = new Madera();
        Material metal = new Metal();
        Material otroMetal = new Metal();
        NoObject noObject = new NoObject();
        Receta unaReceta = new Receta( madera, madera, madera, noObject, metal, metal, madera, metal, madera);
        Receta otraReceta = new Receta( otraMadera, otraMadera, otraMadera, noObject, otroMetal, otroMetal, otraMadera, otroMetal, otraMadera);
        boolean sonIguales;
        sonIguales = unaReceta.equals(otraReceta);
        assertEquals( true, sonIguales);
    }
    @Test
    public void DosRecetasDistintasSeComparanTest(){
        Material madera = new Madera();
        Material otraMadera = new Madera();
        Material metal = new Metal();
        Material otroMetal = new Metal();
        NoObject noObject = new NoObject();
        Receta unaReceta = new Receta( madera, madera, madera, noObject, metal, metal, madera, metal, madera);
        Receta otraReceta = new Receta( noObject, otroMetal, otraMadera, noObject, noObject, metal, otraMadera, metal, otraMadera);
        boolean sonIguales;
        sonIguales = unaReceta.equals(otraReceta);
        assertEquals( false, sonIguales);
    }
    @Test
    public void CargaDeMaterialesARecetaTest(){
        Material madera = new Madera();
        Material otraMadera = new Madera();
        Material metal = new Metal();
        Material otroMetal = new Metal();
        NoObject noObject = new NoObject();
        Receta unaReceta = new Receta( noObject, noObject, noObject, noObject, noObject, noObject, noObject, noObject, noObject);
        unaReceta.ubicarMaterial(0,otraMadera);
        unaReceta.ubicarMaterial(1,otraMadera);
        unaReceta.ubicarMaterial(2,otraMadera);
        unaReceta.ubicarMaterial(4,otroMetal);
        unaReceta.ubicarMaterial(5,otroMetal);
        unaReceta.ubicarMaterial(6,otraMadera);
        unaReceta.ubicarMaterial(7,otroMetal);
        unaReceta.ubicarMaterial(8,otraMadera);
        Receta otraReceta = new Receta( otraMadera, otraMadera, otraMadera, noObject, otroMetal, otroMetal, otraMadera, otroMetal, otraMadera);
        boolean sonIguales;
        sonIguales = unaReceta.equals(otraReceta);
        assertEquals( true, sonIguales);
    }
}