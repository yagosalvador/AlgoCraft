public class Inventario{
	
	private int maxInventario=30; //por si queremos cambiar el tamaño de la mochila, pero no creo que haga falta ni ahi
	
	private Contenedor contenedor[maxInventario];
	

	
	public void agregarItem(Item unItem){
		
		int i=0;
		while(this.contenedor[i].estaVacio=0)
			i++;
		this.contenedor[i].agregarItem(unItem);
		
	}
	
	public Item quitarItem(int posicionItem){
		
		Item aQuitar = new Item;
		aQuitar = this.contenedor[posicionItem].quitarItem();
		
		return aQuitar;		
	}
}

private class Contenedor{
	
	private Item contenido;
	
	private Contenedor(){ 
		this.contenido=null;
	}

	public boolean estaVacio(){
		
		return (contenido==null);
	}
	
	public void agregarItem(Item unItem){
		
		if(this.estaVacio())
			this.contenido=unItem;
		
	}
	
	public Item quitarItem(){
		
		Item aQuitar = new Item;
		aQuitar = this.contenido;
		this.contenido=null;
		
		return aQuitar;
	}
}