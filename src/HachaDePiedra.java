public class HachaDePiedra extends Hacha{
	private Receta receta = null;

	public HachaDePiedra(){
		this.durabilidad = 200;
		this.fuerza = 5;
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}

	private void cargarReceta(){
		Material madera = new Madera();
		Material piedra = new Piedra();
		receta = new Receta();
		receta.ubicarMaterial(0, piedra);
		receta.ubicarMaterial(1, piedra);
		receta.ubicarMaterial(3, piedra);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
	}

	public Receta getReceta(){
		return receta;
	}
}