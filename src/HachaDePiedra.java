public class HachaDePiedra extends Hacha{
	public HachaDePiedra(){
		this.durabilidad = 200;
		this.fuerza = 5;
		this.multiploDeDesgaste = 1;
		this.desgaste = DesgastePorMultiplo(multiploDeDesgaste);
	}
}