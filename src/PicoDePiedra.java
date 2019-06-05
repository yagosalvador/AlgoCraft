public class PicoDePiedra extends Pico{
	public PicoDePiedra(){
    	this.multiploDeDesgaste = 2/3;
    	this.desgaste = DesgastePorMultiplo(multiploDeDesgaste);
    	this.durabilidad = 200;
    	this.fuerza = 5;
	}
}