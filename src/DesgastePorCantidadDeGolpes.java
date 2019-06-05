public class DesgastePorCantidadDeGolpes implements ReglaDeDesgaste{
    int usos = 10;

    public DesgastePorCantidadDeGolpes(int usos){
        this.usos = usos;
    }

    public int desgastar(int durabilidad, int fuerza){
        usos -= 1;
        if (usos < 1)
            return 0;
        return durabilidad;
    }

    public int usos(){
        return usos;
    }
}
