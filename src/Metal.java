public class Metal extends Material{

    public Metal(){
        this.durabilidad = 50;
    }

    @Override
    public void vs(Enfrentable enfrentable){
        enfrentable.vs(this);
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
    public void vs(PicoDeMadera unPico){
        return;
    }
    @Override
    public void vs(PicoDePiedra unPico){
        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        return;
    }
    @Override
    public void vs(PicoDeMetal unPico){
        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        return;
    }
    @Override
    public void vs(PicoFino unPico){
        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        return;
    }
}