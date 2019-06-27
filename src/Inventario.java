import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList; 
public class Inventario{
	private Map<String, QueueAlmacenable> inventario = new HashMap<String, QueueAlmacenable>(11);

	public Inventario(){/*
		inventario.put("class Madera", new QueueAlmacenable());
		inventario.put("class Piedra", new QueueAlmacenable());
		inventario.put("class Metal", new QueueAlmacenable());
		inventario.put("class Diamante", new QueueAlmacenable());
		inventario.put("class HachaDeMadera", new QueueAlmacenable());
		inventario.put("class HachaDePiedra", new QueueAlmacenable());
		inventario.put("class HachaDeMetal", new QueueAlmacenable());
		inventario.put("class PicoDeMadera", new QueueAlmacenable());
		inventario.put("class PicoDePiedra", new QueueAlmacenable());
		inventario.put("class PicoDeMetal", new QueueAlmacenable());
		inventario.put("class PicoFino", new QueueAlmacenable());
*/
	}

	public int size(){
		return inventario.size();
	}

	public void agregarElemento(Almacenable almacenable){
		
		try{
			inventario.get(almacenable.getClass().toString()).agregarElemento(almacenable);
		}
		catch (Exception errorNullPointer){
			inventario.put(almacenable.getClass().toString(), new QueueAlmacenable());
			inventario.get(almacenable.getClass().toString()).agregarElemento(almacenable);
		}
		
		//inventario.get(almacenable.getClass().toString()).agregarElemento(almacenable);
	}

	public int cantidadDeElemento(String clase){
		try{
			return inventario.get(clase).size();
		}
		catch (Exception errorNullPointer){
			return 0;
		}
	}
	public Almacenable sacarElemento(String clase){
			return inventario.get(clase).sacarElemento();
	}

	public Almacenable usarElemento(String clase){
			return inventario.get(clase).usarElemento();
	}
	public int durabilidadDeElemento(String clase){
			return inventario.get(clase).devolverDurabilidad();
	}
}
