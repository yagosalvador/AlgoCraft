public class PicoDeMadera extends Pico{
	public PicoDeMadera(){
    	this.multiploDeDesgaste = 1;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
		this.durabilidad = 100;
    	this.fuerza = 2;
    }
    @Override
    public void vs(PicoFino pico){
        return;
    }
    @Override
    public void vs(PicoDeMadera unPico){
        return;
    }
    @Override
    public void vs(PicoDeMetal unPico){
        return;
    }
    @Override
    public void vs(PicoDePiedra unPico){
        return;
    }
    @Override
    public void vs(Metal rival){
        this.desgastar();
        rival.vs(this);
        return;
    }
}
