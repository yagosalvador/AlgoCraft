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
}
