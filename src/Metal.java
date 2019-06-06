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

    public void vs(PicoDeMadera unPico){
        unPico.vs(this);
        return;
    }

    public void vs(PicoDePiedra unPico){
        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }

    public void vs(PicoDeMetal unPico){
        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }

    public void vs(PicoFino unPico){
        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }

    public void vs(Pico unPico){
        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }
}