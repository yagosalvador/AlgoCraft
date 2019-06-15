public class HerramientaFactory{

    public HerramientaFactory(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Material noObject = new NoObject();
    }

    public Herramienta construirHerramienta(Receta recetaAConstruir){
        Herramienta herramienta = null;
/*
        if( recetaAConstruir.equals(recetaHachaDeMadera) ){
            herramienta = new HachaDeMadera();
        }
        if( recetaAConstruir.equals(recetaHachaDePiedra) ){
            herramienta = new HachaDePiedra();
        }
        if( recetaAConstruir.equals(recetaHachaDeMetal) ){
            herramienta = new HachaDeMetal();
        }
        if( recetaAConstruir.equals(recetaPicoDeMadera) ){
            herramienta = new PicoDeMadera();
        }
        if( recetaAConstruir.equals(recetaPicoDePiedra) ){
            herramienta = new PicoDePiedra();
        }
        if( recetaAConstruir.equals(recetaPicoDeMetal) ){
            herramienta = new PicoDeMetal();
        }
        if( recetaAConstruir.equals(recetaPicoFino) ){
            herramienta = new PicoFino();
        }*/
        return herramienta;
    }

}