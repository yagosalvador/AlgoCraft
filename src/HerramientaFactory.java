public class HerramientaFactory{
    Receta recetaHachaDeMadera = null;
    Receta recetaHachaDePiedra = null;
    Receta recetaHachaDeMetal = null;
    Receta recetaPicoDeMadera = null;
    Receta recetaPicoDePiedra = null;
    Receta recetaPicoDeMetal = null;
    Receta recetaPicoFino = null;

    public HerramientaFactory(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Material noObject = new NoObject();
        this.recetaHachaDeMadera = new Receta( madera, madera, noObject, madera, madera, noObject, noObject, madera, noObject);
        this.recetaHachaDePiedra = new Receta( piedra, piedra, noObject, piedra, madera, noObject, noObject, madera, noObject);
        this.recetaHachaDeMetal = new Receta( metal, metal, noObject, metal, madera, noObject, noObject, madera, noObject);
        this.recetaPicoDeMadera = new Receta( madera, madera, madera, noObject, madera, noObject, noObject, madera, noObject);
        this.recetaPicoDePiedra = new Receta( piedra, piedra, piedra, noObject, madera, noObject, noObject, madera, noObject);
        this.recetaPicoDeMetal = new Receta( metal, metal, metal, noObject, madera, noObject, noObject, madera, noObject);
        this.recetaPicoFino = new Receta( metal, metal, metal, piedra, madera, noObject, noObject, madera, noObject);
    }

    public Herramienta construirHerramienta(Receta recetaAConstruir){
        Herramienta herramienta = null;

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
        }
        return herramienta;
    }

}