public class Diamante extends Material{

    public Diamante(){
        this.durabilidad = 100;
    }
    @Override
    public void vs(Hacha hacha){ hacha.vs(this); }
    @Override
    public void vs(Pico pico){ pico.vs(this); }
    @Override
    public void vs(PicoFino pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
    }
}