import static org.junit.Assert.*;
import org.junit.Test;

public class DiamanteTest{
    @Test
    public void DiamanteInicializadaConDurabilidadCorrespondienteTest(){
        Material diamante = new Diamante();
        assertEquals(diamante.durabilidad(),100);
    }
    @Test
    public void DosInstanciasDeDiamanteSonDeLaMismaClaseTest(){
        Material unDiamante = new Diamante();
        Material otroDiamante = new Diamante();
        boolean equals = unDiamante.esMismoMaterialQue(otroDiamante);
        assertEquals(equals, true);
    }
}