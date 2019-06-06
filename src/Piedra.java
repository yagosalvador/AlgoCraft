public class Piedra extends Material{
    public Piedra(){
        this.durabilidad = 30;
    }
    /*@Override
    public void vs(Enfrentable enfrentable){
        enfrentable.vs(this);
        return;
    }*/
    @Override
    public void vs(Hacha unHacha){
        unHacha.vs(this);
        return;
    }

    @Override
    public void vs(PicoDeMadera unPico){

        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDePiedra unPico){

        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDeMetal unPico){

        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoFino unPico){

        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(Pico unPico){

        double fuerza = unPico.fuerza();
        this.durabilidad -= fuerza;
        unPico.vs(this);
        return;
    }
}