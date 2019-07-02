public class HachaDeMadera extends Hacha{
	public HachaDeMadera(){
		this.durabilidad = 100;
		this.fuerza = 2;
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}

	public double multiploDeDesgaste(){ return this.multiploDeDesgaste; }

	public boolean equals(HachaDeMadera unHacha){
		boolean equals = true;
		if( durabilidad != unHacha.durabilidad() ) equals = false;
		if( fuerza != unHacha.fuerza() ) equals = false;
		if( multiploDeDesgaste != unHacha.multiploDeDesgaste() ) equals = false;
		return equals;
	}

	static public Receta getReceta(){
		Material madera = new Madera();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, madera);
		receta.ubicarMaterial(1, madera);
		receta.ubicarMaterial(3, madera);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		return receta;
	}
}
