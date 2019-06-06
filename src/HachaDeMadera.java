public class HachaDeMadera extends Hacha{
	public HachaDeMadera(){
		this.durabilidad = 100;
		this.fuerza = 2;
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}

	public double multiploDeDesgaste(){
		return this.multiploDeDesgaste;
	}

	public boolean equals(HachaDeMadera unHacha){
		boolean equals = true;
		if( durabilidad != unHacha.durabilidad() ) equals = false;
		if( fuerza != unHacha.fuerza() ) equals = false;
		if( multiploDeDesgaste != unHacha.multiploDeDesgaste() ) equals = false;
		return equals;
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
