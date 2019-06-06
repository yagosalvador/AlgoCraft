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
        this.durabilidad = desgaste.desgastar(durabilidad,fuerza);
    }
    @Override
    public void vs(Enfrentable rival){
        rival.vs(this);
        return;
    }
    @Override
    public void vs(Material rival){
        rival.vs(this);
        return;
    }
    @Override
    public void vs(Madera rival){
        this.desgastar();
        return;
    }
    @Override
    public void vs(Piedra rival){
        this.desgastar();
        return;
    }
    @Override
    public void vs(Metal rival){
        this.desgastar();
        return;
    }
    @Override
    public void vs(Diamante rival){
        this.desgastar();
        return;
    }
    @Override
    public void vs(Herramienta rival){
        return;
    }
    @Override
    public void vs(Hacha unHacha){
        return;
    }
    @Override
    public void vs(Pico unPico){
        return;
    }
}