public class Madera extends Material{
    public Madera(){
        this.durabilidad = 10;
    }
    @Override
    public void vs(Enfrentable enfrentable){
        enfrentable.vs(this);
        return;
    }
    @Override
    public void vs(Hacha unHacha){
		
        double fuerza = unHacha.fuerza();

        this.durabilidad -= fuerza;
		
		return;

    }
    @Override
    public void vs(Pico unPico){
        return;
    }
    
    public void vs(PicoFino unPicoFino){
		
        double fuerza = unPicoFino.fuerza();

        this.durabilidad -= fuerza;
		
		return;

    }
}