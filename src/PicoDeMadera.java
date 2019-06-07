public class PicoDeMadera extends Pico{
	public PicoDeMadera(){
    	this.multiploDeDesgaste = 1;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
		this.durabilidad = 100;
    	this.fuerza = 2;
    }
}
