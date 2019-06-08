import java.util.ArrayList; 
public class Inventario{
	
	private int maxInventario = 30;
	private ArrayList<Herramienta> herramientas = new ArrayList<Herramienta>(maxInventario);
	private ArrayList<Material> materiales = new ArrayList<Material>(maxInventario);

	public void agregarHerramienta(Herramienta herramienta){
		this.herramientas.add(herramienta);
	}
	
	public void agregarMaterial(Material material){
		this.materiales.add(material);
	}

	public Herramienta agarrarHerramienta(){
		return this.herramientas.get(0);
	}
	
	public Material agarrarMaterial(){
		return this.material.get(0);
	}

	public int capacidadOcupadaHerramientas(){
		return this.herramientas.size();
	}
	
	public int capacidadOcupadaMateriales(){
		return this.materiales.size();
	}
}
