public class Metal extends Material{

    public Metal(){
        this.durabilidad = 50;
    }
    public Metal(EscuchadorEventosJuego escuchador){
        escuchadorDeEventos = escuchador;
        this.durabilidad = 50;
    }
    @Override
    public void vs(Hacha hacha){ hacha.vs(this); }
    @Override
    public void vs(Pico pico){ pico.vs(this); }
    @Override
    public void vs(PicoDeMadera pico){ pico.vs(this); }
    @Override
    public void vs(PicoFino pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
    }
    @Override
    public void vs(PicoDeMetal pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
    }
    @Override
    public void vs(PicoDePiedra pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
    }
}