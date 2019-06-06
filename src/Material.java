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
        System.out.println("Voy a la herramienta");
    	return;
    }
    @Override
    public void vs(Material rival){
    	return;
    }
}