public class Material implements Enfrentable{
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
    public void vs(Pico rival){
        rival.vs(this);
    }
    @Override
    public void vs(Hacha rival){
        rival.vs(this);
    }
}