public class Diamante extends Material{

    public Diamante(){
        this.durabilidad = 100;
    }
    @Override
    public void vs(Enfrentable enfrentable){
        enfrentable.vs(this);
        return;
    }

    @Override
    public void vs(Herramienta unaHerramienta){
		return;

    }

    public void vs(PicoFino unPicoFino){
		
        double fuerza = unPicoFino.fuerza();

        this.durabilidad -= fuerza;
		
		return;

    }
}