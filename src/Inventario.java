import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList; 
public class Inventario{
	
	//private ArrayList<QueueAlmacenable> inventario = new ArrayList<QueueAlmacenable>(11);
	
	private Map<String, QueueAlmacenable> inventario = new HashMap<String, QueueAlmacenable>(11);
	
	private MesaDeTrabajo mesaDeTrabajo;
	//private QueueAlmacenable inventario[];
/*	
	private int maxInventario = 30;
	private ArrayList<Herramienta> herramientas = new ArrayList<Herramienta>(maxInventario);
	private ArrayList<Material> materiales = new ArrayList<Material>(maxInventario);
*/
	public Inventario(){
		/*
		for(int i=0 ; i<11; i++){
			inventario.add(new QueueAlmacenable());
		}*/
		inventario.put("class Madera", new QueueAlmacenable());
		inventario.put("class Piedra", new QueueAlmacenable());
		inventario.put("class Metal", new QueueAlmacenable());
		inventario.put("class Diamante", new QueueAlmacenable());
		inventario.put("class HachaDeMadera", new QueueAlmacenable());
		inventario.put("class HachaDePiedra", new QueueAlmacenable());
		inventario.put("class HachaDeMetal", new QueueAlmacenable());
		inventario.put("class PicoDeMadera", new QueueAlmacenable());
		inventario.put("class PicoDePiedra", new QueueAlmacenable());
		inventario.put("class PicoDeMetal", new QueueAlmacenable());
		inventario.put("class PicoFino", new QueueAlmacenable());

		mesaDeTrabajo = new MesaDeTrabajo();
	}

	public int size(){
		return inventario.size();
	}

	public void agregarElemento(Almacenable almacenable){
		inventario.get(almacenable.getClass().toString()).agregarElemento(almacenable);
	}

	public int cantidadDeElemento(String clase){
		return inventario.get(clase).size();
	}

	public Almacenable sacarElemento(String clase){
		return inventario.get(clase).sacarElemento();
	}

