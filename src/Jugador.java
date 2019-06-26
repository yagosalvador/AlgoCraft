public class Jugador{
	private Inventario inventario;
	private Herramienta herramientaEquipada; //herramienta en mano

	public Jugador(){
		this.inventario = new Inventario();
		Herramienta hachaInicial = new HachaDeMadera();
		this.inventario.agregarElemento(hachaInicial);
		herramientaEquipada = hachaInicial;
	}
/*
	public Herramienta sacarPrimerHerramienta(){
		return inventario.agarrarHerramienta();
	}
	public int capacidadOcupadaInventario(){
		return (inventario.capacidadOcupadaHerramientas()+inventario.capacidadOcupadaMateriales());
	}
	
	public int capacidadOcupadaInventarioHerramientas(){
		return inventario.capacidadOcupadaHerramientas();
	}
	
	public int capacidadOcupadaInventarioMateriales(){
		return inventario.capacidadOcupadaMateriales();
	}
*/
	public void equiparHerramienta(Herramienta herramienta){
		herramientaEquipada = herramienta;
	}

	public int cantidadDeElemento(String clase){
		return inventario.cantidadDeElemento(clase);
	}

	public Almacenable sacarElemento(String clase){
		return inventario.sacarElemento(clase);
	}

	public void vs(Material material){
		herramientaEquipada.vs(material);
	}

}