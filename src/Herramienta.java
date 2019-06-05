public class Herramienta{
    private int durabilidad;
    private int fuerza;

    public void setDurabilidad(int durabilidad){
        this.durabilidad = durabilidad;
    }

    public int durabilidad(){
        return this.durabilidad;
    }

    public Material extraer(Material material){
        return material.enfrentar(this);
    }
}