	public Almacenable usarElemento(String clase){
		return inventario.get(clase).usarElemento();
	}
	public int durabilidadDeElemento(String clase){
		return inventario.get(clase).devolverDurabilidad();
	}
/*
	public void agregarElemento(Almacenable almacenable){
		posicion = almacenable.getPosicionDeAlmacenaje;
		inventario.get(posicion).agregarElemento(almacenable);
	}

	public void agregarElemento(Madera madera){
		inventario.get(0).agregarElemento(madera);
	}

//	public void agregarAlmacenable(Madera madera){
	public void agregarMadera(Almacenable madera){
		inventario.get(0).agregarElemento(madera);
	}
//	public void agregarAlmacenable(Piedra piedra){
	public void agregarPiedra(Almacenable piedra){
		inventario.get(1).agregarElemento(piedra);
	}
//	public void agregarAlmacenable(Metal metal){
	public void agregarMetal(Almacenable metal){
		inventario.get(2).agregarElemento(metal);
	}
//	public void agregarAlmacenable(Diamante diamante){
	public void agregarDiamante(Almacenable diamante){
		inventario.get(3).agregarElemento(diamante);
	}
//	public void agregarAlmacenable(HachaDeMadera hacha){
	public void agregarHachaDeMadera(Almacenable hacha){
		inventario.get(4).agregarElemento(hacha);
	}
//	public void agregarAlmacenable(HachaDeMetal hacha){
	public void agregarHachaDeMetal(Almacenable hacha){
		inventario.get(5).agregarElemento(hacha);
	}
//	public void agregarAlmacenable(HachaDePiedra hacha){
	public void agregarHachaDePiedra(Almacenable hacha){
		inventario.get(6).agregarElemento(hacha);
	}
//	public void agregarAlmacenable(PicoDeMadera pico){
	public void agregarPicoDeMadera(Almacenable pico){
		inventario.get(7).agregarElemento(pico);
	}
//	public void agregarAlmacenable(PicoDePiedra pico){
	public void agregarPicoDePiedra(Almacenable pico){
		inventario.get(8).agregarElemento(pico);
	}
//	public void agregarAlmacenable(PicoDeMetal pico){
	public void agregarPicoDeMetal(Almacenable pico){
		inventario.get(9).agregarElemento(pico);
	}
//	public void agregarAlmacenable(PicoFino pico){
	public void agregarPicoFino(Almacenable pico){
		inventario.get(10).agregarElemento(pico);
	}
*/

/*	public Almacenable sacarMadera(){
		return inventario.get(0).sacarElemento();
	}
	public Almacenable sacarPiedra(){
		return inventario.get(1).sacarElemento();
	}
	public Almacenable sacarMetal(){
		return inventario.get(2).sacarElemento();
	}
	public Almacenable sacarDiamante(){
		return inventario.get(3).sacarElemento();
	}
	public Almacenable sacarHachaDeMadera(){
		return inventario.get(4).sacarElemento();
	}
	public Almacenable sacarHachaDeMetal(){
		return inventario.get(5).sacarElemento();
	}
	public Almacenable sacarHachaDePiedra(){
		return inventario.get(6).sacarElemento();
	}
	public Almacenable sacarPicoDeMadera(){
		return inventario.get(7).sacarElemento();
	}
	public Almacenable sacarPicoDePiedra(){
		return inventario.get(8).sacarElemento();
	}
	public Almacenable sacarPicoDeMetal(){
		return inventario.get(9).sacarElemento();
	}
	public Almacenable sacarPicoFino(){
		return inventario.get(10).sacarElemento();
	}
*/
	/*
	public Almacenable usarMadera(){
		return inventario.get(0).usarElemento();
	}
	public Almacenable usarPiedra(){
		return inventario.get(1).usarElemento();
	}
	public Almacenable usarMetal(){
		return inventario.get(2).usarElemento();
	}
	public Almacenable usarDiamante(){
		return inventario.get(3).usarElemento();
	}
	public Almacenable usarHachaDeMadera(){
		return inventario.get(4).usarElemento();
	}
	public Almacenable usarHachaDeMetal(){
		return inventario.get(5).usarElemento();
	}
	public Almacenable usarHachaDePiedra(){
		return inventario.get(6).usarElemento();
	}
	public Almacenable usarPicoDeMadera(){
		return inventario.get(7).usarElemento();
	}
	public Almacenable usarPicoDePiedra(){
		return inventario.get(8).usarElemento();
	}
	public Almacenable usarPicoDeMetal(){
		return inventario.get(9).usarElemento();
	}
	public Almacenable usarPicoFino(){
		return inventario.get(10).usarElemento();
	}


*/

	/*
	public int cantidadDeMadera(){
		return inventario.get("class Madera").size();
	}
	public int cantidadDePiedra(){
		return inventario.get("class Madera").size();
	}
	public int cantidadDeMetal(){
		return inventario.get("class Madera").size();
	}
	public int cantidadDeDiamante(){
		return inventario.get("class Madera").size();
	}
	public int cantidadDeHachaDeMadera(){
		return inventario.get("class Madera").size();
	}
	public int cantidadDeHachaDeMetal(){
		return inventario.get("class Madera").size();
	}
	public int cantidadDeHachaDePiedra(){
		return inventario.get("class HacheDeMetal").size();
	}
	public int cantidadDePicoDeMadera(){
		return inventario.get("class PicoDeMadera").size();
	}
	public int cantidadDePicoDePiedra(){
		return inventario.get("class PicoDePiedra").size();
	}
	public int cantidadDePicoDeMetal(){
		return inventario.get("class PicoDeMetal").size();
	}
	public int cantidadDePicoFino(){
		return inventario.get("class PicoFino").size();
	}*/

	/*
	public int durabilidadHachaDeMadera(){
		return inventario.get(4).devolverDurabilidad();
	}
	public int durabilidadHachaDePiedra(){
		return inventario.get(5).devolverDurabilidad();
	}
	public int durabilidadHachaDeMetal(){
		return inventario.get(6).devolverDurabilidad();
	}
	public int durabilidadPicoDeMadera(){
		return inventario.get(7).devolverDurabilidad();
	}
	public int durabilidadPicoDePiedra(){
		return inventario.get(8).devolverDurabilidad();
	}
	public int durabilidadPicoDeMetal(){
		return inventario.get(9).devolverDurabilidad();
	}
	public int durabilidadPicoFino(){
		return inventario.get(10).devolverDurabilidad();
	}

*/
}
