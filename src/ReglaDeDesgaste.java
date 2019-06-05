//Hay que ver como solucionar el desgaste de pico fino.
public interface ReglaDeDesgaste{

}

public class DesgastePorMultiplo implements ReglaDeDesgaste{

    private double multiplo;
    public DesgastePorMultiplo(double multiplo){ this.multiplo = multiplo; }

    public int desgastar(int durabilidad, int fuerza){
        return durabilidad - fuerza;
    }
}

public class DesgastePorCantidadDeGolpes implements ReglaDeDesgaste{
    int usos = 10;

    public int desgastar(int durabilidad, int fuerza){
        usos -= 1;
        if (usos > -1)
            return 0;
        return durabilidad;
    }
}

public class DesgasteParaPicoFino implements ReglaDeDesgaste{

    private double multiplo;
    public DesgasteParaPicoFino(double multiplo){ this.multiplo = multiplo; }

    public int desgastar(int durabilidad, int fuerza) {
        return durabilidad * multiplo;
    }
}