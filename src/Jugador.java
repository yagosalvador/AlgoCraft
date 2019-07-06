import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Jugador{
	private Inventario inventario;
	private Herramienta herramientaEquipada;
	private MesaDeTrabajo mesa;
	private Map<Integer, Material> materialesUbicados = new HashMap<>(9);
	boolean cargaHerramienta;
	private Posicion posicionMirada;
	public Jugador(){
		this.mesa = new MesaDeTrabajo();
		this.inventario = new Inventario();
		Herramienta hachaInicial = new HachaDeMadera();
		this.inventario.agregarElemento(hachaInicial);
		herramientaEquipada = hachaInicial;
		cargaHerramienta = true;
	}

	public void equiparHerramienta(Herramienta herramienta){
		herramientaEquipada = herramienta;
		cargaHerramienta = true;
	}

	public void setPosicionMirada(Posicion nuevaPosicion){
		posicionMirada = nuevaPosicion;
	}

	public Posicion getPosicionMirada(){
		return posicionMirada;
	}

	public void equiparHerramienta(String str){
		Almacenable almacenable = inventario.usarElemento(str);
		if(almacenable instanceof Herramienta){
			equiparHerramienta((Herramienta) almacenable);
		}
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

	public void vs(Material material) {
		if (!cargaHerramienta){
			System.out.println("No lleva herramienta");
			return;
		}
		herramientaEquipada.vs(material);
		if (herramientaEquipada.durabilidad() == 0){
			sacarElemento(herramientaEquipada.getClass().getName());
			cargaHerramienta = false;
		}
	}

	public Herramienta getHerramientaEquipada() {
		return herramientaEquipada;
	}

	public void ubicarMaterialEnMesaDeTrabajo(int posicion, String clase){
		Material material;
		try{
			material = (Material) inventario.sacarElemento(clase);
		}
		catch (Exception ClassCastException){
				return;
		}
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
		vaciarMaterialesUbicados();
		almacenarElemento(herramientaCreada);
	}

	public void devolverMaterialesAlInventario(){
		Iterator it = materialesUbicados.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			Almacenable material = (Almacenable) pair.getValue();
			inventario.agregarElemento(material);
			it.remove(); // para evitar ConcurrentModificationException
		}
	}

	public void vaciarMaterialesUbicados(){
		Iterator it = materialesUbicados.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			Almacenable material = (Almacenable) pair.getValue();
			it.remove(); // para evitar ConcurrentModificationException
		}
	}

    public boolean cargaHerramienta() {
	    return cargaHerramienta;
    }

    public Inventario getInventario() {
	    return inventario;
    }
}