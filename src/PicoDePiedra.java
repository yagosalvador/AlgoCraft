public class PicoDePiedra extends Pico{
	public PicoDePiedra(){
    	this.multiploDeDesgaste = 0.6667;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
    	this.durabilidad = 200;
    	this.fuerza = 5;
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