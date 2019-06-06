public class Madera extends Material{
    public Madera(){
        this.durabilidad = 10;
    }

    @Override
    public void vs(Hacha unHacha){
        double fuerza = unHacha.fuerza();
        this.durabilidad -= fuerza;
		unHacha.vs(this);
		return;
    }

    @Override
    public void vs(Pico unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoFino pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
        pico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDeMadera unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDePiedra unPico){
        unPico.vs(this);
        return;
    }
    @Override
    public void vs(PicoDeMetal unPico){
        unPico.vs(this);
        return;
    }
}