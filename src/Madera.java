public class Madera extends Material{
    @Override
    public Enfrentable vs(Enfrentable enfrentable){
        return enfrentable.vs(this);
    }

    @Override
    public Enfrentable vs(Hacha unHacha){
		
        int fuerza = unHacha.getFuerza();

        this.durabilidad -= fuerza;
		
		return;

    }

    @Override
    public Enfrentable vs(Pico unPico){
		
        return;
    }
    
	@Override
    public Enfrentable vs(PicoFino unPicoFino){
		
        int fuerza = unPicoFino.getFuerza();

        this.durabilidad -= fuerza;
		
		return;

    }
}