public class Metal extends Material{

    public Metal(){
        this.durabilidad = 50;
    }

    @Override
    public void vs(Enfrentable enfrentable){
        enfrentable.vs(this);
        return;
    }

    public void vs(Hacha unHacha){
		
		return;

    }

    public void vs(PicoDeMadera unPico){
		
        return;
    }
    
    public void vs(Pico unPico){
		
        double fuerza = unPico.fuerza();

        this.durabilidad -= fuerza;
		
		return;

    }
}