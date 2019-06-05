//Las herramientas tienen una ReglaDeDesgaste que es quien tiene
//el metodo para procesar el desgaste
public abstract class Pico {

    public void desgastar(){
        durabilidad = desgaste.procesar(durabilidad,fuerza);
    }
}

public class PicoDeMadera extends Pico{

    private double multiploDeDesgaste = 1;
    ReglaDeDesgaste desgaste = DesgastePorMultiplo(multiploDeDesgaste);

    private int durabilidad = 100;
    private int fuerza = 2;
}

public class PicoDePiedra extends Pico{

    private double multiploDeDesgaste = 2/3;
    ReglaDeDesgaste desgaste = DesgastePorMultiplo(multiploDeDesgaste);

    private int durabilidad = 200;
    private int fuerza = 5;
}

public class PicoDeMetal extends Pico{

    ReglaDeDesgaste desgaste = DesgastePorCantidadDeUsos;

    private int durabilidad = 400;
    private int fuerza = 10;
}

public class PicoFino extends Pico{
    private double multiploDeDesgaste = 0.1;
    ReglaDeDesgaste desgaste = DesgasteParaPicoFino(multiploDeDesgaste);
}