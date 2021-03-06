package Modelo;

import java.util.HashMap;
import java.util.Map;

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
        QueueAlmacenable q = inventario.get(almacenable.getClass().getSimpleName());
        if(q == null) {
            inventario.put(almacenable.getClass().getSimpleName(), new QueueAlmacenable());
        }
        inventario.get(almacenable.getClass().getSimpleName()).agregarElemento(almacenable);
	}

	public int cantidadDeElemento(String clase){
        QueueAlmacenable q = inventario.get(clase);
        if(q ==null){
            return 0;
        }
        return inventario.get(clase).size();
	}
	public Almacenable sacarElemento(String clase){
		QueueAlmacenable q = inventario.get(clase);
        if(q == null) {
            return null;
        }
        Almacenable item = q.sacarElemento();;
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
