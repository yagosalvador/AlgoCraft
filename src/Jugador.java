public class Jugador{
	private Inventario inventario;

	public Jugador(){
		this.inventario = new Inventario();
		HachaDeMadera hachaInicial = new HachaDeMadera();
		this.inventario.agregarHerramienta(hachaInicial);
	}
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
}