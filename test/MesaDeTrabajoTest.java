import static org.junit.Assert.*;

import Modelo.Madera;
import Modelo.MesaDeTrabajo;
import Modelo.NoObject;
import Modelo.Receta;
import org.junit.Test;

public class MesaDeTrabajoTest {
    @Test
    public void InicializaConRecetaVaciaTest() {
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        NoObject noObject = new NoObject();
        Receta unaReceta = new Receta( );
        boolean equals = unaReceta.equals(mesa.espacioDeTrabajo());
        assertEquals(true, equals);
    }

    @Test
    public void CargarMaterialAlEspacioDeTrabajoTest() {
        MesaDeTrabajo mesa = new MesaDeTrabajo();
        NoObject noObject = new NoObject();
        Madera madera = new Madera();
        mesa.ubicarMaterial(0, madera);
        mesa.ubicarMaterial(4, madera);
        Receta unaReceta = new Receta();
        unaReceta.ubicarMaterial(0, madera);
        unaReceta.ubicarMaterial(4, madera);
        boolean equals = unaReceta.equals(mesa.espacioDeTrabajo());
        assertEquals(true, equals);
    }
}