public class HachaDeMetal extends Hacha{
	public HachaDeMetal(){
		this.durabilidad = 400;
		this.fuerza = 10;
		this.multiploDeDesgaste = 0.5;
		this.desgaste = new DesgastePorMultiplo(this.multiploDeDesgaste);		
	}
}
