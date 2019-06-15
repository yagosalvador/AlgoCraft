public class HachaDeMadera extends Hacha{
	private Receta receta = null;

	public HachaDeMadera(){
		this.durabilidad = 100;
		this.fuerza = 2;
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
		cargarReceta();
	}

	public double multiploDeDesgaste(){ return this.multiploDeDesgaste; }

	public boolean equals(HachaDeMadera unHacha){
		boolean equals = true;
		if( durabilidad != unHacha.durabilidad() ) equals = false;
		if( fuerza != unHacha.fuerza() ) equals = false;
		if( multiploDeDesgaste != unHacha.multiploDeDesgaste() ) equals = false;
		return equals;
	}

	private void cargarReceta(){
		Material madera = new Madera();
		receta = new Receta();
		receta.ubicarMaterial(0, madera);
		receta.ubicarMaterial(1, madera);
		receta.ubicarMaterial(3, madera);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
	}

	public Receta getReceta(){
		return receta;
	}
}
