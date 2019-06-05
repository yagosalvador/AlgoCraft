public class Diamante extends Material{
    @Override
    public Enfrentable vs(Enfrentable enfrentable){
        return enfrentable.vs(this);
    }

    @Override
    public Enfrentable vs(Herramienta unaHerramienta){
		
		return;

    }

    @Override
    public Enfrentable vs(PicoFino unPicoFino){
		
        int fuerza = unPicoFino.getFuerza();

        this.durabilidad -= fuerza;
		
		return;

    }