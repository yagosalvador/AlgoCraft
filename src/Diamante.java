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
    @Override
    public void vs(Hacha unHacha){
        unHacha.vs(this);
        return;
    }
    @Override
    public void vs(Pico unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoFino unPicoFino){
		
        double fuerza = unPicoFino.fuerza();
        this.durabilidad -= fuerza;
        unPicoFino.vs(this);

        return;
    }
}