package Modelo;

public class PicoFino extends Pico{
	public PicoFino(){
		this.durabilidad = 1000;
		this.fuerza = 20;
		this.multiploDeDesgaste = 0.1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}
	public void desgastar(){
		desgaste.desgastar(durabilidad,durabilidad);
	}

	@Override
	public void vs(Madera rival){ return; }
	@Override
	public void vs(Piedra rival){ return; }
	@Override
	public void vs(Metal rival){ rival.vs(this); }
	@Override
	public void vs(Diamante rival){
		this.desgastar();
		rival.vs(this);
	}

	static public Receta getReceta(){
		Material madera = new Madera();
		Material piedra = new Piedra();
		Material metal = new Metal();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, metal);
		receta.ubicarMaterial(1, metal);
		receta.ubicarMaterial(2, metal);
		receta.ubicarMaterial(3, piedra);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		return receta;
	}
}