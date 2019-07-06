public class Posicion extends Coordenadas{

    public Posicion(int setX, int setY) {
        x = setX;
        y = setY;
    }
    public Posicion(Posicion posicionACopiar) {
        x = posicionACopiar.getX();
        y = posicionACopiar.getY();
    }
    public void actualizar(int xValue, int yValue){
        x = xValue;
        y = yValue;
    }
    public void actualizar(Direccion avance){
        x = x + avance.getX();
        y = y + avance.getY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion unaPosicion = (Posicion) o;
        boolean equals = true;
        if( x != unaPosicion.getX() || y != unaPosicion.getY() ){
            equals = false;
        }
        return equals;
    }

    public boolean equals(Posicion pos) {
        boolean equals = true;
        if( x == pos.getX() || y == pos.getY() ){
            equals = false;
        }
        return equals;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash * this.x;
        hash = 15 * hash + this.y;
        return (int) hash;
    }
}