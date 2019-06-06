public class PicoDeMetal extends Pico{
	public PicoDeMetal(){
    	this.desgaste = new DesgastePorCantidadDeGolpes(10);
    	this.durabilidad = 400;
    	this.fuerza = 12;
	}
	
	@Override
	public void desgastar(){
		desgaste.desgastar(durabilidad,fuerza);
	}
    @Override
    public void vs(PicoFino pico){
        return;
    }
    @Override
    public void vs(PicoDeMadera unPico){
        return;
    }
    @Override
    public void vs(PicoDeMetal unPico){
        return;
    }
    @Override
    public void vs(PicoDePiedra unPico){
        return;
    }
    @Override
    public void vs(Metal rival){
        this.desgastar();
        rival.vs(this);
        return;
    }
}
