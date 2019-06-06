public abstract class Material implements Enfrentable{
    int durabilidad;

    public int durabilidad(){
        return durabilidad;
    }
    @Override
    public void vs(Enfrentable rival){
        rival.vs(this);
        return;
    }
    @Override
    public void vs(Herramienta rival){
        rival.vs(this);
    	return;
    }
    @Override
    public void vs(Material rival){
    	return;
    }
    @Override
    public void vs(Madera rival){
        return;
    }
}