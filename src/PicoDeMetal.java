public class PicoDeMetal extends Pico{
	public PicoDeMetal(){
    	this.desgaste = new DesgastePorCantidadDeGolpes(10);
    	this.durabilidad = 400;
    	this.fuerza = 12;
	}
	@Override
	public void desgastar(){ desgaste.desgastar(durabilidad,fuerza); }
	@Override
	public void vs(Metal rival){ rival.vs(this); }
}
