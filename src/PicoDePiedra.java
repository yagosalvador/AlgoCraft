public class PicoDePiedra extends Pico{
	public PicoDePiedra(){
    	this.multiploDeDesgaste = 0.6667;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
    	this.durabilidad = 200;
    	this.fuerza = 4;
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