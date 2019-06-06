public abstract class Herramienta implements Enfrentable{
    protected double multiploDeDesgaste = 0;
    protected int fuerza = 0;
    protected int durabilidad = 0;
    protected ReglaDeDesgaste desgaste;

    public void setDurabilidad(int durabilidad){
        this.durabilidad = durabilidad;
    }

    public int durabilidad(){
        return this.durabilidad;
    }

    public int fuerza(){
        return this.fuerza;
    }

    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    public void desgastar(){
        durabilidad = desgaste.desgastar(durabilidad,fuerza);
    }
    @Override
    public void vs(Enfrentable rival){
        rival.vs(this);
        return;
    }
    @Override
    public void vs(Material rival){
        this.desgastar();
        System.out.println("Aca");
        rival.vs(this);
        return;
    }
    @Override
    public void vs(Herramienta rival){
        return;
    }
}