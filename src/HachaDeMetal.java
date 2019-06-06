public class HachaDeMetal extends Hacha{
	public HachaDeMetal(){
		this.durabilidad = 400;
		this.fuerza = 10;
		this.multiploDeDesgaste = 0.5;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);		
	}/*
	@Override
	public void vs(Madera rival){
        this.desgastar();
        return;
    }/*
    @Override
    public void vs(Hacha unHacha){	
		return;
    }
    @Override
    public void vs(Pico unPico){
        return;
    }*/
}
