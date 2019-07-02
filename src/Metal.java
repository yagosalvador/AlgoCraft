public class Metal extends Material{
    public Metal(){
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
        System.out.println(durabilidad);

        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
    }
    @Override
    public void vs(PicoDeMetal pico){
        System.out.println(durabilidad);

        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
    }
    @Override
    public void vs(PicoDePiedra pico){
        System.out.println(durabilidad);
        double fuerza = pico.fuerza();
        this.durabilidad -= fuerza;
    }
}