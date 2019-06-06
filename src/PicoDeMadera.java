public class PicoDeMadera extends Pico{
	public PicoDeMadera(){
    	this.multiploDeDesgaste = 1;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
		this.durabilidad = 100;
    	this.fuerza = 2;
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
