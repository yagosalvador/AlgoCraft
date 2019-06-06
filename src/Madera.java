public class Madera extends Material{
    public Madera(){
        this.durabilidad = 10;
    }

    @Override
    public void vs(Hacha unHacha){
        double fuerza = unHacha.fuerza();
        this.durabilidad -= fuerza;
		unHacha.vs(this);
		return;
    }

    @Override
    public void vs(Pico unPico){
        unPico.vs(this);
        return;
    }
}