public class Metal extends Material{
    @Override
    public Enfrentable vs(Enfrentable enfrentable){
        return enfrentable.vs(this);
    }

    @Override
    public Enfrentable vs(Hacha unHacha){
		
		return;

    }

    @Override
    public Enfrentable vs(PicoDeMadera unPico){
		
        return;
    }
    
	@Override
    public Enfrentable vs(PicoDePiedra unPico){
		
        int fuerza = unPico.getFuerza();

        this.durabilidad -= fuerza;
		
		return;

    }

	@Override
    public Enfrentable vs(PicoFino unPicoFino){
		
        int fuerza = unPicoFino.getFuerza();

        this.durabilidad -= fuerza;
		
		return;

    }
}