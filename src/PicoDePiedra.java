public class PicoDePiedra extends Pico{
	public PicoDePiedra(){
    	this.multiploDeDesgaste = 0.6667;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
    	this.durabilidad = 200;
    	this.fuerza = 4;
	}
}