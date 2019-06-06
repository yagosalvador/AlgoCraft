
public class HachaDeMadera extends Hacha{
	public HachaDeMadera(){
		this.durabilidad = 100;
		this.fuerza = 2;
		this.multiploDeDesgaste = 1;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);
	}
}
