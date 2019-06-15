//Posible implementacion de receta
//import static java.lang.System.*;
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

    public boolean equals(Receta unaReceta){
        boolean equals = true;

        for(int i = 0; i < 9 ; i ++) {
            Material material = unaReceta.receta.getValue(i);
            if (this.receta.get(i).esMismoMaterialQue(material) = true)
                equals = false;
        }
        return equals;
    }

    public void ubicarMaterial(int posicion, Material material){
        receta.replace(posicion, material);
    }
}