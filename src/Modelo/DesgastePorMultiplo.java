package Modelo;

public class DesgastePorMultiplo implements ReglaDeDesgaste{
    private double multiplo;
    public DesgastePorMultiplo(double multiplo){ this.multiplo = multiplo; }

    @Override
    public int desgastar(int durabilidad, int desgastador){
        return ( (int)(durabilidad - (desgastador*multiplo)) );
    }
}