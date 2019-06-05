public class DesgastePorMultiplo implements ReglaDeDesgaste{

    private double multiplo;
    
    public DesgastePorMultiplo(double multiplo){ this.multiplo = multiplo; }

    public int desgastar(int durabilidad, int desgastador){
        return ( durabilidad - (desgastador*multiplo) );
    }
}