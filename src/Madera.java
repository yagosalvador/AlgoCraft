public class Madera extends Material{
    public Madera(){
        this.durabilidad = 10;
    }
    public Madera(EscuchadorEventosJuego escuchador){
        escuchadorDeEventos = escuchador;
        this.durabilidad = 10;
    }
    @Override
    public void vs(Hacha unHacha){
        double fuerza = unHacha.fuerza();
        this.durabilidad -= fuerza;
		unHacha.vs(this);
	}
    @Override
    public void vs(Pico pico){ pico.vs(this); }
    @Override
    public void vs(PicoFino pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
        pico.vs(this);
    }
}