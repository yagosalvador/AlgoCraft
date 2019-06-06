public class Madera extends Material{
    public Madera(){
        this.durabilidad = 10;
    }

    public void vs(Hacha unHacha){
		
        double fuerza = unHacha.fuerza();

        this.durabilidad -= fuerza;
		
		return;

    }

    public void vs(Pico unPico){
        return;
    }
    
    public void vs(PicoFino unPicoFino){
		
        double fuerza = unPicoFino.fuerza();

        this.durabilidad -= fuerza;
		
		return;

    }
}