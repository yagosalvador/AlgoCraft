public abstract class Herramienta implements Enfrentable{
    private double multiploDeDesgaste = 0;
    private double fuerza = 0;
    private double durabilidad = 0;
    ReglaDeDesgaste desgaste;

    public void setDurabilidad(double durabilidad){
        this.durabilidad = durabilidad;
    }

    public double durabilidad(){
        return this.durabilidad;
    }

    public double fuerza(){
        return this.fuerza;
    }

    public void setFuerza(double fuerza){
        this.fuerza = fuerza;
    }

    public Material extraer(Material material){ //algun nombre mejor?
        return material.enfrentar(this);
    }

    public void desgastar(){
        durabilidad = desgaste.desgastar(durabilidad,fuerza);
    }

    public Enfrentable vs(Enfrentable rival){
        return rival.vs(this);
    }

    public Enfrentable vs(Material material){
        this.desgastar();
    }
}