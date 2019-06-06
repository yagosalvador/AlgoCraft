public class PicoDePiedra extends Pico{
	public PicoDePiedra(){
    	this.multiploDeDesgaste = 2/3;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
    	this.durabilidad = 200;
    	this.fuerza = 5;
	}
}