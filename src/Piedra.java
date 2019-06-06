public class Piedra extends Material{

    public Piedra(){
        this.durabilidad = 30;
    }
    @Override
    public void vs(Enfrentable enfrentable){
        enfrentable.vs(this);
        return;
    }
    @Override
    public void vs(Hacha unHacha){
		
		return;

    }
    @Override
    public void vs(Pico unPico){
		
		double fuerza = unPico.fuerza();

        this.durabilidad -= fuerza;
		
        return;
    }
}