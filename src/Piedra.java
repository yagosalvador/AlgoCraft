public class Piedra extends Material{
    public Piedra(){
        this.durabilidad = 30;
    }
    @Override
    public void vs(Pico pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
        pico.vs(this);
        return;
    }
    @Override
    public void vs(Hacha hacha){
        hacha.vs(this);
        return;
    }
}