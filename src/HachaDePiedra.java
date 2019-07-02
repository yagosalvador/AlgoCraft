public class HachaDePiedra extends Hacha{
	public HachaDePiedra(){
		this.durabilidad = 200;
		this.fuerza = 5;
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}
	static public Receta getReceta(){
		Material madera = new Madera();
		Material piedra = new Piedra();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, piedra);
		receta.ubicarMaterial(1, piedra);
		receta.ubicarMaterial(3, piedra);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		return receta;
	}
}