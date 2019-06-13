public class EstadoCeldaVacia implements EstadoCelda{
	@Override
	public boolean ocupada(){
		return false;
	}
	/*@Override
	public void vaciar(){
		//Excepcion o no vaciamos lo que ya esta vacio
		return;
	}*/
}