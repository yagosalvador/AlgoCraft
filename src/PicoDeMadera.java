public class PicoDeMadera extends Pico{
	private Receta receta = null;

	public PicoDeMadera(){
    	this.multiploDeDesgaste = 1;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
		this.durabilidad = 100;
    	this.fuerza = 2;
    }
	private void cargarReceta(){
		Material madera = new Madera();
		receta = new Receta();
		receta.ubicarMaterial(0, madera);
		receta.ubicarMaterial(1, madera);
		receta.ubicarMaterial(2, madera);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
	}

	public Receta getReceta(){
		return receta;
	}
}
