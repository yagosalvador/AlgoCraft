public class PicoDePiedra extends Pico{
	private Receta receta = null;
	public PicoDePiedra(){
    	this.multiploDeDesgaste = 0.6667;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
    	this.durabilidad = 200;
    	this.fuerza = 4;
	}
	private void cargarReceta(){
		Material madera = new Madera();
		Material piedra = new Piedra();
		receta = new Receta();
		receta.ubicarMaterial(0, piedra);
		receta.ubicarMaterial(1, piedra);
		receta.ubicarMaterial(2, piedra);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
	}

	public Receta getReceta(){
		return receta;
	}
}