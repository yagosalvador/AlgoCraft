import java.util.HashMap;
import java.util.Map;

public class Receta{
    private Map<Integer, Material> receta = new HashMap<>(9);

    public Receta(){
        Material noObject = new NoObject();
        receta.put(0, noObject);
        receta.put(1, noObject);
        receta.put(2, noObject);
        receta.put(3, noObject);
        receta.put(4, noObject);
        receta.put(5, noObject);
        receta.put(6, noObject);
        receta.put(7, noObject);
        receta.put(8, noObject);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receta unaReceta = (Receta) o;
        boolean equals = true;
        for(int i = 0; i < 9 ; i++) {
            Material material = unaReceta.materialEnPosicion(i);
            if (material.esMismoMaterialQue(this.materialEnPosicion(i)) != true) {
                equals = false;
            }
        }
        return equals;
    }

    public boolean equals(Receta unaReceta){
        boolean equals = true;
        for(int i = 0; i < 9 ; i++) {
            Material material = unaReceta.materialEnPosicion(i);
            if (material.esMismoMaterialQue(this.materialEnPosicion(i)) != true) {
                equals = false;
            }
        }
        return equals;
    }

    public void ubicarMaterial(int posicion, Material material){
        receta.put(posicion, material);
    }

    public Material materialEnPosicion(int posicion){
        return this.receta.get(posicion);
    }

    @Override
    public int hashCode(){
        return 1;
    }
}