public class PicoDeMetal extends Pico{
	public PicoDeMetal(){
    	this.desgaste = new DesgastePorCantidadDeGolpes(10);
    	this.durabilidad = 400;
    	this.fuerza = 10;
	}
	@Override
	public void desgastar(){
		desgaste.desgastar(durabilidad,fuerza);
	}
	@Override
	public void vs(Madera rival){
        this.desgastar();
        return;
    }
        @Override
    public void vs(Hacha unHacha){	
		return;
    }
        @Override
    public void vs(Pico unPico){
        return;
    }
}
