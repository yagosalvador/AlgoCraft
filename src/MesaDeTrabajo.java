import java.util.HashMap;
import java.util.Map;

public class MesaDeTrabajo{
    private Receta espacioDeTrabajo = null;
    private Map<Receta, ConstructorHerramienta> recetas = new HashMap<>();
    private ConstructorHerramienta constructor = null;

    public MesaDeTrabajo(){
        espacioDeTrabajo = new Receta ();
        cargarRecetas();
    }

    public void ubicarMaterial(int posicion, Material material){
        this.espacioDeTrabajo.ubicarMaterial(posicion, material);
        System.out.println("Material del tipo: " + material.getClass().getName() + " en: "+posicion);
    }

    public Receta espacioDeTrabajo(){
        return this.espacioDeTrabajo;
    }

    public Herramienta construirHerramienta(){
        Herramienta herramienta = null;
        this.constructor = this.recetas.get(espacioDeTrabajo);
        herramienta = this.constructor.construir();
        System.out.println(herramienta);
        espacioDeTrabajo = new Receta();
        return herramienta;
    }

    private void cargarRecetas(){
        recetas.put(HachaDeMadera.getReceta(), HachaDeMadera::new);
        recetas.put(HachaDePiedra.getReceta(), HachaDePiedra::new);
        recetas.put(HachaDeMetal.getReceta(), HachaDeMetal::new);
        recetas.put(PicoDeMadera.getReceta(), PicoDeMadera::new);
        recetas.put(PicoDePiedra.getReceta(), PicoDePiedra::new);
        recetas.put(PicoDeMetal.getReceta(), PicoDeMetal::new);
        recetas.put(PicoFino.getReceta(), PicoFino::new);
    }
}