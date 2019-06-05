//Las herramientas tienen una ReglaDeDesgaste que es quien tiene
//el metodo para procesar el desgaste
public abstract class Hacha extends Herramienta{
	private double multiploDeDesgaste = 1;
	ReglaDeDesgaste desgaste = DesgastePorMultiplo(multiploDeDesgaste);

	public void desgastar(){
		durabilidad = desgaste.desgastar(durabilidad,fuerza);
	}

}

public class HachaDeMadera extends Hacha{

	private int durabilidad = 100;
	private int fuerza = 2;
}

public class HachaDePiedra extends Hacha{

	private int durabilidad = 200;
	private int fuerza = 5;
}

public class HachaDeMetal extends Hacha{

	private double multiploDeDesgaste = 0.5;
	ReglaDeDesgaste desgaste = DesgastePorMultiplo(multiploDeDesgaste);

	private int durabilidad = 400;
	private int fuerza = 10;
}

