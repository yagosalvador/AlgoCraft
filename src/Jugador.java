public class Jugador{
	private Inventario inventario;
	//private int ubicacion_x;
	//private int ubicacion_y;


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
	/*
	// Getters coordenadas
	public int ubicacion_x() {
		return ubicacion_x;
	}
	public int ubicacion_y() {
		return ubicacion_y;
	}
	
	// Setters coordenadas
	private void avanzar_ubicacion_x(int s) {
		this.ubicacion_x+=s;
	}
	private void avanzar_ubicacion_y(int s) {
		this.ubicacion_y+=s;
	}

	// Setea a la fuerza una posicion arbitraria
	public void actualizarPosicion(int x, int y) {
		avanzar_ubicacion_x(x-this.ubicacion_x());
		avanzar_ubicacion_y(y-this.ubicacion_y());
	}
	*/

}