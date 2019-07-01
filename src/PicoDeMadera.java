public class PicoDeMadera extends Pico{
	public PicoDeMadera(EscuchadorEventosJuego escuchador){
		escuchadorDeEventos = escuchador;
    	this.multiploDeDesgaste = 1;
    	this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
		this.durabilidad = 100;
    	this.fuerza = 2;
    }
	public PicoDeMadera(){
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
		this.durabilidad = 100;
		this.fuerza = 2;
	}

	static public Receta getReceta(){
		Material madera = new Madera();
		Receta receta = new Receta();
		receta.ubicarMaterial(0, madera);
		receta.ubicarMaterial(1, madera);
		receta.ubicarMaterial(2, madera);
		receta.ubicarMaterial(4, madera);
		receta.ubicarMaterial(7, madera);
		return receta;
	}
}