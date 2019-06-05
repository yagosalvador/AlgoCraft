public class Madera extends Material{
    @Override
    public Enfrentable vs(Enfrentable enfrentable){
        return enfrentable.vs(this);
    }

    @Override
    public Enfrentable vs(HachaDeMadera unHacha){
        int durabilidad = this.durabilidad;

        int fuerza = unHacha.getFuerza();

        this.durabilidad -= fuerza;


        if (this.durabilidad == 0)
            return recursoMadera;
        else{
            // qué haríamos acá? No entiendo bien double disp.
        }
    }

}