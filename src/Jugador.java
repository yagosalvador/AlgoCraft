import java.util.HashMap;
import java.util.Map;

public class Jugador{
	private Inventario inventario;
	private Herramienta herramientaEquipada; //herramienta en mano
	private MesaDeTrabajo mesa;
	private Map<Integer, Material> materialesUbicados = new HashMap<>(9);
	public Jugador(){
		this.mesa = new MesaDeTrabajo();
		this.inventario = new Inventario();
		Herramienta hachaInicial = new HachaDeMadera();
		this.inventario.agregarElemento(hachaInicial);
		herramientaEquipada = hachaInicial;
	}
	public void equiparHerramienta(String clase){
		herramientaEquipada = (Herramienta) inventario.usarElemento(clase);
	}

	public int cantidadDeElemento(String clase){
		return inventario.cantidadDeElemento(clase);
	}

	public Almacenable sacarElemento(String clase){
		return inventario.sacarElemento(clase);
	}

	public void almacenarElemento(Almacenable almacenable){
		inventario.agregarElemento(almacenable);
	}

	public void vs(Material material){
		herramientaEquipada.vs(material);
		if(herramientaEquipada.durabilidad() == 0)
			herramientaEquipada = null;
	}

	public Herramienta getHerramientaEquipada() {
		return herramientaEquipada;
	}
	public void ubicarMaterialEnMesaDeTrabajo(int posicion, String clase){
		Material material = (Material) inventario.sacarElemento(clase);
		if(material == null){
			System.out.print("no hay mas "+clase);
			return;
		}
		else{
			ubicarMaterial(posicion, material);
		}
	}

	public void ubicarMaterial(int posicion, Material material){
		mesa.ubicarMaterial(posicion, material);

		Material materialDevuelto = materialesUbicados.put(posicion,material);
		if(materialDevuelto == null){ 
			return; 
		}
		else{ 
			almacenarElemento(materialDevuelto); 
		}
	}


	public void construirHerramienta(){
		Herramienta herramientaCreada = null;
		try{
			herramientaCreada = mesa.construirHerramienta();
		}catch(Exception errorNullPointer){
			if(herramientaCreada == null){
				devolverMaterialesAlInventario();
				return;
			}
		}
		almacenarElemento(herramientaCreada);
		
	}	
	public void devolverMaterialesAlInventario(){
		for(Map.Entry<Integer, Material> entry: materialesUbicados.entrySet()){
			Integer posicion = entry.getKey();
			inventario.agregarElemento(materialesUbicados.remove(posicion));

		}	
	}
}