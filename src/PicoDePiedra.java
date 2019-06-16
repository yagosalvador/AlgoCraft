public class PicoDePiedra extends Pico{
	public PicoDePiedra(){
    	this.multiploDeDesgaste = 0.6667;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
    	this.durabilidad = 200;
    	this.fuerza = 4;
	}

	static public Receta getReceta(){
		Material madera = new Madera();
		Material piedra = new Piedra();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, piedra);
		receta.ubicarMaterial(1, piedra);
		receta.ubicarMaterial(2, piedra);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		return receta;
	}
}