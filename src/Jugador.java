public class Jugador{
	private Inventario inventario;
	private int ubicacion_x = 0;
	private int ubicacion_y = 0;


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

	public void actualizarPosicion(int x, int y) {
		this.ubicacion_x=x;
		this.ubicacion_y=y;
	}

	public int getUbicacion_x(){
		return this.ubicacion_x;
	}
	public int getUbicacion_y(){
		return this.ubicacion_y;
	}
}