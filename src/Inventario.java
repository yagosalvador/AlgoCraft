import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList; 
public class Inventario{
	private Map<String, QueueAlmacenable> inventario = new HashMap<String, QueueAlmacenable>(11);

	public Inventario(){
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
