public class HachaDePiedra extends Hacha{
	public HachaDePiedra(){
		this.durabilidad = 200;
		this.fuerza = 5;
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}/*
	@Override
	public void vs(Madera rival){
        this.desgastar();
        return;
    }
    /*
    @Override
    public void vs(Hacha unHacha){	
		return;
    }
    @Override
    public void vs(Pico unPico){
        return;
    }*/
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
}