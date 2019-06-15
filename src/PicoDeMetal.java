public class PicoDeMetal extends Pico{
	private Receta receta = null;

	public PicoDeMetal(){
    	this.desgaste = new DesgastePorCantidadDeGolpes(10);
    	this.durabilidad = 400;
    	this.fuerza = 12;
	}
	@Override
	public void desgastar(){ desgaste.desgastar(durabilidad,fuerza); }
	@Override
	public void vs(Metal rival){ rival.vs(this); }
	private void cargarReceta(){
		Material madera = new Madera();
		Material metal = new Metal();
		receta = new Receta();
		receta.ubicarMaterial(0, metal);
		receta.ubicarMaterial(1, metal);
		receta.ubicarMaterial(2, metal);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
	}

	public Receta getReceta(){
		return receta;
	}
}
