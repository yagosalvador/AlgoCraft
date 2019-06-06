public class DesgastePorCantidadDeGolpes implements ReglaDeDesgaste{
    int usos = 10;

    public DesgastePorCantidadDeGolpes(int usos){
        this.usos = usos;
    }
    
    @Override
    public int desgastar(int durabilidad, int desgastador){
        usos -= 1;
        if (usos < 1)
            return 0;
        return durabilidad;
    }

    public int usosRestantes(){
        return usos;
    }
}
