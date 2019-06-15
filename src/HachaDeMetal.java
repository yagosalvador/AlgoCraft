public class HachaDeMetal extends Hacha{
	private Receta receta = null;

	public HachaDeMetal(){
		this.durabilidad = 400;
		this.fuerza = 10;
		this.multiploDeDesgaste = 0.5;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);		
	}

	private void cargarReceta(){
		Material madera = new Madera();
		Material metal = new Metal();
		receta = new Receta();
		receta.ubicarMaterial(0, metal);
		receta.ubicarMaterial(1, metal);
		receta.ubicarMaterial(3, metal);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
	}

	public Receta getReceta(){
		return receta;
	}
}
