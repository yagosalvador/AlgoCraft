package Modelo;

public class HachaDeMetal extends Hacha{
	public HachaDeMetal(){
		this.durabilidad = 400;
		this.fuerza = 10;
		this.multiploDeDesgaste = 0.5;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}
	static public Receta getReceta(){
		Material madera = new Madera();
		Material metal = new Metal();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, metal);
		receta.ubicarMaterial(1, metal);
		receta.ubicarMaterial(3, metal);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		return receta;
	}
}
