public abstract class Herramienta implements Enfrentable, Almacenable{
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
        if(durabilidad <= 0){
            return;
        }
        rival.vs(this);
    }
    @Override
    public void vs(Material rival){ rival.vs(this); }
    @Override
    public void vs(Herramienta rival){ }
    @Override
    public void vs(Hacha unHacha){ }
    @Override
    public void vs(Pico unPico){ }
    @Override
    public void vs(PicoFino pico){ }
    @Override
    public void vs(PicoDeMadera unPico){ }
    @Override
    public void vs(PicoDeMetal unPico){ }
    @Override
    public void vs(PicoDePiedra unPico){ }

    public boolean roto(){
        if (durabilidad <= 0) {
            return true;
        }
        return false;
    }
}