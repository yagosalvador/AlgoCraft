public class PicoFino extends Pico{

	public PicoFino(){
		this.durabilidad = 100;
		this.fuerza = 2;
    	this.multiploDeDesgaste = 0.1;
    	this.desgaste = DesgasteParaPicoFino(multiploDeDesgaste);
	}

	public desgastar(){
		desgaste.desgastar(durabilidad,durabilidad);
	}
}