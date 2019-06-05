
public class PicoDePiedra extends Pico{

    private double multiploDeDesgaste = 2/3;
    ReglaDeDesgaste desgaste = DesgastePorMultiplo(multiploDeDesgaste);

    private int durabilidad = 200;
    private int fuerza = 5;
}