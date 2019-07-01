import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jugador{
	private Inventario inventario;
	private Herramienta herramientaEquipada;
	private MesaDeTrabajo mesa;
	private Map<Integer, Material> materialesUbicados = new HashMap<>(9);
	boolean cargaHerramienta;
	EscuchadorEventosJuego escuchadorDeEventos;
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
			System.out.println("No lleva material");
			return;
		}
		herramientaEquipada.vs(material);
		if (herramientaEquipada.durabilidad() == 0){
			herramientaEquipada = null;
			cargaHerramienta = false;
		}
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

	public void construirHerramienta(EscuchadorEventosJuego escuchadorDeEventos){
		Herramienta herramientaCreada = null;
		try{
			herramientaCreada = mesa.construirHerramienta(escuchadorDeEventos);
		}catch(Exception errorNullPointer){
			if(herramientaCreada == null){
				devolverMaterialesAlInventario();
				return;
			}
		}
		almacenarElemento(herramientaCreada);
	}
	//Construye con controladorDeEventosNull
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

    public boolean cargaHerramienta() {
	    return cargaHerramienta;
    }

    public Inventario getInventario() {
	    return inventario;
    }

	public void añadirEscuchadorEventosJuego(EscuchadorEventosJuego escuchador) {
		this.escuchadorDeEventos = escuchador;
		this.inventario.usarElemento("class HachaDeMadera").setEscuchador(escuchador);
	}
}