public class HachaDeMetal extends Hacha{
	public HachaDeMetal(){
		this.multiploDeDesgaste = 0.5;
		this.desgaste = DesgastePorMultiplo(multiploDeDesgaste);
		this.durabilidad = 400;
		this.fuerza = 10;
	}
}
