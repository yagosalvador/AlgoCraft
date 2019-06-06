public class PicoFino extends Pico{

	public PicoFino(){
		this.durabilidad = 1000;
		this.fuerza = 20;
    	this.multiploDeDesgaste = 0.1;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}

	public void desgastar(){
		desgaste.desgastar(durabilidad,durabilidad);
	}
}