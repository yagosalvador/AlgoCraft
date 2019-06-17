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
	public void avanzarAlNorte() {
		this.ubicacion_x+=1;
	}
	public void avanzarAlSur() {
		this.ubicacion_x-=1;
	}
	public void avanzarAlEste() {
		this.ubicacion_y-=1;
	}
	public void avanzarAlOeste() {
		this.ubicacion_y+=1;
	}
	public void actualizarPosicion(int x, int y) {
		this.ubicacion_x=x;
		this.ubicacion_y=y;
	}
}