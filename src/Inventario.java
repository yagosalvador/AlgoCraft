import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Set;

public class Inventario{
	private Map<String, QueueAlmacenable> inventario = new HashMap<String, QueueAlmacenable>(11);

	public Inventario(){
	}

	public int size(){
		if(inventario.isEmpty())
			return 0;
		return inventario.size();
	}

	public void agregarElemento(Almacenable almacenable){
		try{
			inventario.get(almacenable.getClass().getName()).agregarElemento(almacenable);
		}
		catch (Exception errorNullPointer){
			inventario.put(almacenable.getClass().getName(), new QueueAlmacenable());
			inventario.get(almacenable.getClass().getName()).agregarElemento(almacenable);
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
		Almacenable item;
		try {
			item = inventario.get(clase).sacarElemento();
		}
		catch (Exception errorNoHayMasMaterialDisponible){
			return null;
		}
		return item;
	}

	public Almacenable usarElemento(String clase){
			return inventario.get(clase).usarElemento();
	}
	public int durabilidadDeElemento(String clase){
			return inventario.get(clase).devolverDurabilidad();
	}
	public String[] getElementosAlmacenados(){
		if(inventario.size() == 0){
			return null;
		}
		return inventario.keySet().toArray(new String[0]);
	}
}
