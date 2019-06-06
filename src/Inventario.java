import java.util.ArrayList; 
public class Inventario{
	
	private int maxInventario = 30;
	private ArrayList<Herramienta> herramientas = new ArrayList<Herramienta>(maxInventario);

	public void agregarHerramienta(Herramienta herramienta){
		this.herramientas.add(herramienta);
	}

	public Herramienta agarrarHerramienta(){
		return this.herramientas.get(0);
	}

	public int capacidadOcupada(){
		return this.herramientas.size();
	}
}
