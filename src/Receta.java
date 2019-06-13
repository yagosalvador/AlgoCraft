//Posible implementacion de receta

public class Receta{

    private Material [ ] receta = new Material [9];

    public Receta(Material material1, Material material2, Material material3,
                  Material material4, Material material5, Material material6,
                  Material material7, Material material8, Material material9){
        this.receta[0] = material1;
        this.receta[1] = material2;
        this.receta[2] = material3;
        this.receta[3] = material4;
        this.receta[4] = material5;
        this.receta[5] = material6;
        this.receta[6] = material7;
        this.receta[7] = material8;
        this.receta[8] = material9;
    }

    public boolean equals(Receta unaReceta){
        boolean equals = true;

        for(int i = 0; i < 9 ; i ++) {
            if (this.receta[i].getClass() != unaReceta.receta[i].getClass())
                equals = false;
        }
        return equals;
    }

    public void ubicarMaterial(int posicion, Material material){
        this.receta[posicion] = material;
    }
}