public class Piedra extends Material{
    public Piedra(){
        this.durabilidad = 30;
    }
    public Piedra(EscuchadorEventosJuego escuchador){
        escuchadorDeEventos = escuchador;
        this.durabilidad = 30;
    }
    @Override
    public void vs(Pico pico){
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
        pico.vs(this);
    }
    @Override
    public void vs(Hacha hacha){ hacha.vs(this); }
}