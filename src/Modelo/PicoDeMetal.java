package Modelo;

public class PicoDeMetal extends Pico{
	public PicoDeMetal(){
		this.desgaste = new DesgastePorCantidadDeGolpes(10);
		this.durabilidad = 400;
		this.fuerza = 12;
	}
	@Override
	public void desgastar(){ desgaste.desgastar(durabilidad,fuerza); }
	@Override
	public void vs(Metal rival){ rival.vs(this); }

	static public Receta getReceta(){
		Material madera = new Madera();
		Material metal = new Metal();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, metal);
		receta.ubicarMaterial(1, metal);
		receta.ubicarMaterial(2, metal);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		return receta;
	}
}