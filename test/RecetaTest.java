import static org.junit.Assert.*;

import Modelo.*;
import org.junit.Test;

public class RecetaTest{

    @Test
    public void CargaDeMaterialesARecetaTest(){
        Material madera = new Madera();
        Material unMaterial = null;
        Receta unaReceta = new Receta();

        unaReceta.ubicarMaterial(0,madera);

        unMaterial = unaReceta.materialEnPosicion(0);
        boolean sonIguales;
        sonIguales = unMaterial.esMismoMaterialQue(madera);

        assertEquals( true, sonIguales);
    }

    @Test
    public void DosRecetasIgualesSeComparanTest(){
        Material madera = new Madera();
        Material otraMadera = new Madera();
        Material metal = new Metal();
        Material otroMetal = new Metal();
        NoObject noObject = new NoObject();

        Receta unaReceta = new Receta();
        unaReceta.ubicarMaterial(0, madera);
        unaReceta.ubicarMaterial(1, madera);
        unaReceta.ubicarMaterial(2, madera);
        unaReceta.ubicarMaterial(4, metal);
        unaReceta.ubicarMaterial(5, metal);
        unaReceta.ubicarMaterial(6, madera);
        unaReceta.ubicarMaterial(7, metal);
        unaReceta.ubicarMaterial(8, madera);

        Receta otraReceta = new Receta();
        otraReceta.ubicarMaterial(0, otraMadera);
        otraReceta.ubicarMaterial(1, otraMadera);
        otraReceta.ubicarMaterial(2, otraMadera);
        otraReceta.ubicarMaterial(4, otroMetal);
        otraReceta.ubicarMaterial(5, otroMetal);
        otraReceta.ubicarMaterial(6, otraMadera);
        otraReceta.ubicarMaterial(7, otroMetal);
        otraReceta.ubicarMaterial(8, otraMadera);

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

        Receta unaReceta = new Receta();
        unaReceta.ubicarMaterial(0, madera);
        unaReceta.ubicarMaterial(1, madera);
        unaReceta.ubicarMaterial(2, madera);
        unaReceta.ubicarMaterial(4, metal);
        unaReceta.ubicarMaterial(5, metal);
        unaReceta.ubicarMaterial(6, madera);
        unaReceta.ubicarMaterial(7, metal);
        unaReceta.ubicarMaterial(8, madera);

        Receta otraReceta = new Receta();
        otraReceta.ubicarMaterial(1, otraMadera);
        otraReceta.ubicarMaterial(2, otraMadera);
        otraReceta.ubicarMaterial(4, otroMetal);
        otraReceta.ubicarMaterial(7, otroMetal);
        otraReceta.ubicarMaterial(8, otraMadera);

        boolean sonIguales;
        sonIguales = unaReceta.equals(otraReceta);
        assertEquals( false, sonIguales);
    }


}