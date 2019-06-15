public class MesaDeTrabajo{
    private HerramientaFactory factory = null;
    private Receta espacioDeTrabajo = null;

    public MesaDeTrabajo(){
        this.factory = new HerramientaFactory();
        NoObject noObject = new NoObject();
        espacioDeTrabajo = new Receta ();
    }

    public void ubicarMaterial(int posicion, Material material){
        this.espacioDeTrabajo.ubicarMaterial(posicion, material);
    }

    public Herramienta construirHerramienta() {
        return this.factory.construirHerramienta(this.espacioDeTrabajo);
    }

    public Receta espacioDeTrabajo(){
        return this.espacioDeTrabajo;
    }
